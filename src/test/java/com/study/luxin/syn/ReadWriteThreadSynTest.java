package com.study.luxin.syn;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ReadWriteThreadSynTest {
    class SynObject {
        int i = 0;

        public SynObject() {
            while (i < 10) {
                i += i;
            }
        }

        public synchronized void setI(int i) throws InterruptedException {
            TimeUnit.SECONDS.sleep(10);
            this.i = i;
        }

        public int getI() throws InterruptedException {
            TimeUnit.SECONDS.sleep(5);
            return i;
        }
    }

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 4, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    /**
     * 读线程先读,但没有加锁,然后写线程加锁了,读线程是否需要等待?
     */
    @Test
    public void test() throws InterruptedException {
        SynObject synObject = new SynObject();
        threadPoolExecutor.execute(() -> {
            try {
                System.out.println("read thread. i = " + synObject.getI());
            } catch (InterruptedException e) {

            }
        });

        TimeUnit.SECONDS.sleep(1);
        threadPoolExecutor.execute(() -> {
            try {
                synObject.setI(100);
            } catch (InterruptedException e) {

            }
        });
    }


}
