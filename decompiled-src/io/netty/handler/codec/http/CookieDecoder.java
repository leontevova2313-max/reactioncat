/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.http;

import io.netty.handler.codec.DateFormatter;
import io.netty.handler.codec.http.Cookie;
import io.netty.handler.codec.http.CookieUtil;
import io.netty.handler.codec.http.DefaultCookie;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Deprecated
public final class CookieDecoder {
    private final InternalLogger logger = InternalLoggerFactory.getInstance(this.getClass());
    private static final CookieDecoder STRICT = new CookieDecoder(true);
    private static final CookieDecoder LAX = new CookieDecoder(false);
    private static final String COMMENT = "Comment";
    private static final String COMMENTURL = "CommentURL";
    private static final String DISCARD = "Discard";
    private static final String PORT = "Port";
    private static final String VERSION = "Version";
    private final boolean strict;

    public static Set<Cookie> decode(String header) {
        return CookieDecoder.decode(header, true);
    }

    public static Set<Cookie> decode(String header, boolean strict) {
        return (strict ? STRICT : LAX).doDecode(header);
    }

    /*
     * Unable to fully structure code
     */
    private Set<Cookie> doDecode(String header) {
        names = new ArrayList<String>(8);
        values = new ArrayList<String>(8);
        CookieDecoder.extractKeyValuePairs(header, names, values);
        if (names.isEmpty()) {
            return Collections.emptySet();
        }
        version = 0;
        if (((String)names.get(0)).equalsIgnoreCase("Version")) {
            try {
                version = Integer.parseInt((String)values.get(0));
            }
            catch (NumberFormatException var6_5) {
                // empty catch block
            }
            i = 1;
        } else {
            i = 0;
        }
        if (names.size() <= i) {
            return Collections.emptySet();
        }
        cookies = new TreeSet<Cookie>();
        block4: while (i < names.size()) {
            name = (String)names.get(i);
            value = (String)values.get(i);
            if (value == null) {
                value = "";
            }
            if ((c = this.initCookie(name, value)) == null) break;
            discard = false;
            secure = false;
            httpOnly = false;
            comment = null;
            commentURL = null;
            domain = null;
            path = null;
            maxAge = -9223372036854775808L;
            ports = new ArrayList<Integer>(2);
            j = i + 1;
            while (true) {
                if (j >= names.size()) ** GOTO lbl-1000
                name = (String)names.get(j);
                value = (String)values.get(j);
                if ("Discard".equalsIgnoreCase(name)) {
                    discard = true;
                } else if ("Secure".equalsIgnoreCase(name)) {
                    secure = true;
                } else if ("HTTPOnly".equalsIgnoreCase(name)) {
                    httpOnly = true;
                } else if ("Comment".equalsIgnoreCase(name)) {
                    comment = value;
                } else if ("CommentURL".equalsIgnoreCase(name)) {
                    commentURL = value;
                } else if ("Domain".equalsIgnoreCase(name)) {
                    domain = value;
                } else if ("Path".equalsIgnoreCase(name)) {
                    path = value;
                } else if ("Expires".equalsIgnoreCase(name)) {
                    date = DateFormatter.parseHttpDate(value);
                    if (date != null) {
                        maxAgeMillis = date.getTime() - System.currentTimeMillis();
                        maxAge = maxAgeMillis / 1000L + (long)(maxAgeMillis % 1000L != 0L ? 1 : 0);
                    }
                } else if ("Max-Age".equalsIgnoreCase(name)) {
                    maxAge = Integer.parseInt(value);
                } else if ("Version".equalsIgnoreCase(name)) {
                    version = Integer.parseInt(value);
                } else {
                    if ("Port".equalsIgnoreCase(name)) {
                        var22_23 = portList = value.split(",");
                        var23_24 = var22_23.length;
                    } else lbl-1000:
                    // 2 sources

                    {
                        c.setVersion(version);
                        c.setMaxAge(maxAge);
                        c.setPath(path);
                        c.setDomain(domain);
                        c.setSecure(secure);
                        c.setHttpOnly(httpOnly);
                        if (version > 0) {
                            c.setComment(comment);
                        }
                        if (version > 1) {
                            c.setCommentUrl(commentURL);
                            c.setPorts(ports);
                            c.setDiscard(discard);
                        }
                        cookies.add(c);
                        ++i;
                        continue block4;
                    }
                    for (var24_25 = 0; var24_25 < var23_24; ++var24_25) {
                        s1 = var22_23[var24_25];
                        try {
                            ports.add(Integer.valueOf(s1));
                            continue;
                        }
                        catch (NumberFormatException var26_27) {
                            // empty catch block
                        }
                    }
                }
                ++j;
                ++i;
            }
        }
        return cookies;
    }

    private static void extractKeyValuePairs(String header, List<String> names, List<String> values) {
        int headerLen = header.length();
        int i = 0;
        block10: while (i != headerLen) {
            switch (header.charAt(i)) {
                case '\t': 
                case '\n': 
                case '\u000b': 
                case '\f': 
                case '\r': 
                case ' ': 
                case ',': 
                case ';': {
                    ++i;
                    continue block10;
                }
            }
            while (i != headerLen) {
                String value;
                String name;
                block25: {
                    if (header.charAt(i) == '$') {
                        ++i;
                        continue;
                    }
                    if (i == headerLen) {
                        name = null;
                        value = null;
                    } else {
                        boolean hadBackslash;
                        char q;
                        StringBuilder newValueBuf;
                        char c;
                        int newNameStart = i;
                        block12: while (true) {
                            switch (header.charAt(i)) {
                                case ';': {
                                    name = header.substring(newNameStart, i);
                                    value = null;
                                    break block25;
                                }
                                case '=': {
                                    name = header.substring(newNameStart, i);
                                    if (++i == headerLen) {
                                        value = "";
                                    } else {
                                        int newValueStart = i;
                                        c = header.charAt(i);
                                        if (c == '\"' || c == '\'') {
                                            newValueBuf = new StringBuilder(header.length() - i);
                                            q = c;
                                            hadBackslash = false;
                                            ++i;
                                            break block12;
                                        }
                                        int semiPos = header.indexOf(59, i);
                                        if (semiPos > 0) {
                                            value = header.substring(newValueStart, semiPos);
                                            i = semiPos;
                                        } else {
                                            value = header.substring(newValueStart);
                                            i = headerLen;
                                        }
                                    }
                                    break block25;
                                }
                                default: {
                                    if (++i != headerLen) continue block12;
                                    name = header.substring(newNameStart);
                                    value = null;
                                    break block25;
                                }
                            }
                            break;
                        }
                        block13: while (true) {
                            if (i == headerLen) {
                                value = newValueBuf.toString();
                                break;
                            }
                            if (hadBackslash) {
                                hadBackslash = false;
                                c = header.charAt(i++);
                                switch (c) {
                                    case '\"': 
                                    case '\'': 
                                    case '\\': {
                                        newValueBuf.setCharAt(newValueBuf.length() - 1, c);
                                        continue block13;
                                    }
                                }
                                newValueBuf.append(c);
                                continue;
                            }
                            if ((c = header.charAt(i++)) == q) {
                                value = newValueBuf.toString();
                                break;
                            }
                            newValueBuf.append(c);
                            if (c != '\\') continue;
                            hadBackslash = true;
                        }
                    }
                }
                names.add(name);
                values.add(value);
                continue block10;
            }
            break block10;
        }
    }

    private CookieDecoder(boolean strict) {
        this.strict = strict;
    }

    private DefaultCookie initCookie(String name, String value) {
        boolean wrap;
        int invalidOctetPos;
        if (name == null || name.length() == 0) {
            this.logger.debug("Skipping cookie with null name");
            return null;
        }
        if (value == null) {
            this.logger.debug("Skipping cookie with null value");
            return null;
        }
        CharSequence unwrappedValue = CookieUtil.unwrapValue(value);
        if (unwrappedValue == null) {
            this.logger.debug("Skipping cookie because starting quotes are not properly balanced in '{}'", (Object)unwrappedValue);
            return null;
        }
        if (this.strict && (invalidOctetPos = CookieUtil.firstInvalidCookieNameOctet(name)) >= 0) {
            if (this.logger.isDebugEnabled()) {
                this.logger.debug("Skipping cookie because name '{}' contains invalid char '{}'", (Object)name, (Object)Character.valueOf(name.charAt(invalidOctetPos)));
            }
            return null;
        }
        boolean bl = wrap = unwrappedValue.length() != value.length();
        if (this.strict && (invalidOctetPos = CookieUtil.firstInvalidCookieValueOctet(unwrappedValue)) >= 0) {
            if (this.logger.isDebugEnabled()) {
                this.logger.debug("Skipping cookie because value '{}' contains invalid char '{}'", (Object)unwrappedValue, (Object)Character.valueOf(unwrappedValue.charAt(invalidOctetPos)));
            }
            return null;
        }
        DefaultCookie cookie = new DefaultCookie(name, unwrappedValue.toString());
        cookie.setWrap(wrap);
        return cookie;
    }
}

