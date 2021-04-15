package com.dam1d.junit_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//@Disabled("No quiero que el jefe vea que todavía hay fallos")
//@DisplayName("Mi primera prueba")
class CalculadoraTest {
	
	//@DisplayName("Mi primer test")
	@Test
	void test() {
		// Arrange
		Calculadora calculadora = new Calculadora();
		// Act
		double res = calculadora.suma(1, 1);
		// Assert
		assertEquals(2, res, "falla suma");
	}

}
