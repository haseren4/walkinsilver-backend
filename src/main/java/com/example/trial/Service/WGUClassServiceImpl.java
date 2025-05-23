package com.example.trial.Service;

import com.example.trial.domain.WGUClass;
import com.example.trial.repositories.WGUClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WGUClassServiceImpl implements WGUClassService{
    public WGUClassRepository wguClassRepository;

    @Autowired
    public WGUClassServiceImpl(WGUClassRepository wguClassRepository){this.wguClassRepository = wguClassRepository;}
    @Override
    public List<WGUClass> findAll() {
        return wguClassRepository.findAll();
    }
}
