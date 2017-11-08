package com.study.luxin;

/**
 * Created by luxin on 2017/11/5.
 * effective java第8条
 * 重写equals方法,同时必须重写hashcode方法
 */
public class OverrideEquals {
    private String str;


    @Override
    //对称性,任何两个对象关于比较两个对象是否相等都应该一样
    public boolean equals(Object o){


        if(o instanceof OverrideEquals){
            return ((OverrideEquals) o).str.equals(str);
        }else if(o instanceof String){
            str.equals(o);
        }


        return true;
    }





}
