package com.micro.archivos;

public class Ciudad {
	
	private String clave;
	private String descripcion;
	
	
	public Ciudad(String clave, String descripcion) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
	}
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//imprimir todo en una sola linea
	@Override
	public String toString() {
		return "Ciudad [clave=" + clave + ", descripcion=" + descripcion + "]";
	}
	
		

}
