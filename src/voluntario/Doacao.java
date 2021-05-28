package voluntario;

import java.util.ArrayList;
import java.util.Date;

public class Doacao {

	private String dataEntrega;
	private String formaDeEntregaDaDoacao;
	private String repeticaoDaDoacao;
	private double valor;
        
	
        private CadastroVoluntarioCPF voluntarioCPF;
        private CadastroVoluntarioCNPJ voluntarioCNPJ;

    public Doacao(String dataEntrega, String formaDeEntregaDaDoacao, String repeticaoDaDoacao, double valor, CadastroVoluntarioCPF voluntarioCPF) {
        this.dataEntrega = dataEntrega;
        this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
        this.repeticaoDaDoacao = repeticaoDaDoacao;
        this.valor = valor;
        this.voluntarioCPF = voluntarioCPF;
    }

    public Doacao(String dataEntrega, String formaDeEntregaDaDoacao, String repeticaoDaDoacao, double valor, CadastroVoluntarioCNPJ voluntarioCNPJ) {
        this.dataEntrega = dataEntrega;
        this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
        this.repeticaoDaDoacao = repeticaoDaDoacao;
        this.valor = valor;
        this.voluntarioCNPJ = voluntarioCNPJ;
    }

    public Doacao() {
    }

    
    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getFormaDeEntregaDaDoacao() {
        return formaDeEntregaDaDoacao;
    }

    public void setFormaDeEntregaDaDoacao(String formaDeEntregaDaDoacao) {
        this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
    }

    public String getRepeticaoDaDoacao() {
        return repeticaoDaDoacao;
    }

    public void setRepeticaoDaDoacao(String repeticaoDaDoacao) {
        this.repeticaoDaDoacao = repeticaoDaDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CadastroVoluntarioCPF getVoluntarioCPF() {
        return voluntarioCPF;
    }

    public void setVoluntarioCPF(CadastroVoluntarioCPF voluntarioCPF) {
        this.voluntarioCPF = voluntarioCPF;
    }

    public CadastroVoluntarioCNPJ getVoluntarioCNPJ() {
        return voluntarioCNPJ;
    }

    public void setVoluntarioCNPJ(CadastroVoluntarioCNPJ voluntarioCNPJ) {
        this.voluntarioCNPJ = voluntarioCNPJ;
    }

    @Override
    public String toString() {
        return "Doacao{" + "dataEntrega=" + dataEntrega + ", formaDeEntregaDaDoacao=" + formaDeEntregaDaDoacao + ", repeticaoDaDoacao=" + repeticaoDaDoacao + ", valor=" + valor;
    }

        

    
	
	
        
        
        
}
