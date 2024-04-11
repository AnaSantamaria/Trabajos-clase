package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import model.Empleados;
import utilidades.Util;

public class EmpleadosService {

	String rutaFichero = "empleados.csv";

	public void agregarEmpleado(Empleados empleados) {

		if (buscarEmpleado(empleados.getCodigo())) {
			System.out.println("El usuario ya se encuentra en el archivo");
		} else {
			try (FileOutputStream fos = new FileOutputStream(rutaFichero, true);
					PrintStream out = new PrintStream(fos)) {
				out.println(Util.convertirEmpleadoACadena(empleados));
				System.out.println("Informacion almacenada correctamente");
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public boolean buscarEmpleado(int codigo) {
		try (FileReader fr = new FileReader(rutaFichero); BufferedReader bf = new BufferedReader(fr);) {
			String linea;
			while ((linea = bf.readLine()) != null) {
				// Preguntamos si la linea contiene el codigo
				if (linea.contains(String.valueOf(codigo))) {
					return true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;

	}


	public String dameNombreEmpleado(int codigo) {
		
		String empleado="No encontrado";
		
		try (FileReader fr = new FileReader(rutaFichero); BufferedReader bf = new BufferedReader(fr);) {
			String linea;
			while ((linea = bf.readLine()) != null) {
				// Preguntamos si la linea contiene el codigo
				if (linea.contains(String.valueOf(codigo))) {
					empleado = linea.substring(0,linea.indexOf(','));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return empleado;

	}


	public Empleados eliminarEmpleados(String nombre) {
		Empleados variableNombre = new Empleados();

		return null;

	}
}
