package gerais;

import java.util.ArrayList;
import java.util.List;

public class CadastroGeralDePessoas {
	private String nome;
	private String cpf;
	private int idade ;
	private String cnpj;
	
	List <CadastroGeralDePessoas> lista = new ArrayList <> ();

	public CadastroGeralDePessoas(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	
	public CadastroGeralDePessoas(String nome, String cnpj) {
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
	
	
	
	public void cadastrarNovoVoluntario (CadastroGeralDePessoas individuo) {
		 lista.add(individuo);
	}
	
	public void removerVoluntario (CadastroGeralDePessoas individuo) {
		lista.remove(individuo);
	}



	
	
	

}
