package com.project.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {
    private Long ID;
    private LocalDateTime date;
    private String name;
    private Byte[] photo;

    public Event(LocalDateTime date, String name, Byte[] photo, Hall placeOfPerforming) {
        this.date = date;
        this.name = name;
        this.photo = photo;
        this.placeOfPerforming = placeOfPerforming;
    }

    public Event() {
    }

    private Hall placeOfPerforming;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    public Hall getPlaceOfPerforming() {
        return placeOfPerforming;
    }

    public void setPlaceOfPerforming(Hall placeOfPerforming) {
        this.placeOfPerforming = placeOfPerforming;
    }
}
