package com.logAnalyser.logAnalyser.controller;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;
import com.logAnalyser.logAnalyser.service.HostDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping(value="/hostAPI")
@Controller
public class HostDataController {
    @Autowired
    HostDataService hostDataService;

    @PostMapping(value="/addHostData")
    public ResponseEntity<String> addHostData(@RequestBody HostDataRequest hostDataRequest){

        return ResponseEntity.ok(hostDataService.addHost(hostDataRequest));
    }

    @PostMapping("/viewHostData")
    public ResponseEntity<Optional<HostDataEntity>> getHostData(@RequestParam Integer hostId){
        return ResponseEntity.ok(hostDataService.getHostByHostID(hostId));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteHostData(@RequestParam Integer hostId){
        return ResponseEntity.ok(hostDataService.deleteHostRecord(hostId));
    }

    @GetMapping("/getAllHostData")
    public ResponseEntity<List<HostDataEntity>> getAllHostData(){
        return ResponseEntity.ok(hostDataService.findAll());
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateHostData(@RequestBody HostDataRequest hostDataRequest,@RequestParam(name="hostId") Integer hostId){
       return ResponseEntity.ok(hostDataService.updateHost(hostDataRequest,hostId));

    }


}
