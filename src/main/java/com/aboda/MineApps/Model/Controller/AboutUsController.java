package com.aboda.MineApps.Model.Controller;

import com.aboda.MineApps.Model.ABOUTUS;
import com.aboda.MineApps.Model.APP;
import com.aboda.MineApps.Repositories.AboutUsRepository;
import com.aboda.MineApps.Repositories.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/about")
public class AboutUsController {

    @Autowired
    AboutUsRepository aboutUsRepository;

    @GetMapping("/getAll")
    public List<ABOUTUS> getAll(){
        return this.aboutUsRepository.findAll();

    }
}
