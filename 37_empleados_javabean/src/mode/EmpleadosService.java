package mode;

import java.util.HashMap;

public class EmpleadosService {
	
	/*
	 * Realizar un programa para la gestión de empleados de una empresa. Un empleado
	 * se caracteriza por un nombre,email, edad y tiene asociado un código de empleado. al
	 * iniciar el programa, aparecerá el siguiente menú: 1.- Nuevo empleado 2.-
	 * Buscar empleado 3.- Eliminar empleado 4.- Mostrar nombres de todos los
	 * empleados 5.- Salir
	 * 
	 * 1: Se pide el nómbre, email, edad  y código del empleado. Si no existe empleado con ese
	 * código, se guarda, pero si el código ya existe, no se guarda y se muestra
	 * advertencia al usuario 
	 * 2: Se pide el código del empleado y se muestra su
	 * nombre 
	 * 3: Se pìde el código del empleado y se borra, indicando un mensaje que
	 * diga el nombre del empleado que se ha borrado 4.- Muestra nombres de todos
	 * los empleados
	 * 
	 * }
	 */
//variables: 

	// Metodos:

	

		HashMap<Integer, EmpleadosServiceObj> empleados = new HashMap<>();

		public boolean agregarEmpleado(EmpleadosServiceObj empleadoServiceObjet ) {

			if (!empleados.containsKey(empleadoServiceObjet.getCodigo())) {
				
			     empleados.put(empleadoServiceObjet.getCodigo(), empleadoServiceObjet);
			return true;
			
			}
		

			return false;
		}

		public EmpleadosServiceObj buscarEmpleado(int codigo) {
			return empleados.get(codigo);
		}

		public EmpleadosServiceObj eliminarEmpleado(int codigo) {
			return empleados.remove(codigo);
		}

		public EmpleadosServiceObj[] todosEmpleados(int codigo) {
			return todos.toArray(new EmpleadosServiceObj[0]);

		}

}
