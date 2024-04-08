package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class notas3_0 {

	public static void main(String[] args) {
		/*Realizar un programa para solicitar al usuario las notas de un grupo de alumnos.
		Al iniciarse el programa, se le pide al usuario que introduzca una nota y esta se guardará. Después, se le pregunta si quiere introducir una nueva nota, si dice que sí,
		se le pide otra nota y así sucesivamente hasta que diga que no.
		Cuando se hayan guardado todas las notas, el programa mostrará los siguientes datos:
		-Nota media
		-Aprobados
		-Nota más alta */
		
		ArrayList<Integer> notas= new ArrayList<>();
		int nota;
		String respuesta;
		Scanner sc=new Scanner (System.in);
		
		do {
			System.out.println("Introduce nota");//se pide la nota
			nota=Integer.parseInt(sc.nextLine());//convierto el estring en valor numerico para poder usar el  metodo nextLine y no nexInt
			notas.add(nota);
			System.out.println("¿Quieres introducir otra nota?");
			respuesta=sc.nextLine();
			
			
			
		}while(respuesta.equalsIgnoreCase("s"));//mientras la respuesta sea s(ignora la salida del bucle)
			
		System.out.println("Media: "+ calcularMedia(notas));
		System.out.println("Aprobados: "+ TotalAprobados(notas));
		System.out.println("NotaMasalta: "+ NotaMayor(notas));
		
		
		
		
			


	}
	
	
	static int calcularMedia (ArrayList<Integer> notas) {
		int media=0;
		int suma=0;
		
		for(Integer nota:notas) {
			
			 
			 media+=nota;
			
		}
		
		return media/notas.size();
		
		
	}
	
	
	static int TotalAprobados (ArrayList<Integer> notas) {
		
		int aprobados=0;
		for(Integer nota:notas) {
			
		if(nota>5){
			aprobados++;
		}
		}
		return aprobados;
	}
		
		
	static int NotaMayor (ArrayList<Integer> notas) {
		
		int notaMayor=0;
		
		
		for(Integer nota:notas) {
			if(nota >notaMayor) {
				notaMayor=nota;
			}
		}
		return notaMayor;
	}
		
	}
	


