package principal;

public class ComoprobarPrimo {

	public static void main(String[] args) {
		int num=17;
		///indicar si el numero es o no primo (solo se puede dividir entre si mismo y 1
		
		boolean esPrimo=true;
		for (int i=2; i<num;i++) {
			if(num%i==0){
				
				esPrimo=false;
			}
		}
			

		System.out.println("El numero "+ num+ " es primo?");
	}
	}


