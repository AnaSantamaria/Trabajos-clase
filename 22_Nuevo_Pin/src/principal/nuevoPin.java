package principal;

import java.util.Scanner;

public class nuevoPin {


final String PIN_Valido="pared";
int intentos=3;
String pinLeido;

    Scanner sc=new Scanner(System.in)
		
     while (intentos>0) { 	
	 System.out.println("Introduce PIN");
	 pinLeido=sc.nextLine();
     
	 
     
	 
	if(pinLeido.equals(PIN_Valido)) {
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