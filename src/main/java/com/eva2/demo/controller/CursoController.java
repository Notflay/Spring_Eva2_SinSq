package com.eva2.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eva2.demo.repository.ICurso;
import com.eva2.demo.models.Curso;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("api/curso")
public class CursoController {

    private final ICurso _repository;

    public CursoController(ICurso repository) {
        _repository = repository;
    }

    @GetMapping("listar")
    public List<Curso> Index() {
        return this._repository.findAll();
    }

    @PostMapping("nuevo")
    public Optional<Curso> NewCourse(@RequestBody() Curso course) {
        _repository.save(course);
        return this._repository.findById(course.id);
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<Object> Delete(@PathVariable Integer id) {
        _repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
