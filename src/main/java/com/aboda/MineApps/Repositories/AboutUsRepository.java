package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.ABOUTUS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutUsRepository extends JpaRepository<ABOUTUS,Integer> {
}
