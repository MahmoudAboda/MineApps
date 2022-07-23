package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.APPFEATURES;
import com.aboda.MineApps.Model.DownloadWays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DownloadWaysRepository extends JpaRepository<DownloadWays,Integer> {
    Optional<DownloadWays> findByappID(Integer appID);

}
