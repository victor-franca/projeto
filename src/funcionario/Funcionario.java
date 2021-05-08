package funcionario;

import java.util.List;

import gerais.UsuarioLongarNoSistema;
import voluntario.Doacao;

public class Funcionario {

	UsuarioLongarNoSistema usuario;
	Doacao doacao;
	List<Doacao> listDoacao;

	public String aceitarDoacao(int decisao) {
		listDoacao.remove(decisao);
		return "REMOVIDO COM SUCESSO";
	}
	
	
	
	
	
}
