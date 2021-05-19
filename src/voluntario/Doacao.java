package voluntario;

import java.util.ArrayList;
import java.util.Date;

public class Doacao {
	
	private String produtoObjeto;
	private Date dataEntrega;
	private String formaDeEntregaDaDoacao;
	private String quantidadeDoProdutoObjeto;
	private int repeticaoDaDoacao;
	private double valor;
	//tem que ter a informação de quem vai doar (voluntario)
	
	ArrayList <Doacao> listDoacao = new ArrayList<>();
	
	
	
	public Doacao(String produtoObjeto, Date dataEntrega, String formaDeEntregaDaDoacao,
			String quantidadeDoProdutoObjeto, int repeticaoDaDoacao) {
		this.produtoObjeto = produtoObjeto;
		this.dataEntrega = dataEntrega;
		this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
		this.quantidadeDoProdutoObjeto = quantidadeDoProdutoObjeto;
		this.repeticaoDaDoacao = repeticaoDaDoacao;
	}



	public Doacao(Date dataEntrega, String formaDeEntregaDaDoacao, int repeticaoDaDoacao, double valor) {
		super();
		this.dataEntrega = dataEntrega;
		this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
		this.repeticaoDaDoacao = repeticaoDaDoacao;
		this.valor = valor;
	}





	public String getProdutoObjeto() {
		return produtoObjeto;
	}


	public void setProdutoObjeto(String produtoObjeto) {
		this.produtoObjeto = produtoObjeto;
	}


	public Date getDataEntrega() {
		return dataEntrega;
	}


	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}


	public String getFormaDeEntregaDaDoacao() {
		return formaDeEntregaDaDoacao;
	}


	public void setFormaDeEntregaDaDoacao(String formaDeEntregaDaDoacao) {
		this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
	}


	public String getQuantidadeDoProdutoObjeto() {
		return quantidadeDoProdutoObjeto;
	}


	public void setQuantidadeDoProdutoObjeto(String quantidadeDoProdutoObjeto) {
		this.quantidadeDoProdutoObjeto = quantidadeDoProdutoObjeto;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public ArrayList<Doacao> getListDoacao() {
		return listDoacao;
	}

	public void cadastrarDoacao (Doacao doacao) {
		 listDoacao.add(doacao);
	}
	
	public void removerDoacao (Doacao doacao) {
		listDoacao.remove(doacao);
	}


	
	

}
