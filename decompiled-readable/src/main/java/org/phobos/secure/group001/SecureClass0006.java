/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group001;

public class SecureClass0006 {
    public static /* synthetic */ String[] field001;
    public static /* synthetic */ String[] field002;
    public static /* synthetic */ String[] field003;
    public static /* synthetic */ String[] field004;
    public static /* synthetic */ String[] field005;
    public static /* synthetic */ String[] field006;
    public static /* synthetic */ String[] field007;
    public static /* synthetic */ String[] field008;
    public static /* synthetic */ String[] field009;
    public static /* synthetic */ String[] field010;
    public static /* synthetic */ String[] field011;
    public static /* synthetic */ String[] field012;
    public static /* synthetic */ String field013;
    public static /* synthetic */ String[] field014;

    static {
        field005 = new String[]{"var", "val", "let", "typedef"};
        field014 = new String[]{"const", "final", "immutable"};
        field007 = new String[]{"struct", "class", "data", "classdef"};
        field011 = new String[]{"func", "def", "method", "function", "fun", "fn"};
        field002 = new String[]{"int", "integer", "int32"};
        field009 = new String[]{"double", "float", "floating", "precise"};
        field003 = new String[]{"boolean", "bl", "bool"};
        field008 = new String[]{"string", "str"};
        field001 = new String[]{"null", "nil", "nullptr"};
        field006 = new String[]{"void", "nothing", "none"};
        field004 = new String[]{"for", "foreach", "do"};
        field010 = new String[]{"break", "stop"};
        field012 = new String[]{"eventlistener", "eventhandler"};
        field013 = "^(int|integer|double|float|floating|precise|boolean|bool|bl|string|let|var|variable|typedef)\\s+(const|static|final)?\\s*([a-zA-Z_]\\w*)\\s*(=|#|=>|:)?\\s*([^;]*)\\s*;";
    }

    public static /* bridge */ /* synthetic */ boolean SJUxfVWPXpahG3zcEBVnuZ81Jvf9B8pN(String DVUoFZBtSMvMwqT8lFuHgffgTZ25aA3A) {
        String field015 = DVUoFZBtSMvMwqT8lFuHgffgTZ25aA3A.trim();
        return field015.startsWith("//") || field015.startsWith("#");
    }
}

