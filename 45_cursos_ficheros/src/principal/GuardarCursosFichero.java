package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursosFichero {

	public static void main(String[] args) {
		String[] cursos = {

				"Java básico", "Python para principaiantes", "Java EE en Web", "JavaScript en Front", "POO con Java",
				"Python y Django", "Desarrollo Web con ASP.NET", "Aplicaciones Web con Python"

		};
//solicitamos por teclado la introduccion de un nombre y
//guardaremos en un fichero todos los cursos que contengan
//ese nombre.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el nombre a buscar");
		String palabra=sc.nextLine();
		
		//Separar por comas
		
		
		static void guardaCursos(String nombre,String []cursos) {
			String ruta="cursos.txt";
			try( PrintStream out = new PrintStream(ruta)) {
				
				
			}catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}

			catch (IOException ex) {
				ex.printStackTrace();

			}
					for(String c:cursos) {
						
						
		}
		
		}
	}
}
		
		//String ruta="cursos.txt";
	}

}
