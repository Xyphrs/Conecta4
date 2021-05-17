package com.company.Connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect4Server {
    int port;

    public Connect4Server(int port ) {
        this.port = port;
    }

    public void listen() {
        ServerSocket serverSocket;
        Socket clientSocket1;
        Socket clientSocket2 = null;

        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                clientSocket1 = serverSocket.accept();

                if (clientSocket1 != null) {
                    clientSocket2 = serverSocket.accept();
                }

                if (clientSocket1 != null && clientSocket2 != null) {
                    Connect4ThreadServer threadServer = new Connect4ThreadServer(clientSocket1, clientSocket2);
                    Thread thread = new Thread(threadServer);
                    thread.start();
                }
                System.out.println("Socket 1 => " + clientSocket1);
                System.out.println("Socket 2 => " + clientSocket2);
            }
        } catch (IOException ex) {
            Logger.getLogger(Connect4Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Connect4Server srv = new Connect4Server(5558);
        srv.listen();
    }
}
