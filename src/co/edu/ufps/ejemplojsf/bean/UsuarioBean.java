package co.edu.ufps.ejemplojsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import co.edu.ufps.ejemplojsf.dao.UsuarioDao;
import co.edu.ufps.ejemplojsf.model.Usuario;

@ManagedBean
public class UsuarioBean {

	private String nombre = "";
	private String clave = "";
	private List<Usuario> usuarios;

	

	public String ver() {
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.select(this.nombre);

		if (usuario == null) {
			return "usuarioIncorrecto";
		}

		else {
			if (usuario.getClave().equals(this.clave)) {
				return "ingreso";
			} else {
				return "claveIncorrecta";
			}
		}
		

	}
	
	public String agregar() {
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setClave(clave);
		usuarioDao.insert(usuario);
		
				return "agregado";
	}
	
	public void listar() {
		UsuarioDao usuarioDao = new UsuarioDao();		
				setUsuarios(usuarioDao.selectAll());
	}
	
	
	public String agregarNuevo() {
		this.setNombre("");
		this.setClave("");
		return "agregaNuevo";
	}
	
	public String mostrarLista() {
		listar();
		return "MuestreLista";
	}
	
	public String volver() {
		return "volver";
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
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


}
