package de.polito.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedirectResponseDTO {

    @JsonProperty("success_url")
    private String successUrl;

    @JsonProperty("failure_url")
    private String failureUrl;

    @JsonProperty("auth_url")
    private String authUrl;

    public RedirectResponseDTO() {
    }

    public RedirectResponseDTO(String successUrl, String failureUrl, String authUrl) {
        this.successUrl = successUrl;
        this.failureUrl = failureUrl;
        this.authUrl = authUrl;
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

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
}
