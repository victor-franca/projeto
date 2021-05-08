package funcionario;

public class CadastroTrabalho {

	private String cep;
	private String endereco;
	private int numero;
	private String descricaoDoTrabalho;
	
	
	public CadastroTrabalho(String cep, String endereco, int numero, String descricaoDoTrabalho) {
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.descricaoDoTrabalho = descricaoDoTrabalho;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getDescricaoDoTrabalho() {
		return descricaoDoTrabalho;
	}


	public void setDescricaoDoTrabalho(String descricaoDoTrabalho) {
		this.descricaoDoTrabalho = descricaoDoTrabalho;
	}
	
	
	
	
	
}
