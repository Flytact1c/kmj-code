package com.xd24.concurrency;

/**
 * @author shuifu
 * @version 1.0
 * @date 2020/5/14 15:38
 */
public class ThreadDemo {

        public static class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("MyThread");
            }
        }

        public static void main(String[] args) {
            Thread myThread = new MyThread();
            myThread.start();

            new Thread(() -> {
                System.out.println("Java 8 匿名内部类");
            }).start();
        }

}
