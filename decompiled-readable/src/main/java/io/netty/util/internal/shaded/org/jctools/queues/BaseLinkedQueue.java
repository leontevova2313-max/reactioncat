/*
 * Decompiled with CFR.
 */
package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2;
import io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueueUtil;
import java.util.Iterator;

abstract class BaseLinkedQueue<E>
extends BaseLinkedQueuePad2<E> {
    BaseLinkedQueue() {
    }

    @Override
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    protected final LinkedQueueNode<E> newNode() {
        return new LinkedQueueNode<E>();
    }

    protected final LinkedQueueNode<E> newNode(E e) {
        return new LinkedQueueNode<E>(e);
    }

    @Override
    public final int size() {
        int size;
        LinkedQueueNode<E> chaserNode = this.lvConsumerNode();
        LinkedQueueNode<E> producerNode = this.lvProducerNode();
        for (size = 0; chaserNode != producerNode && chaserNode != null && size < Integer.MAX_VALUE; ++size) {
            LinkedQueueNode<E> next = chaserNode.lvNext();
            if (next == chaserNode) {
                return size;
            }
            chaserNode = next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        LinkedQueueNode<E> producerNode;
        LinkedQueueNode<E> consumerNode = this.lvConsumerNode();
        return consumerNode == (producerNode = this.lvProducerNode());
    }

    protected E getSingleConsumerNodeValue(LinkedQueueNode<E> currConsumerNode, LinkedQueueNode<E> nextNode) {
        E nextValue = nextNode.getAndNullValue();
        currConsumerNode.soNext(currConsumerNode);
        this.spConsumerNode(nextNode);
        return nextValue;
    }

    @Override
    public E poll() {
        LinkedQueueNode<E> currConsumerNode = this.lpConsumerNode();
        LinkedQueueNode<E> nextNode = currConsumerNode.lvNext();
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
        LinkedQueueNode<E> currConsumerNode = this.lpConsumerNode();
        LinkedQueueNode<E> nextNode = currConsumerNode.lvNext();
        if (nextNode != null) {
            return nextNode.lpValue();
        }
        if (currConsumerNode != this.lvProducerNode()) {
            nextNode = this.spinWaitForNextNode(currConsumerNode);
            return nextNode.lpValue();
        }
        return null;
    }

    LinkedQueueNode<E> spinWaitForNextNode(LinkedQueueNode<E> currNode) {
        LinkedQueueNode<E> nextNode;
        while ((nextNode = currNode.lvNext()) == null) {
        }
        return nextNode;
    }

    @Override
    public E relaxedPoll() {
        LinkedQueueNode<E> currConsumerNode = this.lpConsumerNode();
        LinkedQueueNode<E> nextNode = currConsumerNode.lvNext();
        if (nextNode != null) {
            return this.getSingleConsumerNodeValue(currConsumerNode, nextNode);
        }
        return null;
    }

    @Override
    public E relaxedPeek() {
        LinkedQueueNode<E> nextNode = this.lpConsumerNode().lvNext();
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
        LinkedQueueNode<E> chaserNode = this.lpConsumerNode();
        int i = 0;
        while (i < limit) {
            LinkedQueueNode<E> nextNode = chaserNode.lvNext();
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

