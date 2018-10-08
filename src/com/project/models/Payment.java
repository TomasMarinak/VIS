package com.project.models;

import com.project.models.Enums.EPayment;

public class Payment {
    EPayment state;
    Long amount;
    String currency;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
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
