package com.example.trial.Service;

import com.example.trial.domain.Policy;
import com.example.trial.repositories.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService{
    private PolicyRepository policyRepository;
    @Autowired
    public PolicyServiceImpl(PolicyRepository policyRepository){this.policyRepository = policyRepository;}
    @Override
    public List<Policy> findAll() {
        return policyRepository.findAll();
    }

    @Override
    public Policy findById(int id) {
        return policyRepository.findById(id);
    }

    @Override
    public List<Policy> findByType(String type) {
        return policyRepository.findByType(type);
    }
}
