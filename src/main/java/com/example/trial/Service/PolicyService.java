package com.example.trial.Service;

import com.example.trial.domain.Policy;

import java.util.List;

public interface PolicyService {
    public List<Policy> findAll();
    public Policy findById(int id);
    public List<Policy> findByType(String type);
}
