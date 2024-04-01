package ejerciciosSemanaSanta;

public class LoteriaReHecho {
	
	/public static void main(String[] args) {
	
	String facturacion="ventas-20800,administracion-17900,informatica-35000,RRHH-10350";
	
	String[] datos=facturacion.split(",");
	
	ordenar facturacion(datos);
	
	
//Nombre del departamento que más a facturado
  
	System.out.println("Departamento con más facturación: "+datos[datos.length-1].split("-")[0]);
	
	//Nombres de todos los departamentos, ordenados de menos a más facturación
	 
	for(String n:datos) {
		System.out.println(n.split("-")[0]);
		
		//Main hecho en clase, en casa ralizar el método (burbuja) para completar con el main
	}

} 
static void ordenarFacruracion

