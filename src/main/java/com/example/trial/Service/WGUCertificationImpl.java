package com.example.trial.Service;

import com.example.trial.domain.WGUCertification;
import com.example.trial.repositories.WGUCertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WGUCertificationImpl implements WGUCertificationService{
    public WGUCertificationRepository wguCertificationRepository;

    @Autowired
    public WGUCertificationImpl (WGUCertificationRepository wguCertificationRepository){this.wguCertificationRepository = wguCertificationRepository;}

    @Override
    public List<WGUCertification> getAll() {
        return wguCertificationRepository.getAll();
    }

    @Override
    public WGUCertification getById(int id) {
        return wguCertificationRepository.getById(id);
    }

    @Override
    public List<WGUCertification> getAllCurrent() {
        return wguCertificationRepository.getAllCurrent();
    }

    @Override
    public List<WGUCertification> getAllExpired() {
        return wguCertificationRepository.getAllExpired();
    }
}
