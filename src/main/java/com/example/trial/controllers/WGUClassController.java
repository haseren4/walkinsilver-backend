package com.example.trial.controllers;

import com.example.trial.Service.WGUClassService;
import com.example.trial.Service.WGUClassServiceImpl;
import com.example.trial.domain.WGUClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class WGUClassController {
    private WGUClassService wguClassService;
    @Autowired
    public WGUClassController(WGUClassServiceImpl wguClassService){this.wguClassService = wguClassService;}

    @GetMapping("api/wgu/classes")
    public List<WGUClass> findAll(){return wguClassService.findAll();}
}
