package com.example.trial.controllers;

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
    @Autowired
    public RadioController(RadioServiceImpl radioService){
        this.radioService = radioService;
    }

    @GetMapping("api/radio/HT")
    public List<Radio> getHTRadios(){
        return radioService.findBySetup("HT");
    }
    @GetMapping("api/radio/Mobile")
    public List<Radio> getMobileRadios(){
        return radioService.findBySetup("Mobile");
    }
}
