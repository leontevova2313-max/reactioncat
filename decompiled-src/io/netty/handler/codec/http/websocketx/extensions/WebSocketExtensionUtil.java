/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.http.websocketx.extensions;

import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WebSocketExtensionUtil {
    private static final String EXTENSION_SEPARATOR = ",";
    private static final String PARAMETER_SEPARATOR = ";";
    private static final char PARAMETER_EQUAL = '=';
    private static final Pattern PARAMETER = Pattern.compile("^([^=]+)(=[\\\"]?([^\\\"]+)[\\\"]?)?$");

    static boolean isWebsocketUpgrade(HttpHeaders headers) {
        return headers.contains(HttpHeaderNames.UPGRADE) && headers.containsValue(HttpHeaderNames.CONNECTION, HttpHeaderValues.UPGRADE, true) && headers.contains(HttpHeaderNames.UPGRADE, HttpHeaderValues.WEBSOCKET, true);
    }

    public static List<WebSocketExtensionData> extractExtensions(String extensionHeader) {
        String[] rawExtensions = extensionHeader.split(EXTENSION_SEPARATOR);
        if (rawExtensions.length <= 0) {
            return Collections.emptyList();
        }
        ArrayList<WebSocketExtensionData> extensions = new ArrayList<WebSocketExtensionData>(rawExtensions.length);
        String[] stringArray = rawExtensions;
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            Map<String, String> parameters;
            String rawExtension = stringArray[n2];
            String[] extensionParameters = rawExtension.split(PARAMETER_SEPARATOR);
            String name = extensionParameters[0].trim();
            if (extensionParameters.length > 1) {
                parameters = new HashMap<K, V>(extensionParameters.length - 1);
                for (int i = 1; i < extensionParameters.length; ++i) {
                    String parameter = extensionParameters[i].trim();
                    Matcher parameterMatcher = PARAMETER.matcher(parameter);
                    if (!parameterMatcher.matches() || parameterMatcher.group(1) == null) continue;
                    parameters.put(parameterMatcher.group(1), parameterMatcher.group(3));
                }
            } else {
                parameters = Collections.emptyMap();
            }
            extensions.add(new WebSocketExtensionData(name, parameters));
            ++n2;
        }
        return extensions;
    }

    static String computeMergeExtensionsHeaderValue(String userDefinedHeaderValue, List<WebSocketExtensionData> extraExtensions) {
        Iterator<WebSocketExtensionData> iterator;
        StringBuilder sb;
        List<Object> userDefinedExtensions = userDefinedHeaderValue != null ? WebSocketExtensionUtil.extractExtensions(userDefinedHeaderValue) : Collections.emptyList();
        Iterator<Object> iterator2 = userDefinedExtensions.iterator();
        while (true) {
            int i;
            WebSocketExtensionData matchingExtra;
            WebSocketExtensionData userDefined;
            if (iterator2.hasNext()) {
                userDefined = (WebSocketExtensionData)iterator2.next();
                matchingExtra = null;
            } else {
                sb = new StringBuilder(150);
                iterator = extraExtensions.iterator();
                break;
            }
            for (i = 0; i < extraExtensions.size(); ++i) {
                WebSocketExtensionData extra = extraExtensions.get(i);
                if (!extra.name().equals(userDefined.name())) continue;
                matchingExtra = extra;
                break;
            }
            if (matchingExtra == null) {
                extraExtensions.add(userDefined);
                continue;
            }
            HashMap<String, String> mergedParameters = new HashMap<String, String>(matchingExtra.parameters());
            mergedParameters.putAll(userDefined.parameters());
            extraExtensions.set(i, new WebSocketExtensionData(matchingExtra.name(), mergedParameters));
        }
        while (iterator.hasNext()) {
            WebSocketExtensionData data = iterator.next();
            sb.append(data.name());
            for (Map.Entry<String, String> parameter : data.parameters().entrySet()) {
                sb.append(PARAMETER_SEPARATOR);
                sb.append(parameter.getKey());
                if (parameter.getValue() == null) continue;
                sb.append('=');
                sb.append(parameter.getValue());
            }
            sb.append(EXTENSION_SEPARATOR);
        }
        if (!extraExtensions.isEmpty()) {
            sb.setLength(sb.length() - EXTENSION_SEPARATOR.length());
        }
        return sb.toString();
    }

    private WebSocketExtensionUtil() {
    }
}

