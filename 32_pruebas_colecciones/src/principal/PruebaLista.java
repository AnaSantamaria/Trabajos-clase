package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
	ArrayList<String> cadenas=new ArrayList<>();
    ArrayList<Integer> numeros=new ArrayList<>();
    var decimales=new ArrayList<Double>();// otra forma de declarar un arrayList de cualquier tipo. Se declara el tipo en el new;
    //El tamaño inicial del ArrayList es 0 ya que al ser dinámico se puede ir añadiendo y quitando sin ir cambiando el tamaño.
    //Se reserva 10 posiciones del memoria
    
    System.out.println(cadenas.size());//Conocer el tamaño
    
    //Añadir datos en un Array
    //ArrayList<String> cadenas=new ArrayList<>();
    cadenas.add("Lunes"); //elemento en posición 0 
    cadenas.add("Martes"); //elemento en posición 1
    cadenas.add(0,"Miercoles"); //elemeto en posicion 2
    //se han de rellenar en orden, no se puede añadir a una posición que aún no exista pero si a una que exista ya que mueve los objetos restantes
    
    //nombreArrayList get(int pos). Devuelve el elemento que ocupa la 
    //posición indicada. Si la posición es menor que 0 o mayor 
    //o igual que size(), se producirá una excepción. 
    
    System.out.println(cadenas.get(2));
    
    numeros.add(35);
   //el 35 en un ppio es un 'int' pero automáticamente (autoboxing) lo convierte en un objeto Integer;
    numeros.set(0, 100);
   // System.out.println(numeros.get(1));
   // T set(int pos, T dato). Sustituye el elemento existente en 
   // la posición indicada por el nuevo dato suministrado como 
    //parámetro. Devuelve el elemento sustituido 
    //numeros.set(1, 40);
    //cadenas.remove(1);//elimina "lunes"
    
    //Para recorrer ArrayList
   // if(cadenas.cointains("martes")) {
    	//cadenas.add("martes");  //si cadenas no contiene martes, añade (add) martes. Al contenerlo simplemente no la añade.
    //}
    	
    for(int i=0;i<cadenas.size();i++) {;
    System.out.println(cadenas.get(i));
    
	}
	
	
	}
}
