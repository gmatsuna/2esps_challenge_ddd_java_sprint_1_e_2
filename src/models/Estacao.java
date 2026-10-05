package models;

public class Estacao {

    //Propriedades
    private  int idEstacao;
    private String nomeEstacao;
    private LinhaMotiva linhaEstacao;

    //Construtor


    public Estacao(int idEstacao, String nomeEstacao, LinhaMotiva linhaEstacao) {
        this.idEstacao = idEstacao;
        this.nomeEstacao = nomeEstacao;
        this.linhaEstacao = linhaEstacao;
    }

    //Getters
    public int getIdEstacao() {
        return idEstacao;
    }

    public String getNomeEstacao() {
        return nomeEstacao;
    }

    public LinhaMotiva getLinhaEstacao() {
        return linhaEstacao;
    }

    //Setters
    public void setIdEstacao(int idEstacao) {
        this.idEstacao = idEstacao;
    }

    public void setNomeEstacao(String nomeEstacao) {
        this.nomeEstacao = nomeEstacao;
    }

    public void setLinhaEstacao(LinhaMotiva linhaEstacao) {
        this.linhaEstacao = linhaEstacao;
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "idEstacao=" + idEstacao +
                ", nomeEstacao='" + nomeEstacao + '\'' +
                ", linhaEstacao=" + linhaEstacao +
                '}';
    }
}
