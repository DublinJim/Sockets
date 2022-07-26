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
        new InputStreamReader(socket.getInputStream());
        String msg = input.readLine();
        System.out.println(msg);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        socket.close();
        System.exit(0);


    }

}
