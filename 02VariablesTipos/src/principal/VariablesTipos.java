package principal;

public class VariablesTipos {
	static int r;// Variables tipo atributo

	public static void main(String[] args) {
		int s,v,a=10; // variables locales
		System.out.println("La variable a vale " + a);
		s=6;
		System.out.println(r);
		
		//Casos especiales
		int car= 352148965; //Igual a 
		int car2= 352_148_965;
		double d= 251.5214;
		float n=4.6f;//Es un double, pero si lo quiero declarra como float he de poner la f detrás
		int bin=0b101;
		System.out.println(bin);
		
		
		
		
	}

}
