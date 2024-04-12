package vew;

import java.util.Scanner;

import model.Empleados;
import service.EmpleadosService;

public class empleadosVista {
	
	static EmpleadosService service = new EmpleadosService();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					agregarEmpleado();
					break;
				case 2:
					buscarEmpleado();
					break;
				case 3:
					eliminarEmpleado();
					break;
				case 4:
					mostrarEmpleados();
					break;
				case 5:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Opción no válida!");
			}
		}while(opcion!=5);

	}
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar empleado
				2.- Buscar empleado
				3.- Eliminar empleado
				4.- Mostrar empleados
				5.- Salir
				
				""");
	}
	static void agregarEmpleado() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		System.out.println("Nombre empleado:");
		String nombre=sc.nextLine();
		System.out.println("Email empleado:");
		String email=sc.nextLine();
		System.out.println("Edad empleado:");
		int edad=Integer.parseInt(sc.nextLine());
		
		Empleados emp=new Empleados(nombre,edad,codigo,email);
		
		service.agregarEmpleado(emp);
		
	}
	static void buscarEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		System.out.println("Resultado de la búsqueda: " + service.dameNombreEmpleado(codigo));
	}
	static void eliminarEmpleado() {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Código empleado:");
		 * int codigo=Integer.parseInt(sc.nextLine()); Empleados
		 * emp=service.eliminarEmpleado(codigo); if(emp==null) {
		 * System.out.println("No existe empleado"); }else {
		 * System.out.println("El empleado eliminado es: "+emp.getNombre()); }
		 */}
	static void mostrarEmpleados() {
		/*
		 * Empleados[] empleados=service.todosEmpleados();
		 * //System.out.println("Empleados: "+Arrays.toString(empleados)); for(Empleados
		 * e:empleados) {
		 * System.out.println("Nombre: "+e.getNombre()+" Edad:"+e.getEdad()); }
		 */
	}
}
