package com.lover;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

/**
 * Vertx实现一个简单的Http服务
 */
public class MyHttpServe {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();

        HttpServer server = vertx.createHttpServer();

        server.requestHandler(request -> {
            request.response().end("Hello world");
        }).listen(8080);
    }
}
