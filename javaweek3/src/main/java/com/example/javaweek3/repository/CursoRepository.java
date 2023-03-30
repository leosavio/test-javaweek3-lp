package com.example.javaweek3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javaweek3.model.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
