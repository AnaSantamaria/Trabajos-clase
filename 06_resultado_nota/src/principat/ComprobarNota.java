package principat;

public class ComprobarNota {
	
	

	public static void main(String[] args) {
	int nota=8;
	//a partir de la nota indicara si es un suspenso entre (1 y 4); aprobado (5 o 6); notable 7, sobresaliente 9o10
	
	 
	
	String resultado;
	resultado= switch(nota) {
	case 1,2,3,4->"Suspenso";
	case 5,6->"Aprobado";
	case 7,8 ->"Notable";
	case 9,10 ->"Sobresaliente";
	default ->"Nota no valida";
	};
	System.out.println(resultado);
	
	}
	
	
	
	
	
   

  
}
