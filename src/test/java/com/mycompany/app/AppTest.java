package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private App cut;
	
	@Before
	public void setUp() throws Exception {
		cut = new App();
	}

	@Test
	public void testSaludo() {
		// Preparar
		
		// Ejecutar
		String res = cut.saludo();
		// Verificar
		assertEquals("El mensaje no era la bienvenida esperada","Hola",res);
	}

}
