package principal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotería2 {

	public static void main(String[] args) {
		//Introduce tu combinacion (seis número separados por una coma):
			
			//Imprimir: 
		//Esta es tu combinacióm:------
		//Esta es la conbinación ganadora:-------
		//Has tenido ------ aciertos
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce seis números al azar separados por comas");
		String numAzar=sc.nextLine();
		//elimina duplicados en la cadena:
		
				
		String[] num = numAzar.split(",");//este es mi array introducido
		
		//convertir el array de String en array numerico
		int[]numValor=new int [num.length];
		for(int i = 0; i < num.length; i++) {
			numValor[i]= Integer.parseInt(num[i]);//mi array ya convertido
			
			
			//Los numeros ganadores
		
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
//metodo para comparar los dos arrays y ver si combinacion ganadora
	static int calcularAiertos (int []cDeEntada, int []cGanadora) {
		
		int aciertos=0;
		for (int n:cNumerica)
	}
	return 0;
}
	
	//Cuantas veces  he de jugar para ganar
	
	long veces=0;
	do {
	combinaciónNumerica=generarCombinacionGanadora();//Metodos que he de hacer antes para el ejercicio
	combinacionGanadora=generarCombinacionNumerica();
	veces++;
	
	}while(aciertos<6);
	syso

}
