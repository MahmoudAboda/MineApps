package com.aboda.MineApps.Model.Controller;


import com.aboda.MineApps.Model.APP;
import com.aboda.MineApps.Model.APPFEATURES;
import com.aboda.MineApps.Repositories.AppFeautresRepository;
import com.aboda.MineApps.Repositories.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/appFeatures")
public class AppFeaturesController {
    @Autowired
    AppFeautresRepository appFeautresRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<APPFEATURES> fetchbyId(@PathVariable("id") Integer id){
        return this.appFeautresRepository.findByappID(id);
    }
}
