/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voluntario;

import gerais.CadastroGeral;

/**
 *
 * @author Victor
 */
public class CadastroVoluntarioCNPJ extends CadastroGeral{
    
    private String cnpj;
    private String tempoDisponivel;

    public CadastroVoluntarioCNPJ(String cnpj, String tempoDisponivel, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.cnpj = cnpj;
        this.tempoDisponivel = tempoDisponivel;
    }

    
    public CadastroVoluntarioCNPJ() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "\n Nome: "+getNome()+" Idade: "+getIdade()+" Endereço: "+getEndereco()+" CPF: "+getCnpj()+" Tempo Disponível: "+getTempoDisponivel();
    }

       
}
