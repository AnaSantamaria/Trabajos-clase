package principal;

import java.util.Scanner;

public class Presupuestos {

	public static void main(String[] args) {
		
		// Dado los datos de  coches, se pedirá al 
				//cliente cual es su presupuesto y el programa indicará
				//a cuantos coches puedes optar
				
		var coches= new String [] {"volvo-19500.0","Audi-23450","Toyota-17300","BmW-33500","Mercedes-25340","Duster-41800"};
		var sc=new Scanner (System.in);
		double presupuesto;
		
		
		System.out.println("Dame tu presupuesto");
	    
		presupuesto=sc.nextDouble();
		
		
	
		 
		 for(var coche:coches ) {
			 int pos=coche.indexOf("-");//posicion separador
			 var marca=coche.substring(0,pos);
			 double precio=Double.parseDouble(coche.substring(pos+1, coche.lenght()));
			 
			 if(presupuesto>=precio) {
				 System.out.println("Te puedes comprar un " + marca);
			 }
		 }
		

	}
}
