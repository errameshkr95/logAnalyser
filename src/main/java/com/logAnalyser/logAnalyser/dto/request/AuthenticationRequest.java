package com.logAnalyser.logAnalyser.dto.request;

public class AuthenticationRequest {
    //fetching userName and password from user
    String userName;    //var for userName input
    String password;    //var for password input

    //constructor

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    //Getter and Setter Method

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
