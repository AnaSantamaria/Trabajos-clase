package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;



public class Notas_Capas_Fichero_Sevice {
	String fichero = "notas.text";
	
	public class borrarNotas();
	File file = new File(fichero);
	file.d
		

	public void agregarNota(double nota) {
		int notaDada = 0;
		try (FileOutputStream fos = new FileOutputStream(fichero, true); PrintStream out = new PrintStream(fos)) {
			out.print(nota);
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

	public double media() {
		Double media = 0;
		int contador = 0;
		String linea;

		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {
			// mientras haya una nota que leer
			while ((linea = bf.readLine()) != null) {
				contador++;
				media += Double.parseDouble(linea);
			}

		} catch (IOException ex) {
			ex.printStackTrace();

		}
		return contador > 0 ? media / contador : 0;
	}

	public double max() {
			double max=Double.MIN_VALUE;
			String linea;
			
			
			try(FileReader fr = new FileReader(fichero);
					BufferedReader bf = new BufferedReader(fr);){
				
				while((linea=bf.readLine()) != null) {
					
					if(Double.parseDouble(linea)>max){
						max=Double.parseDouble(linea);
					}
				}
					
				}
			catch (IOException ex) {
				ex.printStackTrace();
	
			}
			return max;
			}
			
					
			

	public double min() {
		double mn=Double.MAX_VALUE
        String linea;
		try(FileReader fr = new FileReader(fichero);
				BufferedReader bf = new BufferedReader(fr);)
	}
//guardar notas
	public ArrayList<Double> obtenerNotas() {
		ArrayList<Double> aux =new ArrayList<Double>();//variable temporal del metodo
		String linea;
		
		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);){
			while((linea=bf.readLine()) != null) {
				
				aux.add(Double.parseDouble(linea));
			}
			
			
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		return aux;
	}
}
