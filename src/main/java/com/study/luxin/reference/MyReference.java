package com.study.luxin.reference;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.lang.ref.SoftReference;
import java.util.List;

public class MyReference {


    @Test
    public void referenceTest() {
        // 强引用,instance指向new Object的内存块假如是10000
        Object instance = new Object();
        // 对instance的软引用,垃圾回收不会回收instance因为上面对它是强引用
        // 软引用对象指向10000
        SoftReference<Object> softReference = new SoftReference<Object>(instance);

        // instance->null
        instance = null;

        // softReference对象的引用对象->10000,现在变成了软引用.
        Object ref = softReference.get();
    }


    @Test
    public void softReferenceRecycledBeforeOutOfMem() {
        SoftReference<Object> softReference = new SoftReference<Object>(new Object());
        List<Integer> list = Lists.newArrayList();
        try {
            for (int i = 0; i < 1000000; i++) {
                list.add(i);
            }
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
        Object instance = softReference.get();
        Assert.assertNull(instance);
    }


    @Test
    public void stronglyReachableSoftReferenceTest() {
        SoftReference<Object> softReference = new SoftReference<Object>(new Object());

        // 强可达
        Object instance = softReference.get();

        List<Integer> list = Lists.newArrayList();
        try {
            for (int i = 0; i < 1000000; i++) {
                list.add(i);
            }
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }

        Assert.assertNotNull(softReference.get());
        // 强可达,且被使用,是不会被清除的
        System.out.println(instance);
    }


}
