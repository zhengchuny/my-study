package com.study.luxin;

import java.io.*;
import java.net.URISyntaxException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import junit.framework.Test;

/**
 * Created by lx on 06/12/2017.
 */
public class CallerRunTest {


    static ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1), new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {


        //FileReader fileReader = new FileReader(new File(this.getClass().getClassLoader().getResources("")));







        for (int i = 0; i < 10; i++) {
            executor.execute(()->{

                System.out.println(Thread.currentThread().getId());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }


    }


    /**/////////////**/


    public void test() throws IOException, URISyntaxException {

        FileReader fileReader = new FileReader(new File(getClass().getClassLoader().getResource("").toURI()));


        BufferedReader reader = new BufferedReader(fileReader);



        reader.readLine();







    }











}
