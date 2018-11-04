package com.study.luxin.deginpattern;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

public class IteratorPattern {


    class A implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }


    class B implements Iterable {


        List<String> list = Lists.newArrayList();

        @Override
        public Iterator iterator() {
            return list.iterator();
        }
    }


}
