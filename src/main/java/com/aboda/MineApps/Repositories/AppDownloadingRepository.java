package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.APPDETAILS;
import com.aboda.MineApps.Model.AppDownloading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppDownloadingRepository extends JpaRepository<AppDownloading,Integer> {
    Optional<AppDownloading> findByappID(Integer appID);

}
