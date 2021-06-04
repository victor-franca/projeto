/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import voluntario.Doacao;

/**
 *
 * @author Victor
 */
public class RespostaDaDoacao {
    
    private String RespostaDaDoacao;
    private Doacao doacao;

    public RespostaDaDoacao(String RespostaDaDoacao, Doacao doacao) {
        this.RespostaDaDoacao = RespostaDaDoacao;
        this.doacao = doacao;
    }

    public RespostaDaDoacao() {
    }

    public String getRespostaDaDoacao() {
        return RespostaDaDoacao;
    }

    public void setRespostaDaDoacao(String RespostaDaDoacao) {
        this.RespostaDaDoacao = RespostaDaDoacao;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }

    @Override
    public String toString() {
        return "Resposta Da Doacao" + RespostaDaDoacao + "\n Doacao" + doacao;
    }
    
    
    
}
