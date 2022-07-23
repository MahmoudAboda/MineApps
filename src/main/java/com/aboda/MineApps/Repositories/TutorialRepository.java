package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.AppDownloading;
import com.aboda.MineApps.Model.TUTORIAL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TutorialRepository extends JpaRepository<TUTORIAL,Integer> {

}
