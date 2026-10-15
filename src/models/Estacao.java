package models;

/**
 * Representa uma estação do sistema de transporte metroviário administrada pela Motiva,
 * identificando seu nome e linha operacional.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class Estacao {

    /** Propriedade do tipo INT - Identificador único da estação. */
    private int idEstacao;

    /** Propriedade do tipo String - Nome oficial da estação. */
    private String nomeEstacao;

    /** Propriedade do tipo LinhaMotiva - Linha metroviária à qual a estação pertence.
     * @see LinhaMotiva
     */
    private LinhaMotiva linhaEstacao;

    // Construtores
    public Estacao(int idEstacao, String nomeEstacao, LinhaMotiva linhaEstacao) {
        this.idEstacao = idEstacao;
        this.nomeEstacao = nomeEstacao;
        this.linhaEstacao = linhaEstacao;
    }

    // Getters
    public int getIdEstacao() {
        return idEstacao;
    }

    public String getNomeEstacao() {
        return nomeEstacao;
    }

    public LinhaMotiva getLinhaEstacao() {
        return linhaEstacao;
    }

    // Setters
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