package com.company.Game;

public class CheckWinner {

    public static String checkWinnerX(String[][] tablero) {

        /*Combinaciones horizontales*/

        String ganadorX;
        if (tablero[0][0].equals("X" + "|") && tablero[0][1].equals("X" + "|") && tablero[0][2].equals("X" + "|") && tablero[0][3].equals("X")) {
            ganadorX = "haganadox";
            return ganadorX;
        } else if (tablero[1][0].equals("X" + "|") && tablero[1][1].equals("X" + "|") && tablero[1][2].equals("X" + "|") && tablero[1][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[2][0].equals("X" + "|") && tablero[2][1].equals("X" + "|") && tablero[2][2].equals("X" + "|") && tablero[2][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[3][0].equals("X" + "|") && tablero[3][1].equals("X" + "|") && tablero[3][2].equals("X" + "|") && tablero[3][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[4][0].equals("X" + "|") && tablero[4][1].equals("X" + "|") && tablero[4][2].equals("X" + "|") && tablero[4][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[0][1].equals("X" + "|") && tablero[0][2].equals("X" + "|") && tablero[0][3].equals("X" + "|") && tablero[0][4].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }

        /*Combinaciones verticales*/

        else if (tablero[0][0].equals("X" + "|") && tablero[1][0].equals("X" + "|") && tablero[2][0].equals("X" + "|") && tablero[3][0].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[0][1].equals("X" + "|") && tablero[1][1].equals("X" + "|") && tablero[2][1].equals("X" + "|") && tablero[3][1].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[0][2].equals("X" + "|") && tablero[1][2].equals("X" + "|") && tablero[2][2].equals("X" + "|") && tablero[3][2].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[0][3].equals("X" + "|") && tablero[1][3].equals("X" + "|") && tablero[2][3].equals("X" + "|") && tablero[3][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        }else if (tablero[0][4].equals("X" + "|") && tablero[1][4].equals("X" + "|") && tablero[2][4].equals("X" + "|") && tablero[3][4].equals("X" + "|") ) {

        }

        /*Combinaciones cruz*/

        else if (tablero[0][0].equals("X" + "|") && tablero[1][1].equals("X" + "|") && tablero[2][2].equals("X" + "|") && tablero[3][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        } else if (tablero[0][1].equals("X" + "|") && tablero[1][2].equals("X" + "|") && tablero[2][3].equals("X" + "|") && tablero[3][4].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        } else if (tablero[1][0].equals("X" + "|") && tablero[2][1].equals("X" + "|") && tablero[3][2].equals("X" + "|") && tablero[4][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        } else if (tablero[4][0].equals("X" + "|") && tablero[3][1].equals("X" + "|") && tablero[2][2].equals("X" + "|") && tablero[1][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        } else if (tablero[3][0].equals("X" + "|") && tablero[2][1].equals("X" + "|") && tablero[1][2].equals("X" + "|") && tablero[0][3].equals("X" + "|") ) {
            ganadorX = "haganadox";
            return ganadorX;
        } else if (tablero[4][1].equals("X" + "|") && tablero[3][2].equals("X" + "|") && tablero[2][3].equals("X" + "|") && tablero[1][4].equals("X" + "|") ) {

        }
        return "null";
    }

    public static String checkWinnerO(String[][] tablero) {

        /*Combinaciones horizontales*/

        String ganadorO;
        if (tablero[0][0].equals("O" + "|") && tablero[0][1].equals("O" + "|") && tablero[0][2].equals("O" + "|") && tablero[0][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        } else if (tablero[1][0].equals("O" + "|") && tablero[1][1].equals("O" + "|") && tablero[1][2].equals("O" + "|") && tablero[1][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }else if (tablero[2][0].equals("O" + "|") && tablero[2][1].equals("O" + "|") && tablero[2][2].equals("O" + "|") && tablero[2][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }else if (tablero[3][0].equals("O" + "|") && tablero[3][1].equals("O" + "|") && tablero[3][2].equals("O" + "|") && tablero[3][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }else if (tablero[4][0].equals("O" + "|") && tablero[4][1].equals("O" + "|") && tablero[4][2].equals("X" + "|") && tablero[4][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }else if (tablero[0][1].equals("O" + "|") && tablero[0][2].equals("O" + "|") && tablero[0][3].equals("O" + "|") && tablero[0][4].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }

        /*Combinaciones verticales*/

        else if (tablero[0][0].equals("O" + "|") && tablero[1][0].equals("O" + "|") && tablero[2][0].equals("O" + "|") && tablero[3][0].equals("O" + "|") ) {
            System.out.println("Winner O");
        }else if (tablero[0][1].equals("O" + "|") && tablero[1][1].equals("O" + "|") && tablero[2][1].equals("O" + "|") && tablero[3][1].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }else if (tablero[0][2].equals("O" + "|") && tablero[1][2].equals("O" + "|") && tablero[2][2].equals("O" + "|") && tablero[3][2].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }else if (tablero[0][3].equals("O" + "|") && tablero[1][3].equals("O" + "|") && tablero[2][3].equals("O" + "|") && tablero[3][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }
        else if (tablero[0][4].equals("O" + "|") && tablero[1][4].equals("O" + "|") && tablero[2][4].equals("O" + "|") && tablero[3][4].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }

        /*Combinaciones cruz*/

        else if (tablero[0][0].equals("O" + "|") && tablero[1][1].equals("O" + "|") && tablero[2][2].equals("O" + "|") && tablero[3][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        } else if (tablero[0][1].equals("O" + "|") && tablero[1][2].equals("O" + "|") && tablero[2][3].equals("O" + "|") && tablero[3][4].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        } else if (tablero[1][0].equals("O" + "|") && tablero[2][1].equals("O" + "|") && tablero[3][2].equals("O" + "|") && tablero[4][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        } else if (tablero[4][0].equals("O" + "|") && tablero[3][1].equals("O" + "|") && tablero[2][2].equals("O" + "|") && tablero[1][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        } else if (tablero[3][0].equals("O" + "|") && tablero[2][1].equals("O" + "|") && tablero[1][2].equals("O" + "|") && tablero[0][3].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        } else if (tablero[4][1].equals("O" + "|") && tablero[3][2].equals("O" + "|") && tablero[2][3].equals("O" + "|") && tablero[1][4].equals("O" + "|") ) {
            ganadorO = "haganadoo";
            return ganadorO;
        }

        return "null";

    }

//            0.0 | 0.1 |0.2|0.3|0.4
//            1.0 | 1.1 |1.2|1.3|1.4
//            2.0 | 2.1 |2.2|2.3|2.4
//            3.0 | 3.1 |3.2|3.3|3.4
//            4.0 | 4.1 |4.2|4.3|4.4
}
