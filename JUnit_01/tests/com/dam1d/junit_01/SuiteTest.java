package com.dam1d.junit_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectClasses({ CalculadoraTest.class, Calculadora2Test.class })
@SelectPackages ("com.dam1d.junit_01")
class Todas {
	
	
}
