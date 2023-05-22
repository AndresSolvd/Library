package com.solvd.threads;

public class MyRunnableThread implements Runnable{

    private final String name;

    public MyRunnableThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " seconds from 10 seconds to finish the reading of book" + name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
