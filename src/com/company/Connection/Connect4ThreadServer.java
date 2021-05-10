package com.company.Connection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connect4ThreadServer implements Runnable {
    Socket clientSocket;
    ObjectInputStream in;
    ObjectOutputStream out;
    Object msgEntrant, msgSortint;
    boolean acabat;

    public Connect4ThreadServer(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
        acabat = false;
        in = new ObjectInputStream(clientSocket.getInputStream());
        out = new ObjectOutputStream(clientSocket.getOutputStream());

    }

    @Override
    public void run() {
        try {
            while(!acabat) {
                msgEntrant = in.readObject();
                msgSortint = generateMove(msgEntrant);
                out.writeObject(msgSortint);
                out.flush();
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        }
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object generateMove(Object en) {
        en = "Funciona la Conexion";
        return en;
    }
}
