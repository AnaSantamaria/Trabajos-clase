package service;
/*Realizar una nueva versión del programa de las notas. Al iniciar el programa
aparecerá el siguiente menú:
1.- Nueva nota
2.- Calcular media
3.- Notas extremas
4.- Ver todas
5.- Salir */

import java.util.ArrayList;

public class NotasService {

	ArrayList<Double> notas = new ArrayList<Double>();// Metodo void para que no debuelva nada

	public void agregarNota(double nota) {
		notas.add(nota);

	}

	public double media() {
		double media = 0;
		for (Double n : notas) {
			media += n;
		}return media/notas.size();
	}
	

	public double max() {
		double notaMayor = 0;

		for (Double nota : notas) {
			if (nota > notaMayor) {
				notaMayor = nota;
			}

		}
		return notaMayor;

	}

	public double min() {
		double notaMenor = 0;

		for (Double nota : notas) {
			if (nota < notaMenor) {
				notaMenor = nota;
			}

		}
		return notaMenor;


		

	}

	public Double[] obtenerNotas() {
		/*
		 * double[] todas = new double[notas.size()]; for (int i = 0; i < notas.size();
		 * i++) { todas[i] = notas.get(i); } return todas;
		 */
		return notas.toArray(new Double[0]);// hay que dar un array vacío del tipo de variable que necesites
											// parautilizar el metodo to.array
	}
}
