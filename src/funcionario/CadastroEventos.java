package funcionario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import voluntario.VoluntarioCPF;

public class CadastroEventos {
	
	private double valorGastoParaExecutaOEvento;
	private String objetivoDoEvento;
	private Date dadaDoEvento;
	private String duracaoEvento;
	private double metaArrecadacaoEvento;
	private Funcionario funcionarioResposavelPeloEvento;
        private CadastroTrabalho cadastroTrabalho;

        private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        
    public CadastroEventos(double valorGastoParaExecutaOEvento, String objetivoDoEvento, Date dadaDoEvento, String duracaoEvento, double metaArrecadacaoEvento, Funcionario funcionarioResposavelPeloEvento, CadastroTrabalho cadastroTrabalho) {
        this.valorGastoParaExecutaOEvento = valorGastoParaExecutaOEvento;
        this.objetivoDoEvento = objetivoDoEvento;
        this.dadaDoEvento = dadaDoEvento;
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

    public Date getDadaDoEvento() {
        return dadaDoEvento;
    }

    public void setDadaDoEvento(Date dadaDoEvento) {
        this.dadaDoEvento = dadaDoEvento;
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

    @Override
    public String toString() {
        return "CadastroEventos{" + "valorGastoParaExecutaOEvento=" + valorGastoParaExecutaOEvento + ", objetivoDoEvento=" + objetivoDoEvento + ", dadaDoEvento=" + sd.format(dadaDoEvento)+ ", duracaoEvento=" + duracaoEvento + ", metaArrecadacaoEvento=" + metaArrecadacaoEvento + ", funcionarioResposavelPeloEvento=" + funcionarioResposavelPeloEvento + ", cadastroTrabalho=" + cadastroTrabalho + '}';
    }
	
	
    
	
	

}
