package mode;

import java.util.HashMap;

public class EmpleadosServiceObj {
	/*
	 * Realizar un programa para la gestión de empleados de una empresa. Un empleado
	 * se caracteriza por un nombre,email, edad y tiene asociado un código de empleado. al
	 * iniciar el programa, aparecerá el siguiente menú: 1.- Nuevo empleado 2.-
	 * Buscar empleado 3.- Eliminar empleado 4.- Mostrar nombres de todos los
	 * empleados 5.- Salir
	 * 
	 * 1: Se pide el nómbre, email, edad  y código del empleado. Si no existe empleado con ese
	 * código, se guarda, pero si el código ya existe, no se guarda y se muestra
	 * advertencia al usuario 2: Se pide el código del empleado y se muestra su
	 * nombre 3: Se pìde el código del empleado y se borra, indicando un mensaje que
	 * diga el nombre del empleado que se ha borrado 4.- Muestra nombres de todos
	 * los empleados
	 * 
	 * }
	 */
//variables: 

	// Metodos:

	private int codigo; //int  Luego generar construcructor con boton derecho; getters and setters)
    private int edad;
    private String nombre;
    private String email;

public EmpleadosServiceObj(int codigo, int edad, String nombre, String email) {
	
	this.codigo = codigo;
	this.edad = edad;
	this.nombre = nombre;
	this.email = email;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public EmpleadosServiceObj() {
	
}



}
		

	