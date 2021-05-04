package modelo;

import Gerais.UsuarioLongarNoSistema;

public class Funcionario  {
	
	UsuarioLongarNoSistema usuario;
	
	
	public Funcionario(UsuarioLongarNoSistema usuario) {
		super();
		this.usuario = usuario;
	}

	public UsuarioLongarNoSistema getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioLongarNoSistema usuario) {
		this.usuario = usuario;
	}
	
	
}
