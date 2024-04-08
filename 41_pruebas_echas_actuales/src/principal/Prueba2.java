package principal;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prueba2 {

	public static void main(String[] args) {
		//Mostrar la fecha y hora que será dentro de 1 mes, 11 dias y 4h
		
		System.out.println(LocalDateTime
				.now()
				.plusMonths(1)
				.plusDays(0)
				.plusHours(0));
			
	}

}
