package mode;

import java.util.Scanner;

public class EmpleadosViasta {

	public static void main(String[] args) {
		
		public class EmpleadosMenu {
			static EmpleadosService service=new EmpleadosService();
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
				System.out.println("email empleado:");
				String email=sc.nextLine();
				System.out.println("Edad empleado:");
				String edad=sc.nextLine();
				if(service.agregarEmpleado(codigo, nombre)) {
					System.out.println("Añadido!");
				}else {
					System.out.println("Código ya existente, no se añadió!");
				}
			}
			static void buscarEmpleado() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Código empleado:");
				int codigo=Integer.parseInt(sc.nextLine());
				String nombre=service.buscarEmpleado(codigo);
				if(nombre==null) {
					System.out.println("No existe empleado");
				}else {
					System.out.println("El empleado es: "+nombre);
				}
			}
			static void eliminarEmpleado() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Código empleado:");
				int codigo=Integer.parseInt(sc.nextLine());
				empleadoServiceObjet=service.eliminarEmpleado(codigo);
				if(emp==null) {
					System.out.println("No existe empleado");
				}else {
					System.out.println("El empleado eliminado es: "+emp.getNombre);
				}
			}
			static void mostrarEmpleados() {
				String[] empleados=service.todosEmpleados();
				//System.out.println("Empleados: "+Arrays.toString(empleados));
			}for(EmpleadosServiceObj e:EmpleadosServiceObj) {
				System.out.println("Nombre: "+e.getNombre()+ " Edad:"+e.getEdad());
				
			}
		}


	}

}
