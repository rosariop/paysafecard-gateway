package de.polito.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.polito.payment.dto.RedirectDTO;

public class InitResponse {

    private String object;
    private String id;
    private long created;
    private long updated;
    private double amount;
    private String currency;
    private String status;
    @JsonProperty("redirect")
    private RedirectResponseDTO responseDTO;
    @JsonProperty("customer")
    private CustomerDTO customerDTO;
    @JsonProperty("notification_url")
    private String notificationUrl;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RedirectResponseDTO getResponseDTO() {
        return responseDTO;
    }

    public void setResponseDTO(RedirectResponseDTO responseDTO) {
        this.responseDTO = responseDTO;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public String getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }
}
