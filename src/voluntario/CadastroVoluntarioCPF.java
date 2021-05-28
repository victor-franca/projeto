package voluntario;

import gerais.CadastroGeral;
import gerais.UsuarioLongarNoSistema;

public class CadastroVoluntarioCPF extends CadastroGeral{
	private String cpf;
        private String tempoDisponivel;

    public CadastroVoluntarioCPF(String cpf, String tempoDisponivel, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.cpf = cpf;
        this.tempoDisponivel = tempoDisponivel;
    }

    public CadastroVoluntarioCPF() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTempoDisponivel() {
        return tempoDisponivel;
    }

    public void setTempoDisponivel(String tempoDisponivel) {
        this.tempoDisponivel = tempoDisponivel;
    }
    
    
    StringBuilder sb = new StringBuilder();
    @Override
    public String toString() {
        return "\n"+" Nome: "+getNome()+" Idade: "+getIdade()+" Endereço: "+getEndereco()+" CPF: "+getCpf()+" Tempo Disponível: "+getTempoDisponivel();
    }
         
}
