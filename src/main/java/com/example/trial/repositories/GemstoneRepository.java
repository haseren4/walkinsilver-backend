package com.example.trial.repositories;

import com.example.trial.domain.Gemstone;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GemstoneRepository extends CrudRepository<Gemstone, Integer> {
    @Query("SELECT g FROM Gemstone g ORDER BY g.type")
    public List<Gemstone> findAll();
    @Query("SELECT g FROM Gemstone g WHERE g.type = :type")
    public List<Gemstone> findByType(String type);
    @Query("SELECT g FROM Gemstone g WHERE g.id = :id")
    public Gemstone findById(int id);

}
