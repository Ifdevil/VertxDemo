package com.lover;

import io.vertx.core.Vertx;

/**
 * Running blocking code
 */
public class RunningBlockingCode {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.executeBlocking(future -> {
            // Call some blocking API that takes a significant amount of time to return
            String result = blockingMethod("hello");
            future.complete(result);
        }, res -> {
            System.out.println("The result is: " + res.result());
        });
    }

    private static String blockingMethod(String str){
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str;
    }
}
