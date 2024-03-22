package principal;

import java.util.Scanner;

public class ComprobarPresupuesto {
	
	// Dado una serie de precios de coches, se pedirá al 
			//cliente cual es su presupuesto y el programa indicará
			//a cuantos coches puedes optar
			

	public static void main(String[] args) {
		
		
		var precios= new double [] {19_500.0,23_450,17_300,33_500,25_340,41_800};
		double presupuesto=0;
		var contador=0;
		
		
		

		System.out.println("¿Cual es tu presupuesto?");
		Scanner sc=new Scanner(System.in);
		double presupueso=sc.nextDouble();
		
		
	for(var precio:precios){
		
		if (presupuesto >= precio) 
			contador++;
	}
	System.out.println("Te puedes comprar " + contador + " posibles coches");
	sc.close();
	

	
	
		
		}
		
	

}


