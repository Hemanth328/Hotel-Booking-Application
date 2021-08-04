package com.sweethome.microservice.booking.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponseDTO {

    @JsonProperty
    String message;
    @JsonProperty
    int statusCode;

    public ErrorResponseDTO(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
