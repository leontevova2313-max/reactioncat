/*
 * Decompiled with CFR.
 */
package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueueUtil;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2;
import io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode;
import java.util.Iterator;

abstract class BaseLinkedAtomicQueue<E>
extends BaseLinkedAtomicQueuePad2<E> {
    BaseLinkedAtomicQueue() {
    }

    @Override
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    protected final LinkedQueueAtomicNode<E> newNode() {
        return new LinkedQueueAtomicNode<E>();
    }

    protected final LinkedQueueAtomicNode<E> newNode(E e) {
        return new LinkedQueueAtomicNode<E>(e);
    }

    @Override
    public final int size() {
        int size;
        LinkedQueueAtomicNode<E> chaserNode = this.lvConsumerNode();
        LinkedQueueAtomicNode<E> producerNode = this.lvProducerNode();
        for (size = 0; chaserNode != producerNode && chaserNode != null && size < Integer.MAX_VALUE; ++size) {
            LinkedQueueAtomicNode<E> next = chaserNode.lvNext();
            if (next == chaserNode) {
                return size;
            }
            chaserNode = next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        LinkedQueueAtomicNode<E> producerNode;
        LinkedQueueAtomicNode<E> consumerNode = this.lvConsumerNode();
        return consumerNode == (producerNode = this.lvProducerNode());
    }

    protected E getSingleConsumerNodeValue(LinkedQueueAtomicNode<E> currConsumerNode, LinkedQueueAtomicNode<E> nextNode) {
        E nextValue = nextNode.getAndNullValue();
        currConsumerNode.soNext(currConsumerNode);
        this.spConsumerNode(nextNode);
        return nextValue;
    }

    @Override
    public E poll() {
        LinkedQueueAtomicNode<E> currConsumerNode = this.lpConsumerNode();
        LinkedQueueAtomicNode<E> nextNode = currConsumerNode.lvNext();
        if (nextNode != null) {
            return this.getSingleConsumerNodeValue(currConsumerNode, nextNode);
        }
        if (currConsumerNode != this.lvProducerNode()) {
            nextNode = this.spinWaitForNextNode(currConsumerNode);
            return this.getSingleConsumerNodeValue(currConsumerNode, nextNode);
        }
        return null;
    }

    @Override
    public E peek() {
        LinkedQueueAtomicNode<E> currConsumerNode = this.lpConsumerNode();
        LinkedQueueAtomicNode<E> nextNode = currConsumerNode.lvNext();
        if (nextNode != null) {
            return nextNode.lpValue();
        }
        if (currConsumerNode != this.lvProducerNode()) {
            nextNode = this.spinWaitForNextNode(currConsumerNode);
            return nextNode.lpValue();
        }
        return null;
    }

    LinkedQueueAtomicNode<E> spinWaitForNextNode(LinkedQueueAtomicNode<E> currNode) {
        LinkedQueueAtomicNode<E> nextNode;
        while ((nextNode = currNode.lvNext()) == null) {
        }
        return nextNode;
    }

    @Override
    public E relaxedPoll() {
        LinkedQueueAtomicNode<E> currConsumerNode = this.lpConsumerNode();
        LinkedQueueAtomicNode<E> nextNode = currConsumerNode.lvNext();
        if (nextNode != null) {
            return this.getSingleConsumerNodeValue(currConsumerNode, nextNode);
        }
        return null;
    }

    @Override
    public E relaxedPeek() {
        LinkedQueueAtomicNode<E> nextNode = this.lpConsumerNode().lvNext();
        if (nextNode != null) {
            return nextNode.lpValue();
        }
        return null;
    }

    @Override
    public boolean relaxedOffer(E e) {
        return this.offer(e);
    }

    @Override
    public int drain(MessagePassingQueue.Consumer<E> c, int limit) {
        if (null == c) {
            throw new IllegalArgumentException("c is null");
        }
        if (limit < 0) {
            throw new IllegalArgumentException("limit is negative: " + limit);
        }
        if (limit == 0) {
            return 0;
        }
        LinkedQueueAtomicNode<E> chaserNode = this.lpConsumerNode();
        int i = 0;
        while (i < limit) {
            LinkedQueueAtomicNode<E> nextNode = chaserNode.lvNext();
            if (nextNode == null) {
                return i;
            }
            E nextValue = this.getSingleConsumerNodeValue(chaserNode, nextNode);
            chaserNode = nextNode;
            c.accept(nextValue);
            ++i;
        }
        return limit;
    }

    @Override
    public int drain(MessagePassingQueue.Consumer<E> c) {
        return MessagePassingQueueUtil.drain(this, c);
    }

    @Override
    public void drain(MessagePassingQueue.Consumer<E> c, MessagePassingQueue.WaitStrategy wait, MessagePassingQueue.ExitCondition exit) {
        MessagePassingQueueUtil.drain(this, c, wait, exit);
    }

    @Override
    public int capacity() {
        return -1;
    }
}

