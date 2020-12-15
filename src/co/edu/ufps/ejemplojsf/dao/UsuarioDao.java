package co.edu.ufps.ejemplojsf.dao;

import java.util.List;

import co.edu.ufps.ejemplojsf.model.Usuario;
import co.edu.ufps.ejemplojsf.util.Conexion;


public class UsuarioDao {

private Conexion<Usuario> conexion= new Conexion();
	
	
	public UsuarioDao() {
		this.conexion = new Conexion(Usuario.class);
	}
	
	public Usuario select(String id) {
		
		return conexion.find(id);
		
	}
	
	public List<Usuario> selectAll(){
		
		
		return conexion.list();
	}
	
	
	public void insert(Usuario o) {
		
		conexion.insert(o);
		
		
	}
	public void update(Usuario o) {
		
		conexion.update(o);
		
	}
	public void delete(String id) {
		
		conexion.delete(conexion.find(id));
		
	}
	
}
