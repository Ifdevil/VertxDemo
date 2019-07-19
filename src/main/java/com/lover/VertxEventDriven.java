package com.lover;

import io.vertx.core.Vertx;

public class VertxEventDriven {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        //定时
        vertx.setPeriodic(1000,id ->{
            System.out.println("Time fired");
        });
    }
}
