package com.dam1d.junit_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Calculadora3Test {
	
	@BeforeEach
	static void inicializar() {
		Calculadora calculadora = new Calculadora();
	}
	@Test
	void test() {
		Calculadora calculadora = new Calculadora();
		double res = calculadora.suma(1, 1);
		assertEquals(2, res, "falla suma");
	}
	@Test
	void test2() {
		Calculadora calculadora = new Calculadora();
		double res = calculadora.suma(1, 1);
		assertEquals(12, res, "falla suma");
	}
	@Test
	void test3() {
		Calculadora calculadora = new Calculadora();
		double res = calculadora.suma(1, 1);
		assertEquals(30, res, "falla suma");
	}
}
