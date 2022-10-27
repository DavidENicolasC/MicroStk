package com.micro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//Esta anotacion nos ayuda a escribir setter y getter sin necesidad de escribirlos**/
@Data
//indicamos que vamos a mapear la coleccion que esta en mongoDB**/
@Document(value = "Ciudades")
public class Ciudad {
	@Id
	private String id;
	private String descripcion;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
