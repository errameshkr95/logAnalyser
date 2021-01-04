package com.logAnalyser.logAnalyser.dto.request;

public class UserDataRequest {
    String userName;
    String password;
    String email;
    Long mobileNo;

    //Constructor

    //default Constructor
    public UserDataRequest() {
    }

    public UserDataRequest(String userName, String password, String email, long mobileNo) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }
}
