package ejerciciosSemanaSanta;

public class Departamentos {

	public static void main(String[] args) {
		String departamentos = "ventas-20800,administracion-17900,informatica-35000,RRHH-10350";
		String[] dep = departamentos.split(",");
		String[] nombreDepartamento = new String[dep.length];
		int[] ganancia = new int[dep.length];

		// Extraer los nombres de los departamentos y las ganancias
		for (int i = 0; i < dep.length; i++) {
			String contenidoDeDep = dep[i];
			int guion = contenidoDeDep.indexOf("-");
			nombreDepartamento[i] = contenidoDeDep.substring(0, guion);
			ganancia[i] = Integer.parseInt(contenidoDeDep.substring(guion + 1));
		}

		// Ordenar los departamentos por ganancias de mayor a menor
		for (int i = 0; i < ganancia.length - 1; i++) {
			for (int j = 0; j < ganancia.length - i - 1; j++) {
				if (ganancia[j] < ganancia[j + 1]) {
					// Intercambiar los valores de ganancia y nombreDepartamento
					int tempGanancia = ganancia[j];
					ganancia[j] = ganancia[j + 1];
					ganancia[j + 1] = tempGanancia;

					String tempNombre = nombreDepartamento[j];
					nombreDepartamento[j] = nombreDepartamento[j + 1];
					nombreDepartamento[j + 1] = tempNombre;
				}
			}
		}

		// Imprimir los nombres de los departamentos ordenados por ganancias
		System.out.println("Departamentos ordenados de mayor a menor ganancia:");
		for (int i = 0; i < nombreDepartamento.length; i++) {
			System.out.println(nombreDepartamento[i] + ": " + ganancia[i]);
		}
		
		int indiceMaxGanancia = 0;
		for (int i = 1; i < ganancia.length; i++) {
		    if (ganancia[i] > ganancia[indiceMaxGanancia]) {
		        indiceMaxGanancia = i;
		    }
		}

		// Imprimir el nombre del departamento con la mayor ganancia
		System.out.println("Departamento que ha obtenido la mayor ganancia:");
		System.out.println(nombreDepartamento[indiceMaxGanancia] + ": " + ganancia[indiceMaxGanancia]);
	}


	}



