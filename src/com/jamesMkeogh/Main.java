package com.jamesMkeogh;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        /*  String ip = "192.168.180.118";*/
        String locahHost = "localhost";
        String msg ="outbound";
        int port; //0 -1023 to 65535
        port = 9489;
        Socket socket = new Socket(locahHost, port);
        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter out = new PrintWriter(os);

        // write your code here
    }
}
