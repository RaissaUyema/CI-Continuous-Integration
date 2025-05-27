package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AtividadeDiegoApplicationTests {

	@Test
	void contextLoads() {
		Controller service = new Controller();
		String resultado = service.hello();
		assertEquals("Teste", resultado);
	}

}
