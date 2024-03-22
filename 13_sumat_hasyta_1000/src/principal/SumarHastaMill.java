package principal;

public class SumarHastaMill {

	public static void main(String[] args) {
		// Sumar hasta 1000. Hasta qué numero tengo que sumar, empezando por 1,
		// para llegar hasta 1000

		int resultado = 0;
		int contador = 0;

		do {
			contador++;
			resultado += contador;

		} while (resultado < 1000);

		System.out.println("El numero es "+contador);

	}

}
