package principal;

public class comprobarDireccionesCompleto {

	public static void main(String[] args) {
		
		
		
		String emails=   "aaaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com,eeeee@gmail.net,ffff@gmail.org";
		
		//mostrar cuantas direccionesde cada domino hay
		
		static String[] dominios (String[] dirs){
			
			StringBuilder cadenaDominios=new StringBuilder("");
			
		for(String dir:dirs) {
			
			//obtenemos dominio de la direccion que estamos recorriendo
			
			String dominio=dir.substring(dir.indexOf("."))+1,dir.length());
			
			//if(cadenaDominio.indexOf(dominio==-1)) {//la cadena de dominios no contiene ese dominiog
				//añadimos el dominio a la cadena de dominio
			
			
			if(!cadenaDominios.contains(dominios))}
				cadensDominios=cadenaDominios+dominio+",";
				
			}
	}

		
		cadenaDominios=cadenaDominios.substring(0,cadenaDominios.length()-1, cadenaDominios.length());
		//transformamos StringBuilder en String para poder llamar a split
		return cadenaDominios.toString().split(",");
			
		}
//cuenta las veces que un dominio aparece en el array de direcciones
static int contarDominio(String domino,String[]dirs) {
	
	int=
	
		}

}
