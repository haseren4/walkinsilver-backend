package com.example.trial.repositories;

import com.example.trial.domain.WGUClass;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WGUClassRepository extends CrudRepository<WGUClass, Integer> {
    @Query("SELECT c FROM WGUClass c")
    List<WGUClass> findAll();
}
