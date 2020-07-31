package com.zjh.proxy.cglib;

import com.zjh.proxy.IProducer;
import com.zjh.proxy.ProducerHandler;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        Producer producer = new Producer();


        /**
         *create 方法参数
         *  class：字节码
         *          指定被代理对象的字节码
         *   callback：提供增强代码，一般使用MethodInterceptor子类
         */
        Producer cgligProducer = (Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            /**
             *
             * @param o
             * @param method
             * @param objects
             * @param methodProxy
             * 以上三个参数 和基于接口的动态代理的invoke方法参数是一样的
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                Float monty =(Float) objects[0];

                //2、判断当前方法是不是销售
                if ("saleProduct".equals(method.getName())){
                    System.out.println("代理商收费： "+monty);
                    result = method.invoke(producer,monty*0.8f);
                }else {
                    result = method.invoke(producer,objects);
                }

                return  result;
            }
        });
        cgligProducer.saleProduct(1200f);
    }
}
