package com.logAnalyser.logAnalyser.model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "HOSTINFO")
@GenericGenerator(name="hostgen",strategy = "increment")
public class HostDataEntity {

    @Id
    @GeneratedValue(generator = "hostgen")
    @Column(name ="HOSTID")
    //Primary Key
    Integer hostId; //variable to make every record unique

    @Column(name="HOST_PATH", nullable = false)
    String hostPath;    //variable for host_path name

    @Column(name = "USERNAME", nullable = true)
    String userName; // variable for host_username

    @Column(name ="PASSWORD", nullable = true)
    String password;    // variable for host_password

    @Column(name="TIME_FREQUENCY", nullable = false)
    Integer timeFrequency; // variable for timeFrequency, required for controller agent

    //Constructor

    public HostDataEntity() {
    }

    public HostDataEntity(String hostPath, String userName, String password, Integer timeFrequency) {
        this.hostPath = hostPath;
        this.userName = userName;
        this.password = password;
        this.timeFrequency = timeFrequency;
    }

    //Getter and Setter Method

    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
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

    public Integer getTimeFrequency() {
        return timeFrequency;
    }

    public void setTimeFrequency(Integer timeFrequency) {
        this.timeFrequency = timeFrequency;
    }

    public Integer getHostId() {
        return hostId;
    }
}
