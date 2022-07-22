package com.jamesMkeogh;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        String localhost = "localhost";
        String msg = "out";

        int port; //0 -1023 to 65535
        port = 7489;

        Socket socket = new Socket(ip, port);

        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.write(msg);
        out.flush();

    }
}
