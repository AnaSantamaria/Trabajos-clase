package view;

import java.util.HashSet;
import java.util.Scanner;

import mode.Direccion;
import service.BuscadorServices;

public class BuscadorVew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BuscadorServices service= new BuscadorServices service;//Objeto
		System.out.println("Introduce la tematica");
		String tematica=sc.nextLine();
		HashSet<Direccion>direcciones=service.buscar(tematica);
		for(Direccion d:direcciones) {
			System.out.println( "URL: "+d.getUrl());
			
		}

	}

}
