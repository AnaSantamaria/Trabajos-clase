import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursosFichero {

	public static void main(String[] args) {
		String [] cursos= {
				"Java básico",
				"Python para principaiantes",
				"Java EE en Web",
				"JavaScript en Front",
				"POO con Java",
				"Python y Django",
				"Desarrollo Web con ASP.NET",
				"Aplicaciones Web con Python"
			};
			
			//solicitamos por teclado la introducción de un 
			//nombre y guardaremos en un fichero todos los
			//cursos que contengan ese nombre
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el nombre");
		String nombre=sc.nextLine();
		guardarRuta(nombre,cursos);		
	}

	
  static void guardarRuta(String nombre,String[]cursos) {
	  String ruta="nombre.txt";
	  try {
		PrintStream out = new PrintStream(ruta);  //Lo primero es crearme un objeto
		for(String c:cursos) {
			if(c.contains(nombre)) {
				out.print(c+"\n");
			}
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}

	
	
	
	
}
	
	

}
