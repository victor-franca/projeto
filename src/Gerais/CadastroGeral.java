package gerais;

import java.util.ArrayList;
import java.util.List;

public class CadastroGeral {
        private int codigo;
	private String nome;
	private int idade ;
	private String endereco;

    public CadastroGeral(int codigo, String nome, int idade, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public CadastroGeral() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "CadastroGeral" + "codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco;
    }

    
       
}
