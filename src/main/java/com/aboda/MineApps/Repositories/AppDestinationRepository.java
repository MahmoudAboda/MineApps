package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.APPDESTINATION;
import com.aboda.MineApps.Model.APPFEATURES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppDestinationRepository extends JpaRepository<APPDESTINATION,Integer> {
    Optional<APPDESTINATION> findByappID(Integer appID);

}
