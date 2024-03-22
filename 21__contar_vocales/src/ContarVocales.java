
public class ContarVocales {

	public static void main(String[] args) {

		String cad = "Esto es un texto nuevo";
		// ¿Cuantas vocales tiene este texto?

		int vocales = 0;
		cad = cad.toLowerCase();

		for (int i = 0; 1 < cad.length(); i++) {

			switch (cad.charAt(i)) {
			case 'a', 'e', 'i', 'o', 'u':
				vocales++;
			}
			System.out.println("Total vocales: " + vocales);

		}
	}

}
