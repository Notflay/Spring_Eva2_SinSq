package com.eva2.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/")
public class InitController {

    @GetMapping()
    public ResponseEntity<Object> Index() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "A19003928");
        im.put("Nombre", "Sebastian Paolo Poma Ramon");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/codigo")
    public ResponseEntity<Object> Code() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "A19003928");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/nombre-completo")
    public ResponseEntity<Object> Name() {
        Map<String, Object> im = new HashMap<>();
        im.put("Nombre", "Sebastian Paolo Poma Ramon");
        return ResponseEntity.ok().body(im);
    }
}
