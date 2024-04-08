package model;

public class Ciudades {
	
	private String atributoCiudad;
	private String atributoPais;
	private int atributoPoblación;


	public Ciudades() {
		super();
	}


	public Ciudades(String atributoCiudad, String atributoPais, int atributoPoblación) {
		super();
		this.atributoCiudad = atributoCiudad;
		this.atributoPais = atributoPais;
		this.atributoPoblación = atributoPoblación;
	}


	public String getAtributoCiudad() {
		return atributoCiudad;
	}


	public void setAtributoCiudad(String atributoCiudad) {
		this.atributoCiudad = atributoCiudad;
	}


	public String getAtributoPais() {
		return atributoPais;
	}


	public void setAtributoPais(String atributoPais) {
		this.atributoPais = atributoPais;
	}


	public int getAtributoPoblación() {
		return atributoPoblación;
	}


	public void setAtributoPoblación(int atributoPoblación) {
		this.atributoPoblación = atributoPoblación;
	}




}
