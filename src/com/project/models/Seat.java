package com.project.models;

import com.project.models.Enums.ESeat;

public class Seat {
    long ID ;
    long position;
    ESeat state;

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public ESeat getState() {
        return state;
    }

    public void setState(ESeat state) {
        this.state = state;
    }
}
