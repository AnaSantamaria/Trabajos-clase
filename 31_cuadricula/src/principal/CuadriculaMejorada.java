package principal;

import java.util.Random;
import java.util.Scanner;

public class CuadriculaMejorada {

	public static void main(String[] args) {

		int[][] cuadricula = new int[10][10];// mi array bidimensional

		cuadricula = crearCuadricula(cuadricula);
		

		imprimir(cuadricula);
		
		buscarCoordenadas(cuadricula);

	}

	// Merodo para crear cuadricula

	static int[][] crearCuadricula(int[][] paramCuadricula) {

		Random rand = new Random();

		int casillasOcupadas = 0; // Contador

		do {
			int fila = rand.nextInt(10); // utilizo el metodo random parra llenar las filas y las columnas
			int columna = rand.nextInt(10);
			if (paramCuadricula[fila][columna] != 1) { // si el valor de fila y columna en esa vuelta es diferente de 1
				paramCuadricula[fila][columna] = 1; // asignale un 1 (hata que lo hagas 5 veces)
				casillasOcupadas++;
			}

		} while (casillasOcupadas < 5); // condición para las vueltas

		return paramCuadricula;

	}
	// Método para imprimir cuadricula

	static void imprimir(int[][] cuadriculaRestultante) { //
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(cuadriculaRestultante[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Metodo para saber si en las coordenadas esta el 1

	static void buscarCoordenadas(int[][] paramCuadricula) {

		int coordenadaX;
		int coordenadaY;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nIntroduce la coordenada X de 0 a 9 ");
		coordenadaX = sc.nextInt();

		System.out.println("Introduce la coordenada Y de 0 a 9 ");
		coordenadaY = sc.nextInt();

		if (paramCuadricula[coordenadaX][coordenadaY] != 1) {
			System.out.println("Agua");

		} else {
			System.out.println("Cazado");
		}

	}
}
