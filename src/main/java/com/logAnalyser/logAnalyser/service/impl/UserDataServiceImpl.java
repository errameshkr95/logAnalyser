package com.logAnalyser.logAnalyser.service.impl;

import com.logAnalyser.logAnalyser.dto.request.UserDataRequest;
import com.logAnalyser.logAnalyser.model.UserDataEntity;
import com.logAnalyser.logAnalyser.repository.UserDataRepository;
import com.logAnalyser.logAnalyser.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataServiceImpl implements UserDataService {
    @Autowired
    UserDataRepository userDataRepository;
    @Override
    public String registerUser(UserDataRequest userDataRequest) {
        UserDataEntity userDataEntity = new UserDataEntity(userDataRequest.getUserName(),
                                            userDataRequest.getPassword(),
                                            userDataRequest.getEmail(),
                                            userDataRequest.getMobileNo());

        System.out.println("----------------------------------");
        System.out.println(userDataEntity.getUserName());
        System.out.println(userDataEntity.getPassword());
        System.out.println(userDataEntity.getEmail());
        System.out.println(userDataEntity.getMobileNo());

        userDataRepository.save(userDataEntity);
        return "User has been registered";
    }

    @Override
    public UserDataEntity getByUserName(String userName) {
        return userDataRepository.findByUserName(userName);
    }
}
