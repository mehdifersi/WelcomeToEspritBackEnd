package com.example.springproject.repository;

import com.example.springproject.entities.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends BaseRepository<Interview,Integer> {
}
