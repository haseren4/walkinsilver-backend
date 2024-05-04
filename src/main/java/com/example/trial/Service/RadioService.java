package com.example.trial.Service;

import com.example.trial.domain.Radio;

import java.util.List;

public interface RadioService {
    public Radio findById(int theId);
    public List<Radio> findBySetup(String setup);
}
