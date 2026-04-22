/*
 * Decompiled with CFR.
 */
package io.netty.handler.ipfilter;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.ipfilter.AbstractRemoteAddressFilter;
import io.netty.handler.ipfilter.IpFilterRule;
import io.netty.handler.ipfilter.IpFilterRuleType;
import io.netty.util.internal.ObjectUtil;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ChannelHandler.Sharable
public class RuleBasedIpFilter
extends AbstractRemoteAddressFilter<InetSocketAddress> {
    private final boolean acceptIfNotFound;
    private final List<IpFilterRule> rules;

    public RuleBasedIpFilter(IpFilterRule ... rules) {
        this(true, rules);
    }

    public RuleBasedIpFilter(boolean acceptIfNotFound, IpFilterRule ... rules) {
        ObjectUtil.checkNotNull(rules, "rules");
        this.acceptIfNotFound = acceptIfNotFound;
        this.rules = new ArrayList<IpFilterRule>(rules.length);
        IpFilterRule[] ipFilterRuleArray = rules;
        int n = ipFilterRuleArray.length;
        int n2 = 0;
        while (n2 < n) {
            IpFilterRule rule = ipFilterRuleArray[n2];
            if (rule != null) {
                this.rules.add(rule);
            }
            ++n2;
        }
        return;
    }

    @Override
    protected boolean accept(ChannelHandlerContext ctx, InetSocketAddress remoteAddress) throws Exception {
        IpFilterRule rule;
        Iterator<IpFilterRule> iterator = this.rules.iterator();
        do {
            if (iterator.hasNext()) continue;
            return this.acceptIfNotFound;
        } while (!(rule = iterator.next()).matches(remoteAddress));
        return rule.ruleType() == IpFilterRuleType.ACCEPT;
    }
}

