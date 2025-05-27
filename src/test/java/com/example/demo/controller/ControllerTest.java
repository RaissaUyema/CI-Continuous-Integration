package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// Anotação para carregar apenas a camada web (Controller)
@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/api/exemplo"))
                .andExpect(status().isOk()) // Espera status 200
                .andExpect(content().string("Olá, mundo!")); // Espera o conteúdo da resposta
    }
}
