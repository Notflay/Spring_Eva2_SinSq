package com.eva2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eva2.demo.models.Curso;

@Repository
public interface ICurso extends JpaRepository<Curso, Integer> {

}
