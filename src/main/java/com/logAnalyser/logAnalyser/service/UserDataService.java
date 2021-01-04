package com.logAnalyser.logAnalyser.service;

import com.logAnalyser.logAnalyser.dto.request.UserDataRequest;
import com.logAnalyser.logAnalyser.model.UserDataEntity;

public interface UserDataService {
    public String registerUser(UserDataRequest userDataRequest);
    public UserDataEntity getByUserName(String userName);


}
