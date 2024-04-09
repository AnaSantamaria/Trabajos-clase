package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;
import utilidades.Util;


public class PedidosService {
 String fichero=  "pedidos.txt";
	
	public void nuevoPedido(Pedido pedido) {
	//	int pedidoDado = 0;
		try (FileOutputStream fos = new FileOutputStream(fichero, true); PrintStream out = new PrintStream(fos)) {
			out.print(Util.convertirPedidoACadena(pedido));
			
		} catch (IOException ex) {
			ex.printStackTrace();

		}
		
	}
		
	
	
	public Pedido pedidoMasReciente() {
		Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1);
	
		
	
		HashSet<LocalDate> fechas= new HashSet<LocalDate>();
		Pedido pAux=null;
		 //1/1/1970
		for(Date p:LocalDate) 
	
		
	}
		
	
	
	public ArrayList<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		
		}
		
	
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		
	}
		
}public void borrarPedido(Pedido pedidos);


