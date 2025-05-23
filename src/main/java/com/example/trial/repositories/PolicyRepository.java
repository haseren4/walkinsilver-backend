package com.example.trial.repositories;

import com.example.trial.domain.Policy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Integer> {
    @Query("SELECT p FROM Policy p")
    public List<Policy> findAll();
    @Query("SELECT p FROM Policy p WHERE p.id = :id")
    public Policy findById(int id);
    @Query("SELECT p FROM Policy p WHERE p.type LIKE :type")
    public List<Policy> findByType(String type);
}
