package com.example.trial.Service;

import com.example.trial.domain.RadioPic;
import com.example.trial.repositories.RadioPicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadioPicServiceImpl implements RadioPicService {
    private RadioPicRepository radioPicRepository;

    @Autowired
    public RadioPicServiceImpl(RadioPicRepository radioPicRepository){
        this.radioPicRepository = radioPicRepository;
    }

    @Override
    public List<RadioPic> getAllPics(){return radioPicRepository.findAll();}
}
