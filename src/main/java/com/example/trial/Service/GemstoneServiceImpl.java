package com.example.trial.Service;

import com.example.trial.domain.Gemstone;
import com.example.trial.repositories.GemstoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GemstoneServiceImpl implements GemstoneService {
    private GemstoneRepository gemstoneRepository;

    @Autowired
    public GemstoneServiceImpl(GemstoneRepository gemstoneRepository) {this.gemstoneRepository = gemstoneRepository;}

    @Override
    public void save(Gemstone gemstone) {

    }

    @Override
    public List<Gemstone> getAllGemstones() {
        return gemstoneRepository.findAll();
    }

    @Override
    public Gemstone getGemstonebyId(int id) {
        return gemstoneRepository.findById(id);
    }


    @Override
    public void addGemstone(Gemstone gemstone) {
        gemstoneRepository.save(gemstone);
    }


    @Override
    public List<Gemstone> getGemstonesByType(String type) {
        return gemstoneRepository.findByType(type);
    }
}
