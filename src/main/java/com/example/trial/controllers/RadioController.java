package com.example.trial.controllers;

import com.example.trial.Service.*;
import com.example.trial.domain.RadioAward;
import com.example.trial.domain.RadioPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.trial.domain.Radio;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("api/radio/setup={s}")
    public List<Radio> getRadiosBySetup(@PathVariable("s")String setup){
        return radioService.findBySetup(setup);
    }
    @GetMapping("api/radio/award/all")
    public List<RadioAward> getAwards(){return radioAwardService.getAllAwards();}

    @GetMapping("api/radio/award/type={t}")
    public List<RadioAward> getAwardsbyType(@PathVariable("t")String type){
        return radioAwardService.getAwardByType(type);
    }

    @GetMapping("api/radio/pic/all")
    public List<RadioPic> getRadioPics(){return radioPicService.getAllPics();}
}
