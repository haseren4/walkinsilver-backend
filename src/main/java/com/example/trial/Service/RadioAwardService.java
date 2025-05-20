package com.example.trial.Service;

import com.example.trial.domain.RadioAward;

import java.util.List;

public interface RadioAwardService {

    public List<RadioAward> getAllAwards();
    public RadioAward getAwardById(int id);
    public List<RadioAward> getAwardByType(String type);
}
