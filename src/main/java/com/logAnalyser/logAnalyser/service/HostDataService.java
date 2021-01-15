package com.logAnalyser.logAnalyser.service;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;

import java.util.List;

public interface HostDataService {

    public String addHost(HostDataRequest hostDataRequest);

    HostDataEntity getHostByHostID(Integer hostPath);

    public String deleteHostRecord(Integer hostId);
    List<HostDataEntity> findAll();

    String updateHost(HostDataRequest hostDataRequest, Integer hostId);
}
