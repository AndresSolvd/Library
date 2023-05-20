package com.solvd.threads;

public class MT10Seconds implements Runnable{

    private final String name;

    public MT10Seconds(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " seconds from 10 seconds to finish the reading of book" + name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
