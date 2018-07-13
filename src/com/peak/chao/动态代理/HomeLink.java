package com.peak.chao.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HomeLink implements InvocationHandler {

    private Object target;


    public <T> T getInstance(T target) {
        Num.getInstance().a = 1;
        this.target = target;
        Class clazz = target.getClass();
        T obj = (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return obj;
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        Num.getInstance().a = 2;
        System.out.println("我是链家，我帮别人找房子..");
        //第一个参数是target,也就是被代理类的对象；第二个参数是方法中的参数
        method.invoke(target, args);
        Num.getInstance().a = 3;
        System.out.println("我是链家，已经找完了..");
        return null;
    }
}