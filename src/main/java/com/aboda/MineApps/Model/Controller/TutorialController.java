package com.aboda.MineApps.Model.Controller;


import com.aboda.MineApps.Model.APP;
import com.aboda.MineApps.Model.TUTORIAL;
import com.aboda.MineApps.Repositories.AppRepository;
import com.aboda.MineApps.Repositories.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

    @Autowired
    TutorialRepository tutorialRepository;

    @GetMapping("/getAll")
    public List<TUTORIAL> getAll(){
        return this.tutorialRepository.findAll();

    }
}
