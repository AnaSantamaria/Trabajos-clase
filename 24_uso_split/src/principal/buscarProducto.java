package principal;

import java.util.Scanner;

public class buscarProducto {

	public static void main(String[] args) {
		String cesta="tomates, patatas, vino, leche,azucar, cerveza,pan,vino, patatas, pan";
		//se pide la introducción de un produco, y programa nos muestra su stock
		Scanner sc=new Scanner(System.in);
		String producto;
		int stock=0;
	String [] productos=cesta.split("[, .]");
		System.out.println("Introduce producto");
       producto=sc.nextLine();//
       for(String p:productos) {
    	   if(p.equals(producto)) {
    		   stock++;
    	   }
       }
       System.out.println("El stock "+producto+" es "+stock);

	}

}
