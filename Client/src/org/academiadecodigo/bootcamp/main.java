package org.academiadecodigo.bootcamp;

import java.io.IOException;

/**
 * Created by codecadet on 26/06/17.
 */
public class main /*extends Application */ {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//    }

    public static void main(String[] args) {
        ClientConnection serverConnection = new ClientConnection();
        try {
            serverConnection.connect();
            serverConnection.startStreams();
            serverConnection.writeToServer();
            serverConnection.readFromServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
