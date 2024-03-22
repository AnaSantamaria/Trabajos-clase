package principal;

import java.util.Scanner;

public class SolicitudPin {

	public static void main(String[] args) {
		
		//hacer un programa que solicite la introduccion de un pin
		//si es correcto sms y termina programa
		//si es incorrecto, le informa de ello al usuario y le solicita otro
		//si falla tres veces en la intro de pin, sms erro y termina el programa
		
		final int PIN_Valido=1234;
		int intentos=3;
		int pinLeido=0;
		Scanner sc=new Scanner(System.in);
				
		while(intentos>0)		{
			 System.out.println("Introduce PIN");
			 pinLeido=sc.nextInt();
			 
			if(pinLeido==PIN_Valido) {
				System.out.println( "Pin correcto ");
				intentos=0;
			}
			else {
				intentos--;
				if(intentos>0) {
					System.out.println("Pin incorrecto, vuelve a intentarlo, te quedan " +intentos);
				}
				else {
					System.out.println("NO PUEDES PASAR!!!!");
					
				}
			}
		}
		
		

	}

}
