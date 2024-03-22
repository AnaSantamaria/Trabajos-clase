package principal;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// Relizar un programa que solicite una a una la introducción de 6 notas(double)
		// que seran guardadas en un array
		// tras ello el programa mostrara los siguientes datos por pantalla:
		// Nota media
		// Nota mas alta
		// Aprobados (cada nota que sea un aprobado)

		double[] notas = new double[6];// variable donde guardo los datos
        double media=0;
        double notaAlta=0;

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < notas.length; i++) {

			System.out.println("Introducir notas");
			
			notas[i]= sc.nextDouble();

		}
		//media y nota mas alta
		for(double nota:notas) {
			media+=nota;
			//si encuento ua nota mas alta que el maximoactual
			//actualizo ese maximo
			if(nota<notaAlta) {
				notaAlta=nota;
			}
			//mostramos nota si es aprobado
			if(nota>5) {
				System.out.println("Aprobado "+nota);
				System.out.println("Suspenso"+ (nota<5));
			}
			
		}System.out.println(media /notas.lenth);
		sc.close();

	}

}
