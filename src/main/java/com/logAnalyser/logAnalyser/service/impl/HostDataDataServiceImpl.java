package com.logAnalyser.logAnalyser.service.impl;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;
import com.logAnalyser.logAnalyser.repository.HostDataRepository;
import com.logAnalyser.logAnalyser.service.HostDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HostDataDataServiceImpl implements HostDataService {

    @Autowired
    HostDataRepository hostDataRepository;


    @Override
    public String addHost(HostDataRequest hostDataRequest) {
        HostDataEntity hostDataEntity = new HostDataEntity();
        hostDataEntity.setHostPath(hostDataRequest.getHostPath());
        hostDataEntity.setUserName(hostDataRequest.getUserName());
        hostDataEntity.setPassword(hostDataRequest.getPassword());
        hostDataEntity.setTimeFrequency(hostDataRequest.getTimeFrequency());

        hostDataRepository.save(hostDataEntity);
        return "New Host Info added";
    }

    @Override
    public Optional<HostDataEntity> getHostByHostID(Integer hostId) {
        //HostDataEntity hostDataEntity = new HostDataEntity();
        return hostDataRepository.findById(hostId);
    }

    @Override
    public String deleteHostRecord(Integer hostId) {
        if(hostDataRepository.findById(hostId) != null  ){
           // HostDataEntity hostDataEntity = new HostDataEntity()
            hostDataRepository.deleteById(hostId);
            return "Record has been deleted!!";
        }
        else{
            return "Record Not Found!!";
        }
    }

    @Override
    public List<HostDataEntity> findAll() {
        return hostDataRepository.findAll();
    }

    @Override
    public String updateHost(HostDataRequest hostDataRequest, Integer hostId) {
        hostDataRepository.findById(hostId).map(hostDataEntity -> {
            hostDataEntity.setHostPath(hostDataRequest.getHostPath());
            hostDataEntity.setUserName(hostDataRequest.getUserName());
            hostDataEntity.setPassword(hostDataRequest.getPassword());
            hostDataEntity.setTimeFrequency(hostDataRequest.getTimeFrequency());
            return hostDataRepository.save(hostDataEntity);
        }).orElseGet(() -> {
            HostDataEntity hostDataEntity = new HostDataEntity();
            hostDataEntity.setHostPath(hostDataRequest.getHostPath());
            hostDataEntity.setUserName(hostDataRequest.getUserName());
            hostDataEntity.setPassword(hostDataRequest.getPassword());
            hostDataEntity.setTimeFrequency(hostDataRequest.getTimeFrequency());
            return hostDataRepository.save(hostDataEntity);

        });

        return "HostData updated successfully!!";
    }


}
