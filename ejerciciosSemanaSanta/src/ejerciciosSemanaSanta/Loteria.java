package ejerciciosSemanaSanta;

import java.util.Arrays;
import java.util.Random;

public class Loteria {

	public static void main(String[] args) {

		// loteria: Ejercicio de vacaciones:
		// Programa que muestre seis números aleatorios,
		// no repetidos, entre 1 y 49, ordenados de menor a mayor

		int[] loteria = new int[6];
		Random random = new Random();

		for (int i = 0; i < loteria.length; i++) {
			int loteriaTemp;
			boolean repetido;
			do {
				loteriaTemp = random.nextInt(50);
				repetido = contieneNumero(loteria, loteriaTemp);
			} while (repetido);

			loteria[i] = loteriaTemp;
		}

		// Ordenar de menor a mayor
		Arrays.sort(loteria);

		// Imprimir los números
		System.out.println("Números de la lotería:");
		for (int numero : loteria) {
			System.out.print(numero + " ");
		}
	}

	// Método que uso para comprobar si hay repetidos
	public static boolean contieneNumero(int[] array, int numero) {
		for (int elemento : array) {
			if (elemento == numero) {
				return true; // El número está en el array
			}
		}
		return false; // El número no está en el array
	}

}
