/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group050;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_156;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group024.SecureClass0414;
import org.phobos.secure.group034.SecureClass0607;
import org.phobos.secure.group042.SecureClass0754;

public class SecureClass0901 {
    public final /* synthetic */ Set<String> field001;
    public static final /* synthetic */ Map<Character, Character> field002;
    public final /* synthetic */ List<SecureClass0607> field003;
    public final /* synthetic */ MutableObject<SecureClass0607> field004;
    public final /* synthetic */ MutableObject<SecureClass0414> field005;

    public /* synthetic */ SecureClass0901() {
        this.field001 = new HashSet<String>();
        this.field003 = new ArrayList<SecureClass0607>();
        this.field004 = new MutableObject();
        this.field005 = new MutableObject();
    }

    public static /* bridge */ /* synthetic */ String ZcisTdMpKQPHDgrDeXWENEFGNfux8YUA(String nx6HCJGDqSwE8wQS6zD7eZLhYvPlll2l) {
        StringBuilder field006 = new StringBuilder();
        char field007 = '0';
        if (SecureClass0754.mBxWTgETqhCAeWxlmjWRFlwrfUPPlIXf(() -> 1.0)) {
            return nx6HCJGDqSwE8wQS6zD7eZLhYvPlll2l.toUpperCase();
        }
        char[] cArray = nx6HCJGDqSwE8wQS6zD7eZLhYvPlll2l.toCharArray();
        int n = cArray.length;
        int n2 = 0;
        while (n2 < n) {
            Character c;
            char field008 = cArray[n2];
            boolean field009 = Character.isUpperCase(field008);
            if (Character.isLetter(field008) && field007 == ' ' && !field009 && SecureClass0754.mBxWTgETqhCAeWxlmjWRFlwrfUPPlIXf(() -> 30.0)) {
                field008 = Character.toUpperCase(field008);
            }
            field006.append(field008);
            if (SecureClass0754.mBxWTgETqhCAeWxlmjWRFlwrfUPPlIXf(() -> SecureClass0754.YtqevunbqODMWEQcUuAAwnmQSoAzbore(2.3, 7.5)) && field008 != field007 && (c = field002.get(Character.valueOf(Character.toLowerCase(field008)))) != null) {
                field006.append(field009 ? Character.toUpperCase(c.charValue()) : c.charValue());
            }
            field007 = field008;
            ++n2;
        }
        return field006.toString();
    }

    static {
        field002 = (Map)class_156.method_654(new HashMap<K, V>(), Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN -> {
            Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN.put(Character.valueOf('r'), Character.valueOf('t'));
            Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN.put(Character.valueOf('g'), Character.valueOf('h'));
            Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN.put(Character.valueOf('n'), Character.valueOf('m'));
            Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN.put(Character.valueOf('a'), Character.valueOf('s'));
            Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN.put(Character.valueOf('t'), Character.valueOf('g'));
            Q37RHxBFZ2G59BNiJ3HrgC4JV3lZYEYN.put(Character.valueOf('i'), Character.valueOf('o'));
        });
    }
}

