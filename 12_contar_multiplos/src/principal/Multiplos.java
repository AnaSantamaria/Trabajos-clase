package principal;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		
		//hacer un programa que solicite dos numeros y 
		//nos diga cuantos multiplos de 5 hay entre ambos numeros
		
		//Si alguno de los numeros es negativo se vuelve a pedie (no se admite numeros negativos)
		Scanner sc=new Scanner(System.in);
		
		
		int num=0;
		int num2=0;
		int numMultiplos=0;
		int mayor=0;
		int menor=0;
		
		do {
		
		System.out.println("Introduce un número");
		num=sc.nextInt();
		while(num<0);
		
		System.out.println("Introduce un número");
		num2=sc.nextInt();
		
		if (num>num2) {
			mayor=num;
			menor=num2;
		}
		
		else {
			mayor=num2;
			menor=num;
		}
			
			
			for (int i=menor;i<=mayor;i++) {
				if(i%5==0) {
				numMultiplos++;
				}
			
			
			
			
		}
		

	}

}
