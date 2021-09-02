package com.ksuryawa.java8features.LambdaExpression;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
       /* Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(
                            "Hello World from Thread ["
                            + Thread.currentThread().getName()
                            +"]"
                    );
                }
            }
        };*/

        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(
                        "Hello World from Thread ["
                                + Thread.currentThread().getName()
                                + i + "]"
                );
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

    }
}
