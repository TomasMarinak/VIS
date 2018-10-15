package com.project.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private long cardNumber;
    private double actualAmount;
    private List<Payment> payments = new ArrayList<>();

    public Account() {

    }

    public Account(long cardNumber, double actualAmount, List<Payment> payments) {
        this.cardNumber = cardNumber;
        this.actualAmount = actualAmount;
        this.payments = payments;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
