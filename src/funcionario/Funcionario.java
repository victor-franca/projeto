package funcionario;

import gerais.CadastroGeral;
import java.util.List;

import gerais.UsuarioLongarNoSistema;
import java.util.ArrayList;
import voluntario.Doacao;

public class Funcionario extends CadastroGeral{
        private double salario;
        

    public Funcionario(double salario, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.salario = salario;
    }

    public Funcionario() {
    }
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Nome: "+getNome()+" ,Salário: "+getSalario()+" ,Endereço: "+getEndereco()+" ,Idade: "+getIdade();
    }	
    
    
    
}
