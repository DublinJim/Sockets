package com.jamesMkeogh;

import java.io.IOException;
import java.net.Socket;

public class DateClient {

    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 9090;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);


    }

}
