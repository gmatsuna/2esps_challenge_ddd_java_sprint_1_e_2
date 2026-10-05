package models;

public class ComponenteMecanico {
    private int idComponente;
    private String nomeComponente;
    private double horasOperacao;
    private double limiteMaxHoras;
    private EscadaRolante escadaRolante;

    //Contrutores
    public ComponenteMecanico(int idComponente, String nomeComponente, double horasOperacao, double limiteMaxHoras, EscadaRolante escadaRolante) {
        this.idComponente = idComponente;
        this.nomeComponente = nomeComponente;
        this.horasOperacao = horasOperacao;
        this.limiteMaxHoras = limiteMaxHoras;
        this.escadaRolante = escadaRolante;
    }

    //Getters
    public int getIdComponente() {
        return idComponente;
    }

    public String getNomeComponente() {
        return nomeComponente;
    }

    public double getHorasOperacao() {
        return horasOperacao;
    }

    public double getLimiteMaxHoras() {
        return limiteMaxHoras;
    }

    public EscadaRolante getEscadaRolante() {
        return escadaRolante;
    }

    //Setters
    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public void setHorasOperacao(double horasOperacao) {
        this.horasOperacao = horasOperacao;
    }

    public void setLimiteMaxHoras(double limiteMaxHoras) {
        this.limiteMaxHoras = limiteMaxHoras;
    }

    public void setEscadaRolante(EscadaRolante escadaRolante) {
        this.escadaRolante = escadaRolante;
    }

    @Override
    public String toString() {
        return "ComponenteMecanico{" +
                "idComponente=" + idComponente +
                ", nomeComponente='" + nomeComponente + '\'' +
                ", horasOperacao=" + horasOperacao +
                ", limiteMaxHoras=" + limiteMaxHoras +
                ", escadaRolante=" + escadaRolante +
                '}';
    }
}
