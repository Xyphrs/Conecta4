package com.company.Game;

import java.io.Serializable;

public class Jugada implements Serializable {
    public static final long serialVersionUID = 1L;
    int column;
    int row;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
