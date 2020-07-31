package com.zjh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProducerHandler implements InvocationHandler {
    //被代理的对象
    private Object target;

    //获得代理对象，也就是去为被代理对象干活的对象
    public Object getProxyObject(Object target){
        this.target = target;
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("开始执行方法");
        Float monty = (Float) args[0];
        //2、判断当前方法是不是销售
        if ("saleProduct".equals(method.getName())){
            System.out.println("代理商收费： "+monty);
            result = method.invoke(target,monty*0.8f);
        }else {
            result = method.invoke(target,args);
        }

        return result;
    }
}
