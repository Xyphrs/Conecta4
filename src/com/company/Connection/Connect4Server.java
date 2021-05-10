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
        Socket clientSocket;

        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                clientSocket = serverSocket.accept();
                Connect4ThreadServer FilServidor = new Connect4ThreadServer(clientSocket);
                Thread client = new Thread(FilServidor);
                client.start();
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
