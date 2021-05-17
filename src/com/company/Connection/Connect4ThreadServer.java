package com.company.Connection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connect4ThreadServer implements Runnable {
    Socket clientSocket1;
    Socket clientSocket2;
    ObjectInputStream in1;
    ObjectOutputStream out1;
    ObjectInputStream in2;
    ObjectOutputStream out2;
    Object msgEntrant;
    Object msgSortint;
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
            while(!acabat) {
                msgEntrant = in1.readObject();
                msgSortint = generateMove(msgEntrant);
                out1.writeObject(msgSortint);
                out1.flush();

                msgEntrant = in2.readObject();
                msgSortint = generateMove(msgEntrant);
                out2.writeObject(msgSortint);
                out2.flush();
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

    public Object generateMove(Object en) {
        en = "Funciona la Conexion";
        return en;
    }
}
