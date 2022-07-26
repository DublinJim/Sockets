package com.jamesMkeogh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class InteractiveServer {

    private static final int PORT = 9090;
    private static final String[] names = {"Joe", "Mick", "Bob", "Paddy", "Mack", "Pippy"};
    private static final String[] desc = {"fat", "ugly", "fit", "smart", "happy", "stupid"};

    public static void main(String[] args) throws IOException {

        ServerSocket listener = new ServerSocket(PORT);
        System.out.println("[SERVER} is waiting for client connection...");
        Socket client = listener.accept();
        System.out.println("[SERVER} is connected to client.");

        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));

        out.println(getRandomName());

        System.out.println("[SERVER} Sent data:  closing ...");

        closeSockets(listener, client);

    }


    private static void closeSockets(ServerSocket listener, Socket client) throws IOException {
        client.close();
        listener.close();
    }

    public static String getRandomName() {
        int posName = (int) (Math.random() * names.length);
        String name = names[posName];
        int posDesc = (int) (Math.random() * desc.length);
        String des = desc[posDesc];

        return name + " " + des;
    }

}
