package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;
import utilidades.util;


public class PedidosService {
	
	String fichero="pedidos.csv";
	//cada pedido se graba en una línea:
	//producto,unidades,fechaPedido
	public void borrarPedidos() {
		File file=new File(fichero);
		file.delete();
	}
	public void nuevoPedido(Pedido pedido) {
		try(FileOutputStream fos=new FileOutputStream(fichero,true);
				PrintStream out=new PrintStream(fos)){
			out.println(util.convertirPedidoACadena(pedido));
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while((linea=bf.readLine())!=null) {
				Pedido p=util.convertirCadenaAPedido(linea);
				//si encontramos pedido con fecha más reciente que fMax
				//actualizamos fMax y pAux
				if(p.fechaPedido().isAfter(fMax)) {
					fMax=p.fechaPedido();
					pAux=p;
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return pAux;
	}
	
	public ArrayList<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		ArrayList<Pedido> aux=new ArrayList<Pedido>();
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while((linea=bf.readLine())!=null) {
				Pedido p=util.convertirCadenaAPedido(linea);
				//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
				if(p.fechaPedido().compareTo(f1)>=0&&p.fechaPedido().compareTo(f2)<=0) {
					aux.add(p);
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return aux;
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		Pedido pAux=new Pedido();
		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while((linea=bf.readLine())!=null) {
				Pedido p=util.convertirCadenaAPedido(linea);
				if(Math.abs(ChronoUnit.DAYS.between(p.fechaPedido(), fecha))<
						Math.abs(ChronoUnit.DAYS.between(pAux.fechaPedido(), fecha))) {
					pAux=p;
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return pAux;
	}

}
