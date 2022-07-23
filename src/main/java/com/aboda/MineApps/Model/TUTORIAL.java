package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUTORIAL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutorial_iD")
    private Integer tutorial_iD;
    @Column(name = "name")
    private String name;
    @Column(name = "steps")
    private String steps;
    @Column(name = "final_word")
    private String final_word;

    @OneToMany
    @JoinColumn(name = "TutorialSteps",insertable = false,updatable = false)
    private List<TutorialSteps> tutorialSteps;
    private Integer TutorialSteps;
}
