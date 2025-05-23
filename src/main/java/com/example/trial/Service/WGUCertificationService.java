package com.example.trial.Service;

import com.example.trial.domain.WGUCertification;

import java.util.List;

public interface WGUCertificationService {
    public List<WGUCertification> getAll();
    public WGUCertification getById(int id);
    public List<WGUCertification> getAllCurrent();
    public List<WGUCertification> getAllExpired();
}
