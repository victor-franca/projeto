package gerais;

public class UsuarioLongarNoSistema {
	private String usuario;
	private String senha;
	
	public UsuarioLongarNoSistema(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public UsuarioLongarNoSistema() {
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String usuario_Longado () {
		return "Usuario Longado com Sucesso!"+getUsuario();
	}
}
