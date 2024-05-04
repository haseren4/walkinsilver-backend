package com.example.trial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trial.domain.Radio;
import com.example.trial.repositories.RadioRepository;


import java.util.List;
import java.util.Optional;

@Service
public class RadioServiceImpl implements RadioService {

    private RadioRepository radioRepository;

    @Autowired
    public RadioServiceImpl(RadioRepository radioRepository){this.radioRepository = radioRepository;}

    @Override
    public Radio findById(int theId) {
        Optional<Radio> result = radioRepository.findById(theId);

        if(result.isPresent()){
            return result.get();
        }
        else {
            throw new RuntimeException("Did not find the radio id -" + theId);
        }
    }

    @Override
    public List<Radio> findBySetup(String setup) {
        return radioRepository.findBySetup(setup);
    }
}
