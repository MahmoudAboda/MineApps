package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorialSteps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TutorialSteps_ID;

    private String TutorialStep;
}
