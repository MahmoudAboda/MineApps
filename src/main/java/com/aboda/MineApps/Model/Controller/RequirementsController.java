package com.aboda.MineApps.Model.Controller;

import com.aboda.MineApps.Model.DownloadWays;
import com.aboda.MineApps.Model.REQUIREMENTS;
import com.aboda.MineApps.Repositories.DownloadWaysRepository;
import com.aboda.MineApps.Repositories.RequirementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/requirements")
public class RequirementsController {
    @Autowired
    RequirementsRepository requirementsRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<REQUIREMENTS> fetchbyId(@PathVariable("id") Integer id){
        return this.requirementsRepository.findByappID(id);
    }
}
