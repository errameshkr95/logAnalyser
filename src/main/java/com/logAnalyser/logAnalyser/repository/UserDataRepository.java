package com.logAnalyser.logAnalyser.repository;

import com.logAnalyser.logAnalyser.model.UserDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserDataEntity, Integer> {
    public UserDataEntity findByUserName(String userName);

}
