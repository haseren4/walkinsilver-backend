package com.example.trial.controllers;

import com.example.trial.Service.PolicyService;
import com.example.trial.Service.PolicyServiceImpl;
import com.example.trial.domain.Policy;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PolicyController {
    private PolicyService policyService;

    @Autowired
    public PolicyController(PolicyServiceImpl policyService){this.policyService = policyService;}

    @GetMapping("api/policy/all")
    public List<Policy> getAll(){
        return policyService.findAll();
    }
    @GetMapping("api/policy/id={i}")
    public Policy findById(@PathVariable("i")int id){
        return policyService.findById(id);
    }
    @GetMapping("api/policy/type={type}")
    public List<Policy> findByType(@PathVariable("type")String type){
        return policyService.findByType(type);
    }
}
