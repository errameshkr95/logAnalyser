package com.logAnalyser.logAnalyser.dto.request;

public class HostDataRequest {
    String hostPath;
    String userName;
    String password;
    Integer timeFrequency;

    //Constructor
    public HostDataRequest() {
    }

    public HostDataRequest(Integer hostId, String hostPath, String userName, String password, Integer timeFrequency) {
    }

    public HostDataRequest(String hostPath, String userName, String password, Integer timeFrequency) {
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
}
