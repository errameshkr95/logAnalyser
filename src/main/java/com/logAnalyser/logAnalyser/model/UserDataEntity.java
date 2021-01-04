package com.logAnalyser.logAnalyser.model;

import com.logAnalyser.logAnalyser.dto.request.UserDataRequest;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "USERINFO")
@GenericGenerator(name="usergen",strategy = "increment")
public class UserDataEntity {
    @Id
    @GeneratedValue(generator = "usergen")
    @Column(name ="USERID")
    //Primary Key
    Integer userId; //variable to make every record unique

    @Column(name = "USERNAME", nullable = false,unique = true)
    String userName; // variable for user_username

    @Column(name ="PASSWORD", nullable = false)
    String password;    // variable for user user_password

    @Column(name="EMAIL", nullable = false)
    String email;    //variable for user_email

    @Column(name="MOBILE_NO", nullable = false)
    Long mobileNo; // variable for user_mobileNO

    //constructor

    public UserDataEntity() {
    }

    public UserDataEntity(String userName, String password, String email, Long mobileNo) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    //getter and setter method

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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
