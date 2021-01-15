package com.logAnalyser.logAnalyser.model;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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

    @Column(name = "USERNAME", nullable = true, unique = true)
    String userName; // variable for host_username

    @Column(name ="PASSWORD", nullable = true)
    String password;    // variable for host_password

    @Column(name="TIME_FREQUENCY", nullable = false)
    Integer timeFrequency; // variable for timeFrequency, required for controller agent

    //@Basic(optional = false)
    @CreationTimestamp
    //@Temporal(TemporalType.DATE)
    /*DEFAULT CURRENT_TIMESTAMP*/
    @Column(name="CREATED_ON",columnDefinition = "TIMESTAMP")
    //@Column(name="CREATED_ON",insertable = false, updatable = false)
    LocalDateTime timestampCreation;

    //@Basic(optional = false)
    @UpdateTimestamp
    //@Temporal(TemporalType.DATE)
    @Column(name="UPDATED_ON",columnDefinition = "TIMESTAMP")
    //@Column(name="UPDATED_ON",insertable = false)
    LocalDateTime timestampUpdate;



    //Constructor

    public HostDataEntity() {
    }

    public HostDataEntity(String hostPath, String userName, String password, Integer timeFrequency, LocalDateTime timestampCreation, LocalDateTime timestampUpdate) {
        this.hostPath = hostPath;
        this.userName = userName;
        this.password = password;
        this.timeFrequency = timeFrequency;
        this.timestampCreation = timestampCreation;
        this.timestampUpdate = timestampUpdate;
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

    public LocalDateTime getTimestampCreation() {
        return timestampCreation;
    }

    public void setTimestampCreation(LocalDateTime timestampCreation) {
        this.timestampCreation = timestampCreation;
    }

    public LocalDateTime getTimestampUpdate() {
        return timestampUpdate;
    }

    public void setTimestampUpdate(LocalDateTime timestampUpdate) {
        this.timestampUpdate = timestampUpdate;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public Integer getHostId() {
        return hostId;
    }
}
