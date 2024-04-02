package principal;

import java.util.Random;

public class Cuadricula10x10 {

	public static void main(String[] args) {

		int[][] cuadricula = new int[10][10];// mi array bidimensional
		
		cuadricula=crearCuadricula(cuadricula); //invoco el método

		imprimir(cuadricula); //invoco el método imprimir
		
	}
	
	
	//Metodo para crear cuadrícula
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

		} while (casillasOcupadas < 5);     // condición para las vueltas

		return paramCuadricula;

	}
	
	static void imprimir(int[][] cuadriculaRestultante) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(cuadriculaRestultante[i][j] + " ");
			}
			System.out.println();
		}
	}
}
