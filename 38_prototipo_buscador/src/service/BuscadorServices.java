package service;

import java.util.HashSet;

import mode.Direccion;

public class BuscadorServices {
	HashSet<Direccion> direcciones=new HashSet<Direccion>();
	public BuscadorServices() {
		direcciones.add(new Direccion("http://www.amazon.es/", "libros", "web de libros y más cosas"));
		direcciones.add(new Direccion("http://www.fnac.es/", "libros", "libreria completa"));
		direcciones.add(new Direccion("http://www.travel.es/", "viajes", "viajes por el mundo"));
		direcciones.add(new Direccion("http://www.game.es/", "juegos", "el mundo del juego"));
		direcciones.add(new Direccion("http://www.fly.com/", "viajes", "vuelos a todos los destinos"));
		direcciones.add(new Direccion("http://www.casadellibro.es/", "libros", "libros de todos los temas")); 

	}
	public HashSet<Direccion> buscar(String tematica){     //Metodo para crear el HashSet y cargarlo con todos los Objetos(direcciones) 
		HashSet<Direccion> aux=new HashSet<Direccion>();   //HashSet que cargo
			for( Direccion d:direcciones) {
				if()
				aux.add(d);
			}
		}
		 {
			
		
		
		
		
		return direcciones;
		
	}
}
 