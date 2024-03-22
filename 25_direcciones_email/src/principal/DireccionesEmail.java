package principal;



public class DireccionesEmail {

	public static void main(String[] args) {
		
		String emails=   "aaaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com";

		//cuantas direcciones hay de cada dominio

				
			String [] emailsLista = emails.split(",");
			
			int contadorCom=0;
			int contadorEs=0;
			
			for(String email:emailsLista) {
				
				if(email.contains(".com")) {
					contadorCom++;
				}
				
				else if(email.contains(".es")) {
					
					contadorEs++;
					
					
				}
				
				
				
			}
			System.out.println("Direcciones.com "+contadorCom );
			System.out.println("Direcciones.com "+contadorEs );
			
	}

}
