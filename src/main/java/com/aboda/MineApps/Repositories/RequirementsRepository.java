package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.Feautres;
import com.aboda.MineApps.Model.REQUIREMENTS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RequirementsRepository extends JpaRepository<REQUIREMENTS,Integer> {
    Optional<REQUIREMENTS> findByappID(Integer appID);

}
