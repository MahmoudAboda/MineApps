package com.aboda.MineApps.Model.Controller;


import com.aboda.MineApps.Model.APPDETAILS;
import com.aboda.MineApps.Model.APPFEATURES;
import com.aboda.MineApps.Repositories.AppDetailsRepository;
import com.aboda.MineApps.Repositories.AppFeautresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/appDetails")
public class AppDetailsController {

    @Autowired
    AppDetailsRepository appDetailsRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<APPDETAILS> fetchbyId(@PathVariable("id") Integer id){
        return this.appDetailsRepository.findByappID(id);
    }
}
