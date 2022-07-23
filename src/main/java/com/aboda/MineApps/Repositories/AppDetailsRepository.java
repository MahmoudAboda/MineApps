package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.APPDESTINATION;
import com.aboda.MineApps.Model.APPDETAILS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppDetailsRepository extends JpaRepository<APPDETAILS,Integer> {
    Optional<APPDETAILS> findByappID(Integer appID);

}
