package com.logAnalyser.logAnalyser.service;

import com.logAnalyser.logAnalyser.model.UserDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserDataService userDataService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //return new User("ramesh","password", new ArrayList<>());
        UserDataEntity userDataEntity = userDataService.getByUserName(userName);

        return new User(userDataEntity.getUserName(),userDataEntity.getPassword(),new ArrayList<>());
    }
}