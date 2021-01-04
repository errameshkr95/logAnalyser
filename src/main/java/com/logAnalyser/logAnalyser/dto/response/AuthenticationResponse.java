package com.logAnalyser.logAnalyser.dto.response;

public class AuthenticationResponse {
    public final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

}
