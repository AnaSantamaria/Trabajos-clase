package vew;

public class PedidoEvoVista {

	public static void main(String[] args) {
		import java.text.ParseException;
		import java.text.SimpleDateFormat;
		import java.util.ArrayList;
		import java.util.Date;
		import java.util.Scanner;

		import model.Pedido;
		import service.PedidosService;

		public class PedidosMenu {
			static PedidosService service=new PedidosService();
			public static void main(String[] args) throws ParseException {
				Scanner sc=new Scanner(System.in);
				int opcion;
				do {
					//presentar menu
					//leer opción y comprobar opcion elegida
					presentarMenu();
					opcion=sc.nextInt();
					switch(opcion) {
						case 1:
							agregarPedido();
							break;
						case 2:
							mostrarReciente();
							break;
						case 3:
							pedidosEntreFechas();
							break;

	}

}
