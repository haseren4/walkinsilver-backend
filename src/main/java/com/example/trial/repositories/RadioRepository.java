package com.example.trial.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.trial.domain.Radio;

import java.util.List;

public interface RadioRepository  extends CrudRepository<Radio, Integer> {

    @Query("SELECT r from Radio r WHERE r.setup LIKE %?1%")
    List<Radio> findBySetup(String setup);

}
