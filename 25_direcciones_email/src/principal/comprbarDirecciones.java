package principal;

public class comprbarDirecciones {

	public static void main(String[] args) {
		
		String emails=   "aaaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com";

		//cuantas direcciones hay de cada dominio

				
			String [] emailsLista = emails.split(",");
			
			int contadorCom=0;
			int contadorEs=0;
			
			contadorCom=contarDominio("com" , emailsLista);
			contadorEs=contarDominio("es" ,emailsLista );
	}
	
	static int contarDominio(String dominio, String [] dirs) {
		int contador=0;
		for(String dir:dirs) {
			
			if(dir.endsWith(dominio)) {
				
				contador++;
			}
		}
		return=contador;
	}

}
