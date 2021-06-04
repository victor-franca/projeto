package voluntario;

import java.util.ArrayList;
import java.util.Date;

public class Doacao {

	private String dataEntrega;
	private String formaDeEntregaDaDoacao;
	private String repeticaoDaDoacao;
	private double valor;
        private int codigo;
	
        private CadastroVoluntarioCPF voluntarioCPF;
        private CadastroVoluntarioCNPJ voluntarioCNPJ;

    public Doacao(int codigo,String dataEntrega, String formaDeEntregaDaDoacao, String repeticaoDaDoacao, double valor, CadastroVoluntarioCPF voluntarioCPF) {
        this.codigo = codigo;
        this.dataEntrega = dataEntrega;
        this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
        this.repeticaoDaDoacao = repeticaoDaDoacao;
        this.valor = valor;
        this.voluntarioCPF = voluntarioCPF;
    }

    public Doacao(int codigo,String dataEntrega, String formaDeEntregaDaDoacao, String repeticaoDaDoacao, double valor, CadastroVoluntarioCNPJ voluntarioCNPJ) {
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

    @Override
    public String toString() {
        return "\nDoacao: "+" Código: "+codigo + " ,Data Entrega: " + dataEntrega + ", Forma De Entrega Da Doacao " + formaDeEntregaDaDoacao + ", Repeticao Da Doacao=" + repeticaoDaDoacao + ", Valor" + valor+"\n"+"Voluntario: "+voluntarioCPF+"\n"+"Voluntario"+voluntarioCNPJ;
    }      
}
