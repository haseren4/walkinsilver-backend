package com.example.trial.controllers;

import com.example.trial.Service.GemstoneService;
import com.example.trial.Service.GemstoneServiceImpl;
import com.example.trial.domain.Gemstone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class GemstoneController {
    private GemstoneService gemstoneService;

    @Autowired
    public GemstoneController(GemstoneServiceImpl gemstoneService) {this.gemstoneService = gemstoneService;}

    @GetMapping("api/gem/all")
    public List<Gemstone> getAllGemstone(){return gemstoneService.getAllGemstones();}

    @GetMapping("api/gem/type={type}")
    public List<Gemstone> getGemstonesByType(@PathVariable("type") String type){return gemstoneService.getGemstonesByType(type);}

    @GetMapping("api/gem/{id}")
    public Gemstone getGemstoneById(@PathVariable("id") int id){return gemstoneService.getGemstonebyId(id);}

    @PostMapping("api/gem/add")
    public void addGemstone(@RequestBody Gemstone gemstone){
        System.out.println(gemstone);
        gemstoneService.addGemstone(gemstone);
    }
}

