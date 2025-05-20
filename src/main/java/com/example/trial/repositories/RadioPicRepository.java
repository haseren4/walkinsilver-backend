package com.example.trial.repositories;

import com.example.trial.domain.RadioPic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RadioPicRepository extends CrudRepository<RadioPic, Integer> {

    @Query("SELECT p FROM RadioPic p")
    public List<RadioPic> findAll();
}
