package com.dam1d.junit_01;

public class Calculadora {
	public int suma(int... numeros) {
		int total = 0;
		for (int i : numeros) {
			total += i;
		}
		return total;
	}

	public int multiplica(int... number) {
		int producto = 0;
		for (int i : number) {
			producto *= i;
		}
		return producto;
	}
}