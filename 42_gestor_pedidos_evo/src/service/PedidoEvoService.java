package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashSet;

import model.PedidoEvo;

public class PedidoEvoService {

	HashSet<PedidoEvo> pedidos = new HashSet<>();

	public void nuevoPedido(PedidoEvo pedido) {
		pedidos.add(pedido);
	}

	public PedidoEvo pedidoMasReciente() {
		PedidoEvo pAux = null;
		LocalDate fMax = LocalDate.of(0, 1, 1); // 1/1/1970
		for (PedidoEvo p : pedidos) {
			// si encontramos pedido con fecha más reciente que fMax
			// actualizamos fMax y pAux
			if (p.getFechaPedido().isAfter(fMax)) {
				fMax = p.getFechaPedido();
				pAux = p;
			}
		}
		return pAux;
	}

	public ArrayList<PedidoEvo> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
	ArrayList<PedidoEvo> aux=new ArrayList<PedidoEvo>();
	for(PedidoEvo p:pedidos) {
		//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
		if(p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
			aux.add(p);
		}
	}
	}

	public PedidoEvo PedidoProximoAFecha(LocalDate fecha) {
		PedidoEvo pAux = new PedidoEvo();
		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		for (PedidoEvo p : pedidos) {
			if (Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha)) < Math
					.abs(ChronoUnit.DAYS.between(pAux.getFechaPedido(), fecha))) {
			}

		}
		return pAux;
	}
}
