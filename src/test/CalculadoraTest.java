package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion2A.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BEFORE ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AFTER ALL");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BEFORE EACH");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AFTER EACH");
	}

	@Test
	void testSuma() {
		int valorEsperado = 7, valorReal = Calculadora.suma(4, 3);

		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testResta() {
		int valorEsperado = 1, valorReal = Calculadora.resta(4, 3);

		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testMultiplica() {
		int valorEsperado = 12, valorReal = Calculadora.multiplica(4, 3);

		assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testDivide() {
		int valorEsperado = 1, valorReal = Calculadora.divide(4, 3);

		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testDividepor0() {
		int valorEsperado = -1, valorReal = Calculadora.divide(4, 0);

		assertEquals(valorEsperado, valorReal);
	}

}
