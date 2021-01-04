package com.logAnalyser.logAnalyser.service.impl;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;
import com.logAnalyser.logAnalyser.repository.HostDataRepository;
import com.logAnalyser.logAnalyser.service.HostDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HostDataDataServiceImpl implements HostDataService {

    @Autowired
    HostDataRepository hostDataRepository;


    @Override
    public String addHost(HostDataRequest hostDataRequest) {
        HostDataEntity hostDataEntity = new HostDataEntity(hostDataRequest.getHostPath(),
                                                            hostDataRequest.getUserName(),
                                                            hostDataRequest.getPassword(),
                                                            hostDataRequest.getTimeFrequency());
        hostDataRepository.save(hostDataEntity);

        //System.out.println(hostDataEntity.getHostId() + hostDataEntity.getHostPath()+ hostDataEntity.getUserName() + hostDataEntity.getPassword()+ hostDataEntity.getTimeFrequency());
        //System.out.println(hostDataRequest.getHostPath()+ hostDataRequest.getUserName() + hostDataRequest.getPassword()+ hostDataRequest.getTimeFrequency());

        return "New Host Info added";
    }

    @Override
    public HostDataEntity getHostByHostPath(String hostPath) {
        //HostDataEntity hostDataEntity = new HostDataEntity();
        return hostDataRepository.findHostByHostPath(hostPath);
    }



}
