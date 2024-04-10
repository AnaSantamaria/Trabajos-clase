package principal;

public class preguntas {

}
///*int [] n={3,7,1,0};
//int r=4;
//System.out.println(switch(r){
	//case 1->n[0];
	//case 2->n[1];
	//case 0->n[3];
	//case 4->n[2];
//});

//	a.- 1
//  b.- 0
//	c.- No muestra nada
//	*d.- Error de compilación  => falta bloque default
//	e.- Excepción ArrayIndexOutOfBoundsException 




///public static void main(String[] args){
	///var r=new int[5]; //linea1
	//System.out.println(r[0]);  //linea2

//}

//*a.- 0
//b.- No imprime nada
//c.- error de compilación en linea1
//d.- error de compilación en linea2
//e.- Excepción ArrayIndexOutOfBoundsException 







//public static void main(String[] args){
	//int[] r; //linea1
	///System.out.println(r[0]);  //linea2

//}

//a.- 0
//b.- No imprime nada
//c.- error de compilación en linea1
//*d.- error de compilación en linea2
//e.- Excepción NullPointerException


//////////////////////////////////



//static int[] r; //linea1
//public static void main(String[] args){	
	//System.out.println(r[0]);  //linea2
//}

//a.- 0
//b.- No imprime nada
//c.- error de compilación en linea1
//d.- error de compilación en linea2
//*e.- Excepción NullPointerException /*

/////////////////////////////////////////////



    ///*class Test{
	//String s;
	//public void m(){
		//print(s);
	//}
//}

//a. null// ok
//b. cadena vacía
//c. error de compilación
///d. NullPointerException 

//////////////////////////////////////////



//class Test{
	//ArrayList<Ciudad> ciudades=new ArrayList<>();
	//Ciudad c=new Ciudad();
	//public void m(){
		//ciudades.add(c);
		//print(ciudades.get(0).getNombre());;
	//}
//}

///a. null//ok
//b. cadena vacía
//c. error de compilación
//d. NullPointerException

////////////////////////////////////


//1-int b='f';//ok
//2-int a=3.4f;//MAL
//3-char b=(char)5.7;//ok
//4-int a=3;byte c=a;// mal
//5-boolean r=false;int g=(int)r;//mal

///////////////////////////////////

//***En los switch solo admite valores int o implicitos de int, NADA MAS
/*nt a=20;
int s=sc.nextInt(); //se introduce un 5
final int c=8;
String res=switch(s){
	case 5->"hola";
	case '#'->"adios";
	case c->"hasta mañana";
	
}; //error de compilación, porque cuando se utiliza switch en expresiones tiene que //devolver un resultado en cualquier caso, por loque faltaría un bloque default
System.out.println(res); */

     //////////////////////////////////

/*try{
	int a=Integer.parseInt(sc.nextLine());   ///
}catch(NullPointerException ex){
	print("Error");
}catch(NumberFormatException ex){
print ("otro error")

suponiendo que se introuce una letra:
1.-volcado de error//ok (ejercicio original, al añadir el catch NumberFormatException, sera la opcion 5
2.-Se imprime error
3.-No se muestra nada
4.-Error de compilación 
5.-otro error*/


//////////////////////////////////

//String es inmutable, no se ejecutaria NADA


///String a="hello";
///a.replace("h","p");
///System.out.println(a);/

///////////////////////////////////////


//String a=new String("hola");
//String b=new String("hola");
//String c=new String("Hola");
//String d=a;

//System.out.println(a==b); //FALSE
//System.out.println(a.equals(c)); FALSE
//System.out.println(a==d); TRUE, ambas vatiables apuntan al mismo objeto
//System.out.println(d==c); true

/////////////////////////////////////////


//int[] m=new int[5];
//int[] z=m;
//z[0]=10;
//System.out.println(m[0]);//10

//////////////////////////////////////////






