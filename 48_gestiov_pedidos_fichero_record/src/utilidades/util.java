package utilidades;

import java.time.LocalDate;

import model.Pedido;

public class util {
	
	public static Pedido convertirCadenaAPedido(String linea) {
		String [] datos=linea.split(",");
		return new Pedido(datos[0],
				Integer.parseInt(datos[1]),
				LocalDate.parse(datos[2])
				);
	}
	public static String convertirPedidoACadena(Pedido pedido) {
		return pedido.producto()+","+pedido.unidades()+","+pedido.fechaPedido();//En vez de lo get, se pone solo el nombre del atributo
	}

}
