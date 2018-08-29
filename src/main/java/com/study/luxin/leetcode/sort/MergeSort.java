package com.study.luxin.leetcode.sort;

/**
 * Created by lx on 08/07/2018.
 * https://www.cnblogs.com/chengxiao/p/6194356.html
 */
public class MergeSort {


    public void merge(int[] array ,int l,int m,int r,int[] tmp){

        int k=m+1;
        int p=0;

        while(l<=m&&k<=r){
            if(array[l]<array[k]){
                tmp[p++]=array[l++];
            }else{
                tmp[p++]=array[k++];
            }
        }

        while(l<=m){
            tmp[p++] = array[l++];
        }


        while(k<=r){
            tmp[p++] = array[k++];
        }
    }





}
