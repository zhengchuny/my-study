package com.study.luxin.deginpattern.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lx on 09/04/2018.
 * https://my.oschina.net/huangyong/blog/159788
 */
public class ProxyHandler implements InvocationHandler {

    private Object target;

    //绑定委托对象，并返回代理类
    public <T> T bind(Object target) {
        this.target = target;
        //绑定该类实现的所有接口，取得代理类
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(target, args);
        //在调用具体函数方法后，执行功能处理
        return result;
    }


    @Test
    public void proxyTest() {
        ProxyHandler proxyHandler = new ProxyHandler();

        Subject subject = proxyHandler.bind(new RealSubject());

        subject.doSomething();
    }


}
