package com.project.models;

import com.project.models.Enums.EPayment;

public class Payment {

    private Long ID;
    private EPayment state;
    private Double amount;
    private String currency;
    private Long customer_id;


    public Payment() {
    }

    public Payment(Long ID, EPayment state, Double amount, String currency, Long customer_id) {
        this.ID = ID;
        this.state = state;
        this.amount = amount;
        this.currency = currency;
        this.customer_id = customer_id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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
