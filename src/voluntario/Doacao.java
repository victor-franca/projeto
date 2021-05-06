package voluntario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doacao {
	
	private String produtoObjeto;
	private Date dataEntrega;
	private String formaDeEntregaDaDoacao;
	private String quantidadeDoProdutoObjeto;
	private double valor;
	
	
	ArrayList <Doacao> listDoacao = new ArrayList<>();
	
	public Doacao(String produtoObjeto, Date dataEntrega, String formaDeEntregaDaDoacao,
			String quantidadeDoProdutoObjeto) {
		this.produtoObjeto = produtoObjeto;
		this.dataEntrega = dataEntrega;
		this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
		this.quantidadeDoProdutoObjeto = quantidadeDoProdutoObjeto;
	}

	
	public Doacao(Date dataEntrega, String formaDeEntregaDaDoacao, double valor) {
		this.dataEntrega = dataEntrega;
		this.formaDeEntregaDaDoacao = formaDeEntregaDaDoacao;
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
	
	public void removerDoacao (int numero) {
		listDoacao.remove(numero);
	}


	
	

}
