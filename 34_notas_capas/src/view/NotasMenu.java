package view;

import java.util.Arrays;
import java.util.Scanner;

import service.NotasService;

public class NotasMenu {

	static NotasService service = new NotasService();//objeto para hacer las llamadas

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {

			case 1:

				agregarNota();
				break;
			case 2:
				presentarMedia();
				break;

			case 3:
				presentarExtremas();
				break;

			case 4:
				mostrarNotas();
				break;

			case 5:
				System.out.println("Adios!");
				break;

			default:
				System.out.println("Opcion no valida");
			}

		} while (opcion != 5);

	}

	static void presentarMenu() {
		System.out.println("""

                Introducir notas
			    1.- Agregar nota
				2.- Calcular nota media
				3.- Notas extremas
				4.- Ver todas
				5.- Salir
				
				""");
	}

	static void agregarNota() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nota");
		double nota = sc.nextDouble();
		service.agregarNota(nota);
	}

	static void presentarMedia() {
		System.out.println("La media es : " + service.media());

	}

	static void presentarExtremas() {
		System.out.println("Nota mas alta : " + service.max());
		System.out.println("Nota mas baja : " + service.min());

	}

	static void mostrarNotas() {
		System.out.println("Las notas son:" + Arrays.toString(service.obtenerNotas()));

	}

}
