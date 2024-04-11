package utilidades;

import java.time.LocalDate;

import model.Pedido;

public class Util {

	public static Pedido convertirCadenaAPedido(String linea) {
		String[] datos = linea.split(",");

		return new Pedido(datos[0], // El nombre está en la primera posiciom
				Integer.parseInt(datos[1]), // Las unidades en la segunda
				LocalDate.parse(datos[2])// La fecha en la tercera
		);

	}

	public static String convertirPedidoACadena(Pedido pedido) {

		return pedido.getProducto() + "," + pedido.getUnidades() + "," + pedido.getFechaPedido();
	}
}
