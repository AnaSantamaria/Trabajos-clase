package utilidades;

import model.Empleados;

public class Util {

	// Convertir empleado acadena

	public static String convertirEmpleadoACadena(Empleados empleado) {
		return empleado.getNombre() + "," + empleado.getEdad() + "," + empleado.getCodigo()+ ","
				+ empleado.getEmail();
	}

	public static Empleados convertirCadenaAEmpleado(String linea) {
		String[] cadena = linea.split(",");
		return new Empleados(cadena[0],Integer.parseInt(cadena[1]),Integer.parseInt(cadena[2]),cadena[3]);
	}	
}

