package com.dam1d.junit_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Mi primera prueba")
class Calculadora2Test {
	
	static Calculadora calculadora;

	@BeforeAll
	static void inicializar() {
		calculadora = new Calculadora();
	}

	@Test
	void testSuma() {
			// Act
		double res = calculadora.suma(1, 1);
			// Assert
		assertEquals(2, res, "falla suma");
	}

	@Test
	void testMultiplica() {
		// Act
		double res = calculadora.multiplica(1, 2, 3);
		// Assert
		assertEquals(1, res, "falla multiplica");
	}
	
}
