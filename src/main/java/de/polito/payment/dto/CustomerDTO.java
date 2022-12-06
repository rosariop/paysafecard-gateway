package de.polito.payment.dto;

public class CustomerDTO {

    private String id;

    public CustomerDTO() {
    }

    public CustomerDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
