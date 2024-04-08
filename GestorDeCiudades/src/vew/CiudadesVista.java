package vew;

import java.util.Scanner;

import service.GestorDeCiudadesService;

public class CiudadesVista {

	static GestorDeCiudadesService gestor = new GestorDeCiudadesService();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			presentarMenu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				;
				nuevaCiudad();
				break;

			case 2:
				ciudadConMasPoblacion();
				break;
				
			case 3:
				buscarPorPais();
				break;
				
			case 4:
				default:
					System.out.println("Opción no válida!");

			}

		} while (opcion != 4);

	}

	static void presentarMenu() {
		System.out.println("""
				1.- Nueva Ciudad
				2.- Ciudad más poblada
				3.- Buscar por pais
				4.- Salir

				""");
	}

	static void nuevaCiudad() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de ciudad");
		String ciudad = sc.next();
		System.out.println("Población");
		int poblacion = sc.nextInt();
		System.out.println("Pais");
		String pais = sc.next();
		gestor.incorporarCiudad(ciudad, pais, poblacion);

	}

	static void ciudadConMasPoblacion() {

		gestor.ciudadMasPoblada();
	}

	static void buscarPorPais() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca pais");
		String pais = sc.next();
		gestor.busquedaPorPais(pais);
		

	}
}
