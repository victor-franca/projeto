package gerais;

import java.util.ArrayList;
import java.util.List;

public class CadastroGeral {
	private String nome;
	private String cpf;
	private int idade ;
	private String cnpj;
	
	List <CadastroGeral> lista = new ArrayList <> ();

	public CadastroGeral(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	
	public CadastroGeral(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	
	
	public void cadastrarNovoVoluntario (CadastroGeral individuo) {
		 lista.add(individuo);
	}
	
	public void removerVoluntario (CadastroGeral individuo) {
		lista.remove(individuo);
	}



	
	
	

}
