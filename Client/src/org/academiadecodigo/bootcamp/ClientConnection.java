package org.academiadecodigo.bootcamp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by codecadet on 26/06/17.
 */
public class ClientConnection {
    private Socket socket;
    private BufferedOutputStream outputStream;
    private BufferedInputStream inputStream;

    public void connect() throws IOException {
        socket = new Socket("localhost", 9999);
    }

    public void startStreams() throws IOException {
        outputStream = new BufferedOutputStream(socket.getOutputStream());
        inputStream = new BufferedInputStream(socket.getInputStream());
    }

    public void writeToServer() throws IOException {
        Scanner scanner =new Scanner(System.in);
        String something = scanner.nextLine();
        byte[] bytes = something.getBytes();
        outputStream.write(bytes);
        outputStream.flush();
    }

    public void readFromServer() throws IOException {
        String string;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(br.readLine());
    }
}
