package funcionario;

import gerais.CadastroGeral;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


import voluntario.CadastroVoluntarioCPF;

public class CadastroEventos {
	
	private double valorGastoParaExecutaOEvento;
	private String objetivoDoEvento;
	private String dataDoEvento;
	private String duracaoEvento;
	private double metaArrecadacaoEvento;
	private Funcionario funcionarioResposavelPeloEvento;
        private CadastroTrabalho cadastroTrabalho;
       

    public static ArrayList<CadastroGeral> cadastroVoluntarios = new ArrayList<>();    
        
    public CadastroEventos(double valorGastoParaExecutaOEvento, String objetivoDoEvento, String dadaDoEvento, String duracaoEvento, double metaArrecadacaoEvento, Funcionario funcionarioResposavelPeloEvento, CadastroTrabalho cadastroTrabalho) {
        this.valorGastoParaExecutaOEvento = valorGastoParaExecutaOEvento;
        this.objetivoDoEvento = objetivoDoEvento;
        this.dataDoEvento = dadaDoEvento;
        this.duracaoEvento = duracaoEvento;
        this.metaArrecadacaoEvento = metaArrecadacaoEvento;
        this.funcionarioResposavelPeloEvento = funcionarioResposavelPeloEvento;
        this.cadastroTrabalho = cadastroTrabalho;
    }

    
    public double getValorGastoParaExecutaOEvento() {
        return valorGastoParaExecutaOEvento;
    }

    public void setValorGastoParaExecutaOEvento(double valorGastoParaExecutaOEvento) {
        this.valorGastoParaExecutaOEvento = valorGastoParaExecutaOEvento;
    }

    public String getObjetivoDoEvento() {
        return objetivoDoEvento;
    }

    public void setObjetivoDoEvento(String objetivoDoEvento) {
        this.objetivoDoEvento = objetivoDoEvento;
    }

    public String getDadaDoEvento() {
        return dataDoEvento;
    }

    public void setDadaDoEvento(String dadaDoEvento) {
        this.dataDoEvento = dadaDoEvento;
    }

    public String getDuracaoEvento() {
        return duracaoEvento;
    }

    public void setDuracaoEvento(String duracaoEvento) {
        this.duracaoEvento = duracaoEvento;
    }

    public double getMetaArrecadacaoEvento() {
        return metaArrecadacaoEvento;
    }

    public void setMetaArrecadacaoEvento(double metaArrecadacaoEvento) {
        this.metaArrecadacaoEvento = metaArrecadacaoEvento;
    }

    public Funcionario getFuncionarioResposavelPeloEvento() {
        return funcionarioResposavelPeloEvento;
    }

    public void setFuncionarioResposavelPeloEvento(Funcionario funcionarioResposavelPeloEvento) {
        this.funcionarioResposavelPeloEvento = funcionarioResposavelPeloEvento;
    }

    public CadastroTrabalho getCadastroTrabalho() {
        return cadastroTrabalho;
    }

    public void setCadastroTrabalho(CadastroTrabalho cadastroTrabalho) {
        this.cadastroTrabalho = cadastroTrabalho;
    }

    public String getDataDoEvento() {
        return dataDoEvento;
    }

    public void setDataDoEvento(String dataDoEvento) {
        this.dataDoEvento = dataDoEvento;
    }

    
    public String cadastroEVerificacaoDeQuantidadeDeVagas (CadastroGeral cg){
        if (cadastroTrabalho.getQuantidadeVagas()>= cadastroVoluntarios.size()){
            cadastroVoluntarios.add(cg);
           int diminuiVagas = cadastroTrabalho.getQuantidadeVagas() - 1;
           cadastroTrabalho.setQuantidadeVagas(diminuiVagas);
           return "Cadastro Efetuado com Sucesso";
        }
        else {
            return "Não tem mais vagas diposniveis nesse evento";
        }
    }
    
    @Override
    public String toString() {
        return "Cadastro Eventos: \n" + " Valor Gasto Para Executa O Evento: " + valorGastoParaExecutaOEvento + ", Objetivo Do Evento: " + objetivoDoEvento + ", Dada Do Evento: " + dataDoEvento+ ", Duracão do Evento: " + duracaoEvento + ", Meta Arrecadacão do Evento: " + metaArrecadacaoEvento + ", Funcionario Resposavel Pelo Evento: " + funcionarioResposavelPeloEvento.getNome() +",Voluntarios No Evento"+ cadastroVoluntarios +"\nCadastro de Trabalho: " + cadastroTrabalho;
    }

}
