package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class Controller {

        @GetMapping
        public ResponseEntity<String> getMensagem() {
            return ResponseEntity.ok("Olá, mundo!");
        }
}
