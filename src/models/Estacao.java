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

    //Propriedades
    private int idEstacao;
    private String nomeEstacao;
    private LinhaMotiva linhaEstacao;

    /**
     * Construtor da classe Estacao.
     *
     * @param idEstacao Identificador único da estação
     * @param nomeEstacao Nome oficial da estação
     * @param linhaEstacao Linha metroferroviária à qual a estação pertence (instância de LinhaMotiva)
     */
    public Estacao(int idEstacao, String nomeEstacao, LinhaMotiva linhaEstacao) {
        this.idEstacao = idEstacao;
        this.nomeEstacao = nomeEstacao;
        this.linhaEstacao = linhaEstacao;
    }

    /**
     * Retorna o identificador único da estação.
     *
     * @return O ID da estação
     */
    public int getIdEstacao() {
        return idEstacao;
    }

    /**
     * Retorna o nome da estação.
     *
     * @return O nome oficial da estação
     */
    public String getNomeEstacao() {
        return nomeEstacao;
    }

    /**
     * Retorna a linha do sistema operada pela estação.
     *
     * @return A linha correspondente (instância de LinhaMotiva)
     */
    public LinhaMotiva getLinhaEstacao() {
        return linhaEstacao;
    }

    /**
     * Define o identificador único da estação.
     *
     * @param idEstacao O novo ID da estação
     */
    public void setIdEstacao(int idEstacao) {
        this.idEstacao = idEstacao;
    }

    /**
     * Define o nome da estação.
     *
     * @param nomeEstacao O novo nome oficial da estação
     */
    public void setNomeEstacao(String nomeEstacao) {
        this.nomeEstacao = nomeEstacao;
    }

    /**
     * Define a linha do sistema operada pela estação.
     *
     * @param linhaEstacao A nova linha correspondente (instância de LinhaMotiva)
     */
    public void setLinhaEstacao(LinhaMotiva linhaEstacao) {
        this.linhaEstacao = linhaEstacao;
    }

    /**
     * Retorna uma representação em formato de texto (String) da estação.
     *
     * @return Uma String contendo todos os atributos e valores da estação
     */
    @Override
    public String toString() {
        return "Estacao{" +
                "idEstacao=" + idEstacao +
                ", nomeEstacao='" + nomeEstacao + '\'' +
                ", linhaEstacao=" + linhaEstacao +
                '}';
    }
}