package com.example.springbootpostgresrestapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootpostgresrestapidemo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
