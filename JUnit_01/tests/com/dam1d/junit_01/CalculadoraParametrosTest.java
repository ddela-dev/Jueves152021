package com.dam1d.junit_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraParametrosTest {

	@ParameterizedTest
	@MethodSource("casosDePrueba")
	void test_MethodSource(int[] caso) {
		Calculadora calculadora = new Calculadora();
		int esperado = caso[0];
		int obtenido = calculadora.suma(caso[1], caso[2]);
		assertEquals(esperado, obtenido, "falla");
	}

	static int[][] casosDePrueba() {
		int casos[][] = { { 2, 1, 1 }, { 11, 5, 6 }, { 9, 7, 2 } };
		return casos;
	}
}