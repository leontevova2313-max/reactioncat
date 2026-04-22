/*
 * Decompiled with CFR.
 */
package net.sydneyclient.phobos;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.CountDownLatch;
import net.sydneyclient.phobos.utils.CryptoHelper;

public class AuthSocket {
    private static final int PORT = 8080;
    private static final String USER_DATA;

    public static void initialize() {
        CountDownLatch latch = new CountDownLatch(1);
        System.out.println("[Phobos-Server] [Socket] Starting...");
        Thread thread = new Thread(() -> AuthSocket.runServer(latch));
        thread.start();
        try {
            latch.await();
        }
        catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("A critical error has occurred while trying to start the server thread!", exception);
        }
        System.out.println("[Phobos-Server] [Socket] Successfully started!");
    }

    private static void runServer(CountDownLatch latch) {
        try (ServerSocket serverSocket = new ServerSocket(8080);){
            latch.countDown();
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    new Thread(() -> AuthSocket.handleClient(clientSocket)).start();
                }
                catch (Exception e) {
                    if (serverSocket.isClosed()) continue;
                    System.err.println("Error accepting connection: " + e.getMessage());
                }
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("A critical error has occurred while trying to start the server!", exception);
        }
    }

    /*
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void handleClient(Socket socket) {
        try (Socket v12 = socket;
             InputStream in = socket.getInputStream();){
            OutputStream out;
            block33: {
                int n;
                byte[] buffer;
                block32: {
                    block31: {
                        out = socket.getOutputStream();
                        buffer = new byte[1024];
                        n = in.read(buffer);
                        if (n != -1) break block31;
                        if (out == null) return;
                        out.close();
                        return;
                    }
                    out.write(AuthSocket.hexToBytes("0b0000002f00000003030201"));
                    out.flush();
                    n = in.read(buffer);
                    if (n != -1) break block32;
                    if (out == null) return;
                    out.close();
                    return;
                }
                out.write(AuthSocket.hexToBytes("040000002e00"));
                out.flush();
                out.write(AuthSocket.hexToBytes("7f0000001c000000075355434345535300000060" + USER_DATA + "00000008537061726b794b52280000001b0000002068747470733a2f2f692e696d6775722e636f6d2f614144317644622e6a706567"));
                out.flush();
                out.write(AuthSocket.hexToBytes("140000002c0000000bc2a7626b77786478c2a77200"));
                out.flush();
                n = in.read(buffer);
                if (n != -1) break block33;
                if (out == null) return;
                out.close();
                return;
            }
            try {
                try {
                    out.write(AuthSocket.hexToBytes("68000000199fdc8b1f6d7889be64506d8c9ff7afc50cb54ae76a6269635982817a252d7a490ef8e4c43c829da659e79e89cca36789839a30f49220e78b5fc165ba9baae545000000206138346335643666613438393164663233303865666237333538643532616636"));
                    out.flush();
                    System.out.println("[Phobos-Server] [Socket] The authentication sequence has successfully been completed.");
                    return;
                }
                catch (Exception e) {
                    System.err.println("[Phobos-Server] [Socket] An error has occurred while completing the authentication sequence: " + e.getMessage());
                    return;
                }
            }
            catch (Throwable v4) {
                throw v4;
            }
            finally {
                if (out != null) {
                    out.close();
                }
            }
        }
        catch (Exception v12) {
            // empty catch block
        }
    }

    private static byte[] hexToBytes(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        int i = 0;
        while (i < len) {
            data[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
            i += 2;
        }
        return data;
    }

    static {
        String userType = "Beta";
        Instant expiration = Instant.now().plus(6767L, ChronoUnit.DAYS).plus(6767L, ChronoUnit.HOURS).plus(6767L, ChronoUnit.MINUTES);
        String formattedExpiration = DateTimeFormatter.ISO_INSTANT.format(expiration);
        String launches = "67";
        String userData = CryptoHelper.encrypt(userType + "+" + formattedExpiration + "+" + launches);
        byte[] bytes = userData.getBytes(StandardCharsets.UTF_8);
        StringBuilder hex = new StringBuilder();
        byte[] v7 = bytes;
        int i8 = v7.length;
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                USER_DATA = hex.toString().toLowerCase();
                return;
            }
            byte b = v7[i9];
            hex.append(String.format("%02x", b));
            ++i9;
        }
    }
}

