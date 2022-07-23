package com.aboda.MineApps.Model.Controller;


import com.aboda.MineApps.Model.APPDETAILS;
import com.aboda.MineApps.Model.AppDownloading;
import com.aboda.MineApps.Repositories.AppDetailsRepository;
import com.aboda.MineApps.Repositories.AppDownloadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/appDownloading")
public class AppDownloadingController {
    @Autowired
    AppDownloadingRepository appDownloadingRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<AppDownloading> fetchbyId(@PathVariable("id") Integer id){
        return this.appDownloadingRepository.findByappID(id);
    }
}
