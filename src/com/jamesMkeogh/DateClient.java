package com.jamesMkeogh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class DateClient {

    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 9090;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader( new InputStreamReader(socket.getInputStream()));

        String serverResponse = input.readLine();
        JOptionPane.showMessageDialog(null, serverResponse);
        System.out.println(serverResponse);
        socket.close();

        System.exit(0);
    }

}
