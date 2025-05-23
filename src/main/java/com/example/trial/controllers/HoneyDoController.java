package com.example.trial.controllers;

import com.example.trial.Service.HoneyDoService;
import com.example.trial.Service.HoneyDoServiceImpl;
import com.example.trial.domain.HoneyDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class HoneyDoController {
    private HoneyDoService honeyDoService;

    @Autowired
    public HoneyDoController(HoneyDoServiceImpl honeyDoService){
        this.honeyDoService = honeyDoService;
    }

    @GetMapping("api/home/honeydo/all")
    public List<HoneyDo> getAllHoneyDo(){return honeyDoService.getAllHoneyDos();}

}
