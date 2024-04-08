package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class prueba_Escritura {

	public static void main(String[] args) {
		 //String ruta="C:\\Users\\manana\\Desktop\\Manana\\PruebaEscritura\\Ana.txt";
		String ruta = "dias.txt";
		/*
		 * FileOutputStream fos = null; PrintStream out = null; try { fos=new
		 * FileOutputStream(ruta, true); out=new PrintStream(fos);//Lo primero es crear
		 * un objeto para llamar a los métodos out.println("lunes");
		 * out.println("martes"); out.println("miercoles");
		 * 
		 * System.out.println("Informacion almacenada correctamente");
		 * 
		 * 
		 * 
		 * } catch(FileNotFoundException ex) { ex.printStackTrace(); } catch(IOException
		 * ex) { ex.printStackTrace(); } finally { try{//nos garantiza que si o si lo
		 * que hay dentro se va a ejecutar if(fos!=null); fos.close();
		 * 
		 * 
		 * out.close(); }
		 */

		// try con recursoso

		try (FileOutputStream fos = new FileOutputStream(ruta, true); PrintStream out = new PrintStream(fos)) {

			out.println("lunes");
			out.println("martes");
			out.println("miercoles");

			System.out.println("Informacion almacenada correctamente");

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		catch (IOException ex) {
			ex.printStackTrace();

		}

	}
}
