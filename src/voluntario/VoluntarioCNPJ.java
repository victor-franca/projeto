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
public class VoluntarioCNPJ extends CadastroGeral{
    
    private String cnpj;

    public VoluntarioCNPJ(String cnpj, int codigo, String nome, int idade, String endereco) {
        super(codigo, nome, idade, endereco);
        this.cnpj = cnpj;
    }

    public VoluntarioCNPJ() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    @Override
    public String toString() {
        return "\n"+getCodigo()+"-"+" Nome: "+getNome()+" Idade: "+getIdade()+" Endereço: "+getEndereco()+" CPF: "+getCnpj();
    }     
}
