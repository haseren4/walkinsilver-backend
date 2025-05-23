package com.example.trial.repositories;

import com.example.trial.domain.HoneyDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HoneyDoRepository extends CrudRepository<HoneyDo, Integer> {
    @Query("SELECT h FROM HoneyDo h")
    List<HoneyDo> getAll();
}
