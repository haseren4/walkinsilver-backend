package com.example.trial.controllers;

import com.example.trial.Service.*;
import com.example.trial.domain.RadioAward;
import com.example.trial.domain.RadioPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.trial.domain.Radio;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class RadioController {
    private RadioService radioService;
    private RadioAwardService radioAwardService;
    private RadioPicService radioPicService;
    @Autowired
    public RadioController(RadioPicServiceImpl radioPicService, RadioServiceImpl radioService, RadioAwardServiceImpl radioAwardService){
        this.radioService = radioService;
        this.radioAwardService = radioAwardService;
        this.radioPicService = radioPicService;
    }

    @GetMapping("api/radio/HT")
    public List<Radio> getHTRadios(){
        return radioService.findBySetup("HT");
    }
    @GetMapping("api/radio/Mobile")
    public List<Radio> getMobileRadios(){
        return radioService.findBySetup("Mobile");
    }
    @GetMapping("api/radio/Base")
    public List<Radio> getBaseRadios(){return radioService.findBySetup("Base");}

    @GetMapping("api/radio/award/all")
    public List<RadioAward> getAwards(){return radioAwardService.getAllAwards();}

    @GetMapping("api/radio/pic/all")
    public List<RadioPic> getRadioPics(){return radioPicService.getAllPics();}
}
