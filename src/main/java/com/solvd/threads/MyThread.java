package com.solvd.threads;

public class MyThread extends Thread {

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " seconds from 5 seconds to finish the reading of book" + name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
