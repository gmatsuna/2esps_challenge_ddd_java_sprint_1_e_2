package models;

public class EscadaRolante {

    //Propriedades
    private int idEscadaRolante;
    private String codigoPatrimonio;
    private SentidoEscada sentido;
    private StatusOperacional statusOperacional;
    private Estacao estacao;

    //Construtor
    public EscadaRolante(int idEscadaRolante, String codigoPatrimonio, SentidoEscada sentido, StatusOperacional statusOperacional, Estacao estacao) {
        this.idEscadaRolante = idEscadaRolante;
        this.codigoPatrimonio = codigoPatrimonio;
        this.sentido = sentido;
        this.statusOperacional = statusOperacional;
        this.estacao = estacao;
    }

    //Getters
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

    //Setters
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
