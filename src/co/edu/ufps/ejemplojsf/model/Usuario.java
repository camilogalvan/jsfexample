package co.edu.ufps.ejemplojsf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
@NamedQuery(name = "Usuario.findAll", query = "SELECT c FROM Usuario c")
public class Usuario {
	@Id
	@Column(length = 50)
	private String nombre = "";
	@Column(length = 50)
	private String clave = "";

	public Usuario() {

	}

	public Usuario(String nombre, String clave) {
		super();
		this.nombre = nombre;
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
