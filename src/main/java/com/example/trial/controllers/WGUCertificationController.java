package com.example.trial.controllers;

import com.example.trial.Service.WGUCertificationImpl;
import com.example.trial.Service.WGUCertificationService;
import com.example.trial.domain.WGUCertification;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class WGUCertificationController {
    public WGUCertificationService wguCertificationService;

    @Autowired
    public WGUCertificationController(WGUCertificationImpl wguCertificationService){
        this.wguCertificationService = wguCertificationService;
    }

    @GetMapping("api/wgu/cert/all")
    public List<WGUCertification> getAll(){
        return this.wguCertificationService.getAll();
    }
    @GetMapping("api/wgu/cert/id={id}")
    public WGUCertification getByID(@PathParam("id")int id){
        return this.wguCertificationService.getById(id);
    }
    @GetMapping("api/wgu/cert/current")
    public List<WGUCertification> getAllCurrent(){
        return this.wguCertificationService.getAllCurrent();
    }
    @GetMapping("api/wgu/cert/expired")
    public List<WGUCertification> getAllExpired(){
        return this.wguCertificationService.getAllExpired();
    }
}
