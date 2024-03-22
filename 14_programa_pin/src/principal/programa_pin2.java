package principal;
import java.util.Scanner;

public class programa_pin2 {

	public static void main(String[] args) {
		
		final int PIN_Valido=1234;
		int intentos=3;
		int pinLeido=0;
		Scanner sc=new Scanner(System.in);
				
		while(intentos>0)		{
			 System.out.println("Introduce PIN");
			 pinLeido=sc.nextInt();
			 
			if(pinLeido==PIN_Valido) {
				System.out.println( "Pin correcto ");
				break;
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


