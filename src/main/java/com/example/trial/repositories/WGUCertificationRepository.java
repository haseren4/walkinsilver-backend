package com.example.trial.repositories;

import com.example.trial.domain.WGUCertification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WGUCertificationRepository extends CrudRepository<WGUCertification, Integer>{
    @Query("SELECT c FROM WGUCertification c")
    public List<WGUCertification> getAll();
    @Query("SELECT c FROM WGUCertification c WHERE c.id = :id")
    public WGUCertification getById(int id);
    @Query("SELECT c FROM WGUCertification c WHERE c.expDate > current date ")
    public List<WGUCertification> getAllCurrent();
    @Query("SELECT c FROM WGUCertification c WHERE c.expDate <= current date ")
    public List<WGUCertification> getAllExpired();
}
