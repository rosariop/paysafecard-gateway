package de.polito.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitDTO {

    private double amount;

    private RedirectDTO redirect;

    private CustomerDTO customer;

    @JsonProperty("notification_url")
    private String notificationUrl;

    public InitDTO() {
    }

    public InitDTO(double amount, RedirectDTO redirect, CustomerDTO customer, String notificationUrl) {
        this.amount = amount;
        this.redirect = redirect;
        this.customer = customer;
        this.notificationUrl = notificationUrl;
    }

    public String getCurrency(){
        return "EUR";
    }

    public String getType(){
        return "PAYSAFECARD";
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public RedirectDTO getRedirect() {
        return redirect;
    }

    public void setRedirect(RedirectDTO redirect) {
        this.redirect = redirect;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public String getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }
}
