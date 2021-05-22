package com.company.Connection;

import com.company.Game.Jugada;
import com.company.Game.Tablero;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect4Client extends Thread {
    Scanner scanner = new Scanner(System.in);
    Tablero t;
    String result;
    Jugada j = new Jugada();
    String hostname;
    boolean notFinished = true;
    int port;

    public Connect4Client(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void run() {
        Tablero serverdata;
        Socket socket;
        ObjectOutputStream out;
        ObjectInputStream in;
        try {
            socket = new Socket(InetAddress.getByName(hostname), port);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            while (notFinished) {
                System.out.println("--------------------------------");
                serverdata = (Tablero) in.readObject();
                t = serverdata;
                t.print();

                result = t.checkWinner(t);
                if (result.equals("haganadox")) {
                    System.out.println("Ganador X");
                    break;
                } else if (result.equals("haganadoo")) {
                    System.out.println("Ganador 0");
                    break;
                }

                if (serverdata != null) {
                    System.out.println("Selecciona una columna");
                    j.setColumn(scanner.nextInt());
                    System.out.println("Selecciona una linea");
                    j.setRow(scanner.nextInt());

                    out.writeObject(t.mover(t, j));
                    out.flush();
                    t.print();
                    result = t.checkWinner(t);
                    if (result.equals("haganadox")) {
                        System.out.println("Ganador X");
                        break;
                    } else if (result.equals("haganadoo")) {
                        System.out.println("Ganador 0");
                        break;
                    }
                }
            }
            close(socket);
        } catch (UnknownHostException ex) {
            System.out.println("Error de connexió. No existeix el host: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de connexió indefinit: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void close(Socket socket){
        try {
            if(socket!=null && !socket.isClosed()){
                if(!socket.isInputShutdown()){
                    socket.shutdownInput();
                }
                if(!socket.isOutputShutdown()){
                    socket.shutdownOutput();
                }
                socket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Connect4Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Connect4Client clientTcp = new Connect4Client("localhost",5558);
        clientTcp.start();
    }
}
