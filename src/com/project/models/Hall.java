package com.project.models;

import java.util.ArrayList;
import java.util.List;

public class Hall {

    private Long id ;
    private List<Seat> seats = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private String name;
    private String address;

    public Hall(Long id/*, List<Seat> seats, List<Event> events*/, String name, String address) {
        this.id = id;
    //    this.seats = seats;
      //  this.events = events;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hall() {
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
