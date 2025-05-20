package com.example.trial.Service;

import com.example.trial.domain.RadioAward;
import com.example.trial.repositories.RadioAwardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadioAwardServiceImpl implements RadioAwardService{
    private RadioAwardRepository radioAwardRepository;

    @Autowired
    public RadioAwardServiceImpl(RadioAwardRepository radioAwardRepository) {this.radioAwardRepository = radioAwardRepository;}

    @Override
    public List<RadioAward> getAllAwards() {
        return radioAwardRepository.findAll();
    }

    @Override
    public RadioAward getAwardById(int id) {
        return radioAwardRepository.findById(id);
    }

    @Override
    public List<RadioAward> getAwardByType(String type) {
        return radioAwardRepository.findByType(type);
    }
}
