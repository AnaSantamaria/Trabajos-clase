package principal;

public class Factorial {

	public static void main(String[] args) {
		 int num=7;
		 //este programa calcula el factorial de un numero(multiplicar el numero por todos los menores que el)
		 
		 int factorial=1;
				 
		 for(int i=2;i<=num;i++) {
			 
			factorial=factorial*i;
			 
			 
		 }
					 
		 System.out.println("Factorial de "+num+" vale: "+factorial);

	}

}
