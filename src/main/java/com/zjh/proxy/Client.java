package com.zjh.proxy;

/**
 * 基于接口的动态代理
 * Proxy
 * InvokeHandler
 */
public class Client {
    public static void main(String[] args) {
        IProducer producer = new Producer();

        ProducerHandler producerHandler = new ProducerHandler();
        IProducer proxyObject = (IProducer) producerHandler.getProxyObject(producer);

        proxyObject.saleProduct(100f);

    }
}
