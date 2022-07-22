package com.jamesMkeogh;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DateServer {

    private static final int PORT = 9090;


    public static void main(String[] args) throws IOException {

        ServerSocket listener = new ServerSocket(PORT);
        System.out.println("[SERVER} is waiting for client connection...");
        Socket client = listener.accept();
        System.out.println("[SERVER} is connected to client.");
        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
        String msg = "out";
        /*  out.println((new Date()).toString());*/
        out.println(msg);
        System.out.println("[SERVER} Sent date object");

        client.close();
        listener.close();

    }

}
