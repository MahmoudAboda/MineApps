package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.APPFEATURES;
import com.aboda.MineApps.Model.Feautres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeaturesRepository extends JpaRepository<Feautres,Integer> {
    Optional<Feautres> findByappID(Integer appID);

}
