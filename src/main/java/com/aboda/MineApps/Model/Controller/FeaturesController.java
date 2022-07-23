package com.aboda.MineApps.Model.Controller;

import com.aboda.MineApps.Model.DownloadWays;
import com.aboda.MineApps.Model.Feautres;
import com.aboda.MineApps.Repositories.DownloadWaysRepository;
import com.aboda.MineApps.Repositories.FeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/features")
public class FeaturesController {

    @Autowired
    FeaturesRepository featuresRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<Feautres> fetchbyId(@PathVariable("id") Integer id){
        return this.featuresRepository.findByappID(id);
    }
}
