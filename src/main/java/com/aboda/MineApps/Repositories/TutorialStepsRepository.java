package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.Feautres;
import com.aboda.MineApps.Model.TUTORIAL;
import com.aboda.MineApps.Model.TutorialSteps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TutorialStepsRepository extends JpaRepository<TutorialSteps,Integer> {

}
