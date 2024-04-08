package model;

import java.time.LocalDate;
import java.util.Date;

public class PedidoEvo {
	private String producto;
	private int unidades;
	public LocalDate fechaPedido;
	public void Pedido(String producto, int unidades, LocalDate fechaPedido) {
		
		this.producto = producto;
		this.unidades = unidades;
		this.fechaPedido = fechaPedido;
	}
	public void Pedido() {
		
	}
		
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
}
