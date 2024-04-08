package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.GestorDeCiudadesService;

class testGestorDeCiudades {
	static GestorDeCiudadesService gestordeciudadesservice = new GestorDeCiudadesService();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gestordeciudadesservice.incorporarCiudad("LEGANES", "SPAIN", 1);
		gestordeciudadesservice.incorporarCiudad("GETAFE", "SPAIN", 2);
		gestordeciudadesservice.incorporarCiudad("SEVILLA", "SPAIN", 1112313);
	}

	@Test
	void testBusquedaPorCiudad() {
		assertEquals(true, gestordeciudadesservice.busquedaPorCiudad("GETAFE", "SPAIN"));
	}

}
