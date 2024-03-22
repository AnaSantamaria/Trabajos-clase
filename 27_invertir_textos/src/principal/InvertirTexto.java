package principal;

import java.util.Scanner;

public class InvertirTexto {

	public static void main(String[] args) {
		//solicita la introduccion de un texto
		//y lo muestra invertido
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame una frase a invertir");
		
		String textos =sc.nextLine();
		System.out.println(invertir(textos));
				
}
	
	//Método
	static String invertir(String cad) {
		StringBuilder sb=new StringBuilder("");
		//recorremos la cadena desde el ultimo al primer caracter
		//extraemos el caracter, y lo añadimos a un String
	
		
		for(int i=cad.length()-1;i>=0;i--) {
			sb.append(cad.charAt(i));
		
		}
		return sb.toString();
		
	}
	
	

}
