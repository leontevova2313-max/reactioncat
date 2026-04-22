/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.class_310;
import net.minecraft.class_320;
import org.phobos.mixin.IMinecraftClient;
import org.phobos.secure.group061.SecureClass1120;
import org.phobos.secure.group030.SecureClass0524;
import org.phobos.secure.group044.SecureClass0788;
import org.phobos.secure.group053.SecureClass0958;

public final class SecureClass0310
extends Enum<SecureClass0310> {
    public static final /* synthetic */ SecureClass0310[] $VALUES;
    public static final /* synthetic */ URL MC_TOKEN_URL;
    public static final /* synthetic */ String CLIENT_ID = "00000000402b5328";
    public static final /* synthetic */ URL AUTH_TOKEN_URL;
    public static final /* synthetic */ Pattern PPFT_REGEX;
    public static final /* synthetic */ URL XSTS_TOKEN_URL;
    public static final /* synthetic */ String REDIRECT_URI_ENCODED = "https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf";
    public static final /* synthetic */ URL PROFILE_URL;
    public static final /* synthetic */ String SCOPE_ENCODED = "service%3A%3Auser.auth.xboxlive.com%3A%3AMBI_SSL";
    public static final /* synthetic */ URL LOGIN_URL;
    public static final /* synthetic */ URL XBL_TOKEN_URL;
    public static final /* synthetic */ Pattern AUTHCODE_REGEX;
    public static final /* synthetic */ Pattern URLPOST_REGEX;
    public static final /* synthetic */ String SCOPE_UNENCODED = "service::user.auth.xboxlive.com::MBI_SSL";

    public static /* bridge */ /* synthetic */ SecureClass0524 getXBLToken(String msftAccessToken) throws SecureClass0788 {
        JsonObject properties = new JsonObject();
        properties.addProperty("AuthMethod", "RPS");
        properties.addProperty("SiteName", "user.auth.xboxlive.com");
        properties.addProperty("RpsTicket", msftAccessToken);
        JsonObject postData = new JsonObject();
        postData.addProperty("RelyingParty", "http://auth.xboxlive.com");
        postData.addProperty("TokenType", "JWT");
        postData.add("Properties", (JsonElement)properties);
        String request = postData.toString();
        try {
            URLConnection connection = XBL_TOKEN_URL.openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            try (OutputStream out = connection.getOutputStream();){
                out.write(request.getBytes(StandardCharsets.US_ASCII));
            }
            JsonObject json = SecureClass0958.WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(connection).getAsJsonObject();
            String token = json.get("Token").getAsString();
            String uhs = json.get("DisplayClaims").getAsJsonObject().get("xui").getAsJsonArray().get(0).getAsJsonObject().get("uhs").getAsString();
            return new SecureClass0524(token, uhs);
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e), e);
        }
    }

    public static /* bridge */ /* synthetic */ String getXSTSToken(String xblToken) throws SecureClass0788 {
        JsonArray tokens = new JsonArray();
        tokens.add(xblToken);
        JsonObject properties = new JsonObject();
        properties.addProperty("SandboxId", "RETAIL");
        properties.add("UserTokens", (JsonElement)tokens);
        JsonObject postData = new JsonObject();
        postData.addProperty("RelyingParty", "rp://api.minecraftservices.com/");
        postData.addProperty("TokenType", "JWT");
        postData.add("Properties", (JsonElement)properties);
        String request = postData.toString();
        try {
            URLConnection connection = XSTS_TOKEN_URL.openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            try (OutputStream out = connection.getOutputStream();){
                out.write(request.getBytes(StandardCharsets.US_ASCII));
            }
            JsonObject json = SecureClass0958.WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(connection).getAsJsonObject();
            return json.get("Token").getAsString();
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e), e);
        }
    }

    public static /* bridge */ /* synthetic */ SecureClass0310[] $values() {
        return new SecureClass0310[0];
    }

    public static /* bridge */ /* synthetic */ String getMinecraftAccessToken(String uhs, String xstsToken) throws SecureClass0788 {
        JsonObject postData = new JsonObject();
        postData.addProperty("identityToken", "XBL3.0 x=" + uhs + ";" + xstsToken);
        String request = postData.toString();
        try {
            URLConnection connection = MC_TOKEN_URL.openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            try (OutputStream out = connection.getOutputStream();){
                out.write(request.getBytes(StandardCharsets.US_ASCII));
            }
            JsonObject json = SecureClass0958.WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(connection).getAsJsonObject();
            return json.get("access_token").getAsString();
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e), e);
        }
    }

    public static /* bridge */ /* synthetic */ String getMicrosoftAccessToken(String authCode) throws SecureClass0788 {
        HashMap<String, String> postData = new HashMap<String, String>();
        postData.put("client_id", CLIENT_ID);
        postData.put("code", authCode);
        postData.put("grant_type", "authorization_code");
        postData.put("redirect_uri", "https://login.live.com/oauth20_desktop.srf");
        postData.put("scope", SCOPE_UNENCODED);
        byte[] field001 = SecureClass0310.urlEncodeMap(postData).getBytes(StandardCharsets.UTF_8);
        try {
            HttpURLConnection connection = (HttpURLConnection)AUTH_TOKEN_URL.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            connection.setDoOutput(true);
            try (OutputStream out = connection.getOutputStream();){
                out.write(field001);
            }
            JsonObject json = SecureClass0958.WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(connection).getAsJsonObject();
            return json.get("access_token").getAsString();
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e), e);
        }
    }

    public static /* bridge */ /* synthetic */ UUID uuidFromJson(String jsonUUID) {
        String withDashes = jsonUUID.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5");
        return UUID.fromString(withDashes);
    }

    public static /* bridge */ /* synthetic */ SecureClass1120 getAccount(String email, String password) throws SecureClass0788 {
        String authCode = SecureClass0310.getAuthorizationCode(email, password);
        String msftAccessToken = SecureClass0310.getMicrosoftAccessToken(authCode);
        SecureClass0524 xblToken = SecureClass0310.getXBLToken(msftAccessToken);
        String xstsToken = SecureClass0310.getXSTSToken(xblToken.W30jLRPKYdlzWqrBlBUzMS5r96haByI3());
        String mcAccessToken = SecureClass0310.getMinecraftAccessToken(xblToken.cfr_renamed_372(), xstsToken);
        return SecureClass0310.getMinecraftProfile(mcAccessToken);
    }

    static {
        $VALUES = SecureClass0310.$values();
        LOGIN_URL = SecureClass0310.createURL("https://login.live.com/oauth20_authorize.srf?client_id=00000000402b5328&response_type=code&scope=service%3A%3Auser.auth.xboxlive.com%3A%3AMBI_SSL&redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf");
        AUTH_TOKEN_URL = SecureClass0310.createURL("https://login.live.com/oauth20_token.srf");
        XBL_TOKEN_URL = SecureClass0310.createURL("https://user.auth.xboxlive.com/user/authenticate");
        XSTS_TOKEN_URL = SecureClass0310.createURL("https://xsts.auth.xboxlive.com/xsts/authorize");
        MC_TOKEN_URL = SecureClass0310.createURL("https://api.minecraftservices.com/authentication/login_with_xbox");
        PROFILE_URL = SecureClass0310.createURL("https://api.minecraftservices.com/minecraft/profile");
        PPFT_REGEX = Pattern.compile("sFTTag: ?'.*value=\"(.*)\"/>");
        URLPOST_REGEX = Pattern.compile("urlPost: ?'(.+?(?='))");
        AUTHCODE_REGEX = Pattern.compile("[?|&]code=([\\w.-]+)");
    }

    public static /* bridge */ /* synthetic */ SecureClass0310[] values() {
        return (SecureClass0310[])$VALUES.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass0310() {
        void field002;
        void field003;
    }

    public static /* bridge */ /* synthetic */ SecureClass1120 getMinecraftProfile(String mcAccessToken) throws SecureClass0788 {
        try {
            URLConnection connection = PROFILE_URL.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + mcAccessToken);
            System.out.println("Getting UUID and name...");
            JsonObject json = SecureClass0958.WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(connection).getAsJsonObject();
            if (json.has("error")) {
                throw new SecureClass0788("Error message from api.minecraftservices.com:\n" + String.valueOf(json.get("error")));
            }
            UUID uuid = SecureClass0310.uuidFromJson(json.get("id").getAsString());
            String name = json.get("name").getAsString();
            return new SecureClass1120(uuid, name, mcAccessToken);
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e), e);
        }
    }

    public static /* bridge */ /* synthetic */ String downloadData(URLConnection connection) throws IOException {
        try (InputStream input = connection.getInputStream();){
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String string = bufferedReader.lines().collect(Collectors.joining("\n"));
            return string;
        }
    }

    public static /* bridge */ /* synthetic */ void login(String email, String password) throws SecureClass0788 {
        SecureClass1120 mcProfile = SecureClass0310.getAccount(email, password);
        class_320 session = new class_320(mcProfile.getName(), mcProfile.UisSMMU7yJUXIoL0xtdEBOHmTVc231js(), mcProfile.cfr_renamed_375(), Optional.empty(), Optional.empty(), class_320.class_321.field_34962);
        ((IMinecraftClient)class_310.method_1551()).setSession(session);
    }

    public static /* bridge */ /* synthetic */ String urlEncodeMap(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (!sb.isEmpty()) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8));
            sb.append("=");
            sb.append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
        }
        return sb.toString();
    }

    public static /* bridge */ /* synthetic */ String microsoftLogin(String email, String password, String cookie, String ppft, String urlPost) throws SecureClass0788 {
        HashMap<String, String> postData = new HashMap<String, String>();
        postData.put("login", email);
        postData.put("loginfmt", email);
        postData.put("passwd", password);
        postData.put("PPFT", ppft);
        byte[] field001 = SecureClass0310.urlEncodeMap(postData).getBytes(StandardCharsets.UTF_8);
        try {
            URL url = URI.create(urlPost).toURL();
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            connection.setRequestProperty("Content-Length", "" + field001.length);
            connection.setRequestProperty("Cookie", cookie);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            try (OutputStream out = connection.getOutputStream();){
                out.write(field001);
            }
            int responseCode = connection.getResponseCode();
            if (responseCode >= 500 && responseCode <= 599) {
                throw new SecureClass0788("Servers are down (code " + responseCode + ").");
            }
            if (responseCode != 200) {
                throw new SecureClass0788("Got code " + responseCode + " from urlPost.");
            }
            String decodedUrl = URLDecoder.decode(connection.getURL().toString(), StandardCharsets.UTF_8);
            Matcher matcher = AUTHCODE_REGEX.matcher(decodedUrl);
            if (!matcher.find()) {
                throw new SecureClass0788("Didn't get authCode. (Wrong email/password?)");
            }
            return matcher.group(1);
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e));
        }
    }

    public static /* bridge */ /* synthetic */ SecureClass0310 valueOf(String name) {
        return Enum.valueOf(SecureClass0310.class, name);
    }

    public static /* bridge */ /* synthetic */ URL createURL(String url) {
        try {
            return URI.create(url).toURL();
        }
        catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* bridge */ /* synthetic */ String getAuthorizationCode(String email, String password) throws SecureClass0788 {
        String loginWebpage;
        StringBuilder cookie;
        try {
            URLConnection connection = LOGIN_URL.openConnection();
            cookie = new StringBuilder();
            List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
            if (cookies == null) {
                cookies = Collections.emptyList();
            }
            for (String c : cookies) {
                String cookieTrimmed = c.substring(0, c.indexOf(";") + 1);
                cookie.append(cookieTrimmed);
            }
            loginWebpage = SecureClass0310.downloadData(connection);
        }
        catch (IOException e) {
            throw new SecureClass0788("Connection failed: " + String.valueOf(e));
        }
        Matcher matcher = PPFT_REGEX.matcher(loginWebpage);
        if (!matcher.find()) {
            throw new SecureClass0788("sFTTag / PPFT regex failed.");
        }
        String ppft = matcher.group(1);
        matcher = URLPOST_REGEX.matcher(loginWebpage);
        if (!matcher.find()) {
            throw new SecureClass0788("urlPost regex failed.");
        }
        String urlPost = matcher.group(1);
        return SecureClass0310.microsoftLogin(email, password, cookie.toString(), ppft, urlPost);
    }
}

