/*
 * Decompiled with CFR.
 */
package net.sydneyclient.phobos;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import net.sydneyclient.phobos.utils.ChecksumHelper;

public class AuthHttpServer {
    private static final int PORT = 7565;

    public static void initialize() {
        String checksum;
        CountDownLatch latch = new CountDownLatch(1);
        System.out.println("[Phobos-Server] [HTTP] Generating mod file checksum...");
        try {
            checksum = ChecksumHelper.getMD5Checksum(ChecksumHelper.getModFile());
        }
        catch (Exception exception) {
            throw new RuntimeException("A critical error has occurred while trying to generate the checksum for the mod file!", exception);
        }
        Thread thread = new Thread(() -> AuthHttpServer.runServer(latch, checksum));
        thread.start();
        try {
            latch.await();
        }
        catch (InterruptedException exception2) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("A critical error has occurred while trying to start the server thread!", exception2);
        }
        System.out.println("[Phobos-Server] [HTTP] Successfully started!");
    }

    private static void runServer(CountDownLatch latch, String checksum) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(7565), 0);
            server.createContext("/api/v1/client/signature", exchange -> AuthHttpServer.sendResponse(exchange, checksum));
            server.createContext("/api/v2/protection/manage", exchange -> AuthHttpServer.sendResponse(exchange, ""));
            server.createContext("/api/v2/protection/table", exchange -> AuthHttpServer.sendResponse(exchange, ""));
            server.createContext("/api/v1/client/report", exchange -> AuthHttpServer.sendResponse(exchange, ""));
            server.setExecutor(Executors.newCachedThreadPool());
            server.start();
            latch.countDown();
        }
        catch (IOException exception) {
            throw new RuntimeException("A critical error has occurred while trying to start the HTTP server!", exception);
        }
    }

    private static void sendResponse(HttpExchange exchange, String response) {
        byte[] bytes = response.getBytes();
        exchange.sendResponseHeaders(200, bytes.length == 0 ? -1L : (long)bytes.length);
        try (OutputStream stream = exchange.getResponseBody();){
            if (bytes.length > 0) {
                stream.write(bytes);
            }
        }
        exchange.close();
    }
}

