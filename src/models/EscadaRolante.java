package models;

/**
 * Representa uma escada rolante instalada em uma estação administrada pela Motiva,
 * controlando seu sentido de operação, status operacional e localização.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class EscadaRolante {

    //Propriedades
    private int idEscadaRolante;
    private String codigoPatrimonio;
    private SentidoEscada sentido;
    private StatusOperacional statusOperacional;
    private Estacao estacao;

    /**
     * Construtor da classe EscadaRolante.
     *
     * @param idEscadaRolante Identificador único da escada rolante
     * @param codigoPatrimonio Código patrimonial de identificação do equipamento
     * @param sentido Sentido de movimentação da escada rolante (ex: subida, descida)
     * @param statusOperacional Status atual de funcionamento da escada (ex: operacional, manutenção)
     * @param estacao Estação onde a escada rolante está localizada
     */
    public EscadaRolante(int idEscadaRolante, String codigoPatrimonio, SentidoEscada sentido, StatusOperacional statusOperacional, Estacao estacao) {
        this.idEscadaRolante = idEscadaRolante;
        this.codigoPatrimonio = codigoPatrimonio;
        this.sentido = sentido;
        this.statusOperacional = statusOperacional;
        this.estacao = estacao;
    }

    /**
     * Retorna o identificador único da escada rolante.
     *
     * @return O ID da escada rolante
     */
    public int getIdEscadaRolante() {
        return idEscadaRolante;
    }

    /**
     * Retorna o código patrimonial da escada rolante.
     *
     * @return O código de patrimônio do equipamento
     */
    public String getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    /**
     * Retorna o sentido atual de funcionamento da escada rolante.
     *
     * @return O sentido da escada (instância de SentidoEscada)
     */
    public SentidoEscada getSentido() {
        return sentido;
    }

    /**
     * Retorna o status operacional atual da escada rolante.
     *
     * @return O status operacional (instância de StatusOperacional)
     */
    public StatusOperacional getStatusOperacional() {
        return statusOperacional;
    }

    /**
     * Retorna a estação onde a escada rolante está instalada.
     *
     * @return O objeto Estacao vinculado
     */
    public Estacao getEstacao() {
        return estacao;
    }

    /**
     * Define o identificador único da escada rolante.
     *
     * @param idEscadaRolante O novo ID da escada rolante
     */
    public void setIdEscadaRolante(int idEscadaRolante) {
        this.idEscadaRolante = idEscadaRolante;
    }

    /**
     * Define o código patrimonial da escada rolante.
     *
     * @param codigoPatrimonio O novo código de patrimônio
     */
    public void setCodigoPatrimonio(String codigoPatrimonio) {
        this.codigoPatrimonio = codigoPatrimonio;
    }

    /**
     * Define o sentido de funcionamento da escada rolante.
     *
     * @param sentido O novo sentido (instância de SentidoEscada)
     */
    public void setSentido(SentidoEscada sentido) {
        this.sentido = sentido;
    }

    /**
     * Define o status operacional da escada rolante.
     *
     * @param statusOperacional O novo status operacional (instância de StatusOperacional)
     */
    public void setStatusOperacional(StatusOperacional statusOperacional) {
        this.statusOperacional = statusOperacional;
    }

    /**
     * Define a estação onde a escada rolante está instalada.
     *
     * @param estacao O novo objeto Estacao vinculado
     */
    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    /**
     * Retorna uma representação em formato de texto (String) da escada rolante.
     *
     * @return Uma String contendo todos os atributos e valores da escada rolante
     */
    @Override
    public String toString() {
        return "EscadaRolante{" +
                "idEscadaRolante=" + idEscadaRolante +
                ", codigoPatrimonio='" + codigoPatrimonio + '\'' +
                ", sentido=" + sentido +
                ", statusOperacional=" + statusOperacional +
                ", estacao=" + estacao +
                '}';
    }
}