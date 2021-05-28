package gerais;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastroGeral {
        
	private String nome;
	private int idade ;
	private String endereco;

    public CadastroGeral( String nome, int idade, String endereco) {
        
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public CadastroGeral() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "CadastroGeral: "+", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco;
    }

    
}
