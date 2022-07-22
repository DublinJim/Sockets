package com.jamesMkeogh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Server started");

        var serverSocket = new ServerSocket(7489);
        System.out.println("server awaiting request");
        Socket s = serverSocket.accept();
        System.out.println("Client connected");

        var br = new BufferedReader(
            new InputStreamReader(s.getInputStream()));
        System.out.println("passed the buffered creation");
        String str = br.readLine();

        System.out.println("Client data " + str);

        s.close();
        serverSocket.close();

    }
}
