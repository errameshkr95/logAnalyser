package com.logAnalyser.logAnalyser.repository;

import com.logAnalyser.logAnalyser.dto.request.HostDataRequest;
import com.logAnalyser.logAnalyser.model.HostDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostDataRepository extends JpaRepository<HostDataEntity,Integer> {
    public HostDataEntity findHostByHostPath(String hostPath);
}
