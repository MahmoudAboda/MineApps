package com.aboda.MineApps.Model.Controller;

import com.aboda.MineApps.Model.APP;
import com.aboda.MineApps.Repositories.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    AppRepository appRepository;

    @GetMapping("/getAll")
    public List<APP> getAll(){
       return this.appRepository.findAll();

    }

    @GetMapping("/findbyapptype/{name}")
    public List<APP> fetchbyname(@PathVariable("name") String name){
        return this.appRepository.fetchByAppType(name);
    }

    @GetMapping("/findbyappid/{id}")
    public Optional<APP> fetchbyId(@PathVariable("id") Integer id){
        return this.appRepository.findById(id);
    }

    @GetMapping("/search/{name}")
    public List<APP> searchByName(@PathVariable("name") String name ){
        return this.appRepository.fetchByAppName(name);
    }
}
