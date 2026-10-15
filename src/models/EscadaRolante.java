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

    /** Propriedade do tipo INT - Identificador único da escada rolante. */
    private int idEscadaRolante;

    /** Propriedade do tipo String - Código patrimonial de identificação do equipamento. */
    private String codigoPatrimonio;

    /** Propriedade do tipo SentidoEscada - Sentido de movimentação da escada rolante (ex: Subida, Descida).
     * @see SentidoEscada
     */
    private SentidoEscada sentido;

    /** Propriedade do tipo StatusOperacional - Status atual de funcionamento da escada (ex: Operacional, Em Manutenção).
     * @see StatusOperacional
     */
    private StatusOperacional statusOperacional;

    /** Propriedade do tipo Estacao - Estação onde a escada rolante está localizada.
     * @see Estacao
     */
    private Estacao estacao;

    // Construtores
    public EscadaRolante(int idEscadaRolante, String codigoPatrimonio, SentidoEscada sentido, StatusOperacional statusOperacional, Estacao estacao) {
        this.idEscadaRolante = idEscadaRolante;
        this.codigoPatrimonio = codigoPatrimonio;
        this.sentido = sentido;
        this.statusOperacional = statusOperacional;
        this.estacao = estacao;
    }

    // Getters
    public int getIdEscadaRolante() {
        return idEscadaRolante;
    }

    public String getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    public SentidoEscada getSentido() {
        return sentido;
    }

    public StatusOperacional getStatusOperacional() {
        return statusOperacional;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    // Setters
    public void setIdEscadaRolante(int idEscadaRolante) {
        this.idEscadaRolante = idEscadaRolante;
    }

    public void setCodigoPatrimonio(String codigoPatrimonio) {
        this.codigoPatrimonio = codigoPatrimonio;
    }

    public void setSentido(SentidoEscada sentido) {
        this.sentido = sentido;
    }

    public void setStatusOperacional(StatusOperacional statusOperacional) {
        this.statusOperacional = statusOperacional;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

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