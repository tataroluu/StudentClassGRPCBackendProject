package com.bilgeadam;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class OgrenciServer  {

    public static void main(String[] args) throws InterruptedException, IOException {

        Server server = ServerBuilder.forPort(9090)
                .addService(new OgrenciServiceGRPC())
                .build();

        server.start();

        System.out.println("Server started at: " + server.getPort());
        server.awaitTermination();


    }

}
