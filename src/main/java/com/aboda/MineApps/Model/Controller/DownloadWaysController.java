package com.aboda.MineApps.Model.Controller;

import com.aboda.MineApps.Model.APPFEATURES;
import com.aboda.MineApps.Model.DownloadWays;
import com.aboda.MineApps.Repositories.AppFeautresRepository;
import com.aboda.MineApps.Repositories.DownloadWaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/downloadWays")
public class DownloadWaysController {
    @Autowired
    DownloadWaysRepository downloadWaysRepository;

    @GetMapping("/findbyappid/{id}")
    public Optional<DownloadWays> fetchbyId(@PathVariable("id") Integer id){
        return this.downloadWaysRepository.findByappID(id);
    }
}
