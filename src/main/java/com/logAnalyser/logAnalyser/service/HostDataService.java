package com.logAnalyser.logAnalyser.service;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;

import java.util.List;
import java.util.Optional;

public interface HostDataService {

    public String addHost(HostDataRequest hostDataRequest);

    Optional<HostDataEntity> getHostByHostID(Integer hostPath);

    public String deleteHostRecord(Integer hostId);
    List<HostDataEntity> findAll();

    String updateHost(HostDataRequest hostDataRequest, Integer hostId);
}
