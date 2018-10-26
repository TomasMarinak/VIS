package com.project.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {
    private Long ID;
    private LocalDateTime date;
    private String name;
    private Byte[] photo;
    private String description;

    public Event(Long ID, LocalDateTime date, String name, String description, Hall placeOfPerforming) {
        this.ID = ID;
        this.date = date;
        this.name = name;
        this.description = description;
        this.placeOfPerforming = placeOfPerforming;
    }

    public Event() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
