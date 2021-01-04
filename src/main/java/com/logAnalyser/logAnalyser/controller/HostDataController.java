package com.logAnalyser.logAnalyser.controller;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;
import com.logAnalyser.logAnalyser.service.HostDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HostDataController {
    @Autowired
    HostDataService hostDataService;
    @PostMapping(value="/addHostData")
    public ResponseEntity<String> addHostData(@RequestBody HostDataRequest hostDataRequest){
        //System.out.println(hostDataRequest.getHostPath()+ hostDataRequest.getUserName() + hostDataRequest.getPassword()+ hostDataRequest.getTimeFrequency());
        //return userService.addUser(userDao);
        return ResponseEntity.ok(hostDataService.addHost(hostDataRequest));
    }

    //End API for getting a host_info
    @GetMapping("/getHostDataByHostPath")
    public ResponseEntity<HostDataEntity> getHostData(@RequestParam String hostPath){
        return ResponseEntity.ok((hostDataService.getHostByHostPath(hostPath)));
    }


}
