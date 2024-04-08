package mode;
//clase
public class Direccion {
	//Atributos
      private String url;
      private String tematica;
      private String dirección;
      private String descripcion;
      //Constructor
	public Direccion(String url, String tematica, String dirección,String descripcion ) {
		
		this.url = url;
		this.tematica = tematica;
		this.dirección  = dirección;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//metodos
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		dirección = dirección;
	}
	
}
