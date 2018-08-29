package com.study.luxin.deginpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lx on 09/04/2018.
 */
public class CGLibProxy implements MethodInterceptor {

    public <T> T getProxy(Class<T> tClass) {

        return (T) Enhancer.create(tClass, this);
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object result = methodProxy.invokeSuper(obj, args);

        return result;
    }
}
