package voluntario;

import gerais.CadastroGeral;
import gerais.UsuarioLongarNoSistema;

public class VoluntarioCPF extends CadastroGeral{
	private String cpf;

    public VoluntarioCPF(String cpf, int codigo, String nome, int idade, String endereco) {
        super(codigo, nome, idade, endereco);
        this.cpf = cpf;
    }

    public VoluntarioCPF(String cpf) {
        this.cpf = cpf;
    }

   

    public VoluntarioCPF() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public StringBuilder getSb() {
        return sb;
    }

    public void setSb(StringBuilder sb) {
        this.sb = sb;
    }
  
    
    
    StringBuilder sb = new StringBuilder();
    @Override
    public String toString() {
        return "\n"+getCodigo()+"-"+" Nome: "+getNome()+" Idade: "+getIdade()+" Endereço: "+getEndereco()+" CPF: "+getCpf();
    }
         
}
