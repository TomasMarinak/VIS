package com.project.models;

import com.project.models.Enums.EPayment;

public class Payment {
    long ID;
    EPayment state;
    Double amount;
    String currency;
    User  customer;


    public Payment() {
    }

    public Payment(long ID, EPayment state, Double amount, String currency, User customer) {
        this.ID = ID;
        this.state = state;
        this.amount = amount;
        this.currency = currency;
        this.customer = customer;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public EPayment getState() {
        return state;
    }

    public void setState(EPayment state) {
        this.state = state;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
