package funcionario;

public class CadastroTrabalho {

	private String tipoDeTrabalho;
        private int quantidadeVagas;

    public CadastroTrabalho(String tipoDeTrabalho, int quantidadeVagas) {
        this.tipoDeTrabalho = tipoDeTrabalho;
        this.quantidadeVagas = quantidadeVagas;
    }
        
    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }

    public String getTipoDeTrabalho() {
        return tipoDeTrabalho;
    }

    public void setTipoDeTrabalho(String tipoDeTrabalho) {
        this.tipoDeTrabalho = tipoDeTrabalho;
    }

    @Override
    public String toString() {
        return "CadastroTrabalho{" + "tipoDeTrabalho=" + tipoDeTrabalho + ", quantidadeVagas=" + quantidadeVagas + '}';
    }
}
