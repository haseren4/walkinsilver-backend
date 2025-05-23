package com.example.trial.Service;

import com.example.trial.domain.HoneyDo;
import com.example.trial.repositories.HoneyDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HoneyDoServiceImpl implements HoneyDoService{
    public HoneyDoRepository honeyDoRepository;

    @Autowired
    public HoneyDoServiceImpl(HoneyDoRepository honeyDoRepository){
        this.honeyDoRepository = honeyDoRepository;
    }
    @Override
    public List<HoneyDo> getAllHoneyDos() {
        return this.honeyDoRepository.getAll();
    }
}
