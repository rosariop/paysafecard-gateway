package de.polito.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedirectDTO {

    @JsonProperty("success_url")
    private String successUrl;

    @JsonProperty("failure_url")
    private String failureUrl;

    public RedirectDTO() {
    }

    public RedirectDTO(String successUrl, String failureUrl) {
        this.successUrl = successUrl;
        this.failureUrl = failureUrl;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getFailureUrl() {
        return failureUrl;
    }

    public void setFailureUrl(String failureUrl) {
        this.failureUrl = failureUrl;
    }
}
