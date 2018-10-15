package com.project.models;

import com.project.models.Enums.EOrientation;
import com.project.models.Enums.ESeat;

public class Seat {
    long ID ;
    int row;
    int column;
    EOrientation orientation;
    ESeat state;

    public Seat() {
    }

    public Seat(long ID, int row, int column, EOrientation orientation, ESeat state) {
        this.ID = ID;
        this.row = row;
        this.column = column;
        this.orientation = orientation;
        this.state = state;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public long getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public EOrientation getOrientation() {
        return orientation;
    }

    public void setOrientation(EOrientation orientation) {
        this.orientation = orientation;
    }

    public ESeat getState() {
        return state;
    }

    public void setState(ESeat state) {
        this.state = state;
    }
}
