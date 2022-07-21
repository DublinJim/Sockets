package com.jamesMkeogh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String [] args) throws IOException {
        System.out.println("Server started");

        ServerSocket serverSocket = new ServerSocket(9489);
        System.out.println("server awaiting request");
        Socket socket= serverSocket.accept();
        System.out.println("Client connected");

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = bufferedReader.readLine();
        System.out.println("Client data "+str);


    }
}
