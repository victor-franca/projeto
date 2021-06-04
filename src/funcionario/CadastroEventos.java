package funcionario;

import java.util.ArrayList;

public class CadastroEventos {
	
        private int codigoEvento;
	private double valorGastoParaExecutaOEvento;
	private String objetivoDoEvento;
	private String dataDoEvento;
	private String duracaoEvento;
	private double metaArrecadacaoEvento;
	private Funcionario funcionarioResposavelPeloEvento;
        private CadastroTrabalho cadastroTrabalho;
        
    

    public CadastroEventos() {
    }
   
    public CadastroEventos(int codigoEvento,double valorGastoParaExecutaOEvento, String objetivoDoEvento, String dadaDoEvento, String duracaoEvento, double metaArrecadacaoEvento, Funcionario funcionarioResposavelPeloEvento, CadastroTrabalho cadastroTrabalho ) {
        this.codigoEvento = codigoEvento;
        this.valorGastoParaExecutaOEvento = valorGastoParaExecutaOEvento;
        this.objetivoDoEvento = objetivoDoEvento;
        this.dataDoEvento = dadaDoEvento;
        this.duracaoEvento = duracaoEvento;
        this.metaArrecadacaoEvento = metaArrecadacaoEvento;
        this.funcionarioResposavelPeloEvento = funcionarioResposavelPeloEvento;
        this.cadastroTrabalho = cadastroTrabalho;
    }

    
    
    /*public CadastroEventos(ArrayList<String> nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }*/
      
    public ArrayList<String> listaCadastroVoluntarios = new ArrayList <> ();
    
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

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }


    public ArrayList<String> getListaCadastroVoluntarios() {
        return listaCadastroVoluntarios;
    }

    public void setListaCadastroVoluntarios(ArrayList<String> listaCadastroVoluntarios) {
        this.listaCadastroVoluntarios = listaCadastroVoluntarios;
    }

    
    public String cadastroEVerificacaoDeQuantidadeDeVagas (String voluntario){
        if (cadastroTrabalho.getQuantidadeVagas()>= listaCadastroVoluntarios.size()){
            listaCadastroVoluntarios.add(voluntario);
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
        return "Cadastro Eventos: \n" +"Codigo do Evento: "+codigoEvento+ " Valor Gasto Para Executa O Evento: " + valorGastoParaExecutaOEvento + ", Objetivo Do Evento: " + objetivoDoEvento + ", Dada Do Evento: " + dataDoEvento+ ", Duracão do Evento: " + duracaoEvento + ", Meta Arrecadacão do Evento: " + metaArrecadacaoEvento + ", Funcionario Resposavel Pelo Evento: " + funcionarioResposavelPeloEvento.getNome() +"\nCadastro de Trabalho: " + cadastroTrabalho + "\n Lista de Voluntarios: "+listaCadastroVoluntarios ;
    }
    
    
}
