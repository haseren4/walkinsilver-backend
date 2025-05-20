package com.example.trial.controllers;

import com.example.trial.Service.RadioAwardService;
import com.example.trial.Service.RadioAwardServiceImpl;
import com.example.trial.domain.RadioAward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.trial.domain.Radio;
import com.example.trial.Service.RadioService;
import com.example.trial.Service.RadioServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class RadioController {
    private RadioService radioService;
    private RadioAwardService radioAwardService;
    @Autowired
    public RadioController(RadioServiceImpl radioService, RadioAwardServiceImpl radioAwardService){
        this.radioService = radioService;
        this.radioAwardService = radioAwardService;
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

    @GetMapping("/radio/award/all")
    public List<RadioAward> getAwards(){return radioAwardService.getAllAwards();}
}
