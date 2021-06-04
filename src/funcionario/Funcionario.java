package funcionario;

import gerais.CadastroGeral;

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
        return "\n Nome: "+getNome()+" ,Salário: "+getSalario()+" ,Endereço: "+getEndereco()+" ,Idade: "+getIdade()+"\n";
    }	
    
    
    
}
