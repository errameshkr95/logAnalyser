package com.logAnalyser.logAnalyser.controller;

import com.logAnalyser.logAnalyser.dto.request.UserDataRequest;
import com.logAnalyser.logAnalyser.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserDataController {
    @Autowired
    UserDataService userDataService;

    //Rest End for registering user
    @CrossOrigin(origins = "*")
    @PostMapping("/signupUser")
    public ResponseEntity<String> addUser(@RequestBody UserDataRequest userDataRequest){
              return ResponseEntity.ok(userDataService.registerUser(userDataRequest));
    }





}
