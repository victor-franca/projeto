package funcionario;

import java.util.ArrayList;
import java.util.Date;

import voluntario.Voluntario;

public class CadastroEventos {
	
	private double valorGastoParaExecutaOEvento;
	private String objetivoDoEvento;
	private Date dadaDoEvento;
	private String duracaoEvento;
	private double metaArrecadacaoEvento;
	private Funcionario funcionarioResposavelPeloEvento;
	
	ArrayList <Voluntario> listVoluntarioAjudaramNoEvento = new ArrayList <>();

	public CadastroEventos(double valorGastoParaExecutaOEvento, String objetivoDoEvento, Date dadaDoEvento,
			String duracaoEvento, double metaArrecadacaoEvento, 
			Funcionario funcionarioResposavelPeloEvento, ArrayList<Voluntario> listVoluntarioAjudaramNoEvento) {
		this.valorGastoParaExecutaOEvento = valorGastoParaExecutaOEvento;
		this.objetivoDoEvento = objetivoDoEvento;
		this.dadaDoEvento = dadaDoEvento;
		this.duracaoEvento = duracaoEvento;
		this.metaArrecadacaoEvento = metaArrecadacaoEvento;
		this.funcionarioResposavelPeloEvento = funcionarioResposavelPeloEvento;
		this.listVoluntarioAjudaramNoEvento = listVoluntarioAjudaramNoEvento;
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

	public ArrayList<Voluntario> getListVoluntarioAjudaramNoEvento() {
		return listVoluntarioAjudaramNoEvento;
	}

	public void setListVoluntarioAjudaramNoEvento(ArrayList<Voluntario> listVoluntarioAjudaramNoEvento) {
		this.listVoluntarioAjudaramNoEvento = listVoluntarioAjudaramNoEvento;
	} 
	
	
	

}
