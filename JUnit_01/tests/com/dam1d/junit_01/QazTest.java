package com.dam1d.junit_01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class QazTest {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void test_ValueSource(int i) {
		System.out.println(i);
	}

	@ParameterizedTest
	@ValueSource(strings = { "1", "2", "3" })
	void test_ValueSource_String(String s) {
		assertTrue(Integer.parseInt(s) < 5);
	}

	@ParameterizedTest
	@CsvSource(delimiter = '|', value = { "1|'A'", "2|B" })
	void test_CsvSource(int i, String s) {
		assertTrue(3 > i);
		assertTrue(Arrays.asList("A", "B", "C").contains(s));
	}
}
