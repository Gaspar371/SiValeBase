package com.sivale.sivaleclientes.cliente;

public class DetailClientTO {

	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer id;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public DetailClientTO(String nombre, String apellido, Integer edad, Integer id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.id = id;
	}

	public DetailClientTO() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
