package Gerais;



public class CadastroDeDoacao {
	private String nomeDoador;
	private String CPF;
	private String tipoDeDoacao;
	private String seraRepetitivoADoacao;

	


	public CadastroDeDoacao(String nomeDoador, String cPF, String tipoDeDoacao, String seraRepetitivoADoacao) {
		this.nomeDoador = nomeDoador;
		this.CPF = cPF;
		this.tipoDeDoacao = tipoDeDoacao;
		this.seraRepetitivoADoacao = seraRepetitivoADoacao;
	}


	public CadastroDeDoacao() {
	}


	public String getNomeDoador() {
		return nomeDoador;
	}


	public void setNomeDoador(String nomeDoador) {
		this.nomeDoador = nomeDoador;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getTipoDeDoacao() {
		return tipoDeDoacao;
	}


	public void setTipoDeDoacao(String tipoDeDoacao) {
		this.tipoDeDoacao = tipoDeDoacao;
	}


	public String getSeraRepetitivoADoacao() {
		return seraRepetitivoADoacao;
	}


	public void setSeraRepetitivoADoacao(String seraRepetitivoADoacao) {
		this.seraRepetitivoADoacao = seraRepetitivoADoacao;
	}


	
	
	

}
