package com.aboda.MineApps.Model.Controller;

import com.aboda.MineApps.Model.APPDESTINATION;
import com.aboda.MineApps.Model.APPFEATURES;
import com.aboda.MineApps.Repositories.AppDestinationRepository;
import com.aboda.MineApps.Repositories.AppFeautresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/appDestination")
public class AppDestinationController {

    @Autowired
    AppDestinationRepository appDestinationRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<APPDESTINATION> fetchbyId(@PathVariable("id") Integer id){
        return this.appDestinationRepository.findByappID(id);
    }
}
