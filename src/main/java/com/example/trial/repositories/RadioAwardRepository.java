package com.example.trial.repositories;

import com.example.trial.domain.RadioAward;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RadioAwardRepository extends CrudRepository<RadioAward, Integer> {

    @Query("SELECT a FROM RadioAward a")
    public List<RadioAward> findAll();
    @Query("SELECT a FROM RadioAward a WHERE a.id = :id")
    public RadioAward findById(int id);
    @Query("SELECT a FROM RadioAward a WHERE a.type = :type")
    public List<RadioAward> findByType(String type);
}
