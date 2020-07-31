package com.zjh.proxy;

public class Producer implements IProducer {

    @Override
    public void saleProduct(float money) {
        System.out.println("商品销售出去，收费 "+money);
    }

    @Override
    public void afterServer(float money) {
        System.out.println("售后服务，收费 "+money);


    }
}
