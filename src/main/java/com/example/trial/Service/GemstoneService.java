package com.example.trial.Service;

import com.example.trial.domain.Gemstone;

import java.util.List;

public interface GemstoneService {
    void save(Gemstone gemstone);

    public List<Gemstone> getAllGemstones();
    public Gemstone getGemstonebyId(int id);
    public void addGemstone(Gemstone gemstone);
    public List<Gemstone> getGemstonesByType(String type);
}
