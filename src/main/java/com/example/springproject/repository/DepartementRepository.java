package com.example.springproject.repository;

import com.example.springproject.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends BaseRepository<Departement,Integer> {
}
