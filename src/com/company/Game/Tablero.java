package com.company.Game;

import java.io.Serializable;

public class Tablero implements Serializable {
    public static final long serialVersionUID = 1L;
    String[][] tablero = new String[5][5];
    int player = 0;

    public Tablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = "-" + "|";
            }
        }
    }

    public String[][] getTablero() {
        return tablero;
    }

    public Tablero mover(Tablero t, Jugada jugada) {
        player++;
        if (player == 1) {
            t.tablero[jugada.column][jugada.row] = "O" + "|";
        } else if (player == 2) {
            t.tablero[jugada.column][jugada.row] = "X" + "|";
            player = 0;
        }
        return t;
    }

    public String checkWinner(Tablero t) {
        String result;
        if (CheckWinner.checkWinnerX(t.tablero).equals("haganadox")) {
            result = CheckWinner.checkWinnerX(t.tablero);
            return result;
        } else if (CheckWinner.checkWinnerO(t.tablero).equals("haganadoo")) {
            result = CheckWinner.checkWinnerO(t.tablero);
            return result;
        }
        return "null";
    }

    public void print() {
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }
}
