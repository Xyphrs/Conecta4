package com.company.Connection;

import com.company.Game.Tablero;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connect4ThreadServer implements Runnable {
    Socket clientSocket1;
    Socket clientSocket2;
    int player;
    ObjectInputStream in1;
    ObjectOutputStream out1;
    ObjectInputStream in2;
    ObjectOutputStream out2;
    Tablero msgEntrant = new Tablero();
    boolean acabat;

    public Connect4ThreadServer(Socket clientSocket1, Socket clientSocket2) throws IOException {
        this.clientSocket1 = clientSocket1;
        this.clientSocket2 = clientSocket2;
        acabat = false;
        in1 = new ObjectInputStream(clientSocket1.getInputStream());
        out1 = new ObjectOutputStream(clientSocket1.getOutputStream());
        in2 = new ObjectInputStream(clientSocket2.getInputStream());
        out2 = new ObjectOutputStream(clientSocket2.getOutputStream());
    }

    @Override
    public void run() {
        try {
            out1.writeObject(msgEntrant);
            out1.flush();
            while(!acabat) {
                player++;
                if (player == 1) {
                    msgEntrant = (Tablero) in1.readObject();
                    out2.writeObject(msgEntrant);
                    out2.flush();
                } else if (player == 2) {
                    msgEntrant = (Tablero) in2.readObject();
                    out1.writeObject(msgEntrant);
                    out1.flush();
                    player = 0;
                }
            }
        } catch(IOException | ClassNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        }

        try {
            clientSocket1.close();
            clientSocket2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
