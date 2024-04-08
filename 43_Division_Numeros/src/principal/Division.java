package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n1,n2,div;
		try {
			System.out.println("Introduce un numero");
		
		     n1=sc.nextInt();
		      System.out.println("Introduce un otro numero");
	         n2=sc.nextInt();
	         div=n1/n2;
	    	 System.out.println("La division es: "+ div);
		}
		catch(InputMismatchException ex) {
			System.out.println("Debe ser un numero!");
		}

		catch(ArithmeticException ex){ 
			System.out.println("La división por 0 no es válida"); 
		}
}
}