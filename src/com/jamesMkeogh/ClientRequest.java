package com.jamesMkeogh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientRequest {

    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 9090;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        while (true) {
            System.out.println("> ");
            String command = keyboard.readLine();
            out.println(command);
            if (command == "quit")
                break;
            String serverResponse = input.readLine();
            System.out.println(serverResponse);
        }

        socket.close();
        System.exit(0);


    }

}
