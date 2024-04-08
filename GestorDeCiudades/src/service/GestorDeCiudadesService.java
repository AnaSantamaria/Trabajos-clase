package service;

import java.util.HashSet;

import model.Ciudades;

public class GestorDeCiudadesService {

	HashSet<Ciudades> hashSetCiudades = new HashSet<Ciudades>();

	// Metodo para añadir informacion al hashset

	public void incorporarCiudad(String atributoCiudad, String atributoPais, int atributoPoblación) {
		Ciudades nuevaCiudad = new Ciudades(atributoCiudad.toUpperCase(), atributoPais.toUpperCase(),
				atributoPoblación);
		if (busquedaPorCiudad(atributoCiudad,atributoPais)) {
			System.out.println("Esta ciudad ya existe ");

		} else {
			hashSetCiudades.add(nuevaCiudad);
			System.out.println("Ciudad añadida  ");

		}
	}

	public void ciudadMasPoblada() {
		int poblacionMaxima = Integer.MIN_VALUE;
		String nombreCidudad = "";
		for (Ciudades c : hashSetCiudades) {
			if (c.getAtributoPoblación() > poblacionMaxima) {
				poblacionMaxima = c.getAtributoPoblación();
				nombreCidudad = c.getAtributoCiudad();
			}
		}
		System.out.println("La ciudad con mayor poblacion es " + nombreCidudad);
	}

	public void busquedaPorPais(String pais) {

		// introduzco nombre del pais y rrecorro el hashmap buscandolo y devuelvo todos
		// los valores
		for (Ciudades c : hashSetCiudades) {
			if (c.getAtributoPais().equals(pais.toUpperCase())) {
				System.out.println("Ciudad " + c.getAtributoCiudad() + " Poblacion " + c.getAtributoPoblación());
			}
		}
	}

	public boolean busquedaPorCiudad(String ciudad,String pais) {

		// introduzco nombre del pais y rrecorro el hashmap buscandolo y devuelvo todos
		// los valores
		for (Ciudades c : hashSetCiudades) {
			if (c.getAtributoCiudad().equals(ciudad.toUpperCase()) && c.getAtributoPais().equals(pais.toUpperCase())) {
				return true;
			}
		}
		return false;
	}
}
