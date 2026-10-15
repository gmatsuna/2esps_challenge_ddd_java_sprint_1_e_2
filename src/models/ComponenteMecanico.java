package models;

/**
 * Representa um componente mecânico de uma escada rolante, monitorando suas horas
 * de operação e limites máximos para manutenção preditiva.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class ComponenteMecanico {

    /** Propriedade do tipo INT - Identificador único do componente mecânico. */
    private int idComponente;

    /** Propriedade do tipo String - Nome descritivo do componente mecânico (ex: Degrau, Corrimão, Corrente). */
    private String nomeComponente;

    /** Propriedade do tipo double (somente tempo) - Quantidade de horas de operação acumuladas pelo componente. */
    private double horasOperacao;

    /** Propriedade do tipo double (somente tempo) - Limite máximo de horas de operação permitido antes da manutenção recomendada. */
    private double limiteMaxHoras;

    /** Propriedade do tipo EscadaRolante - Escada rolante à qual este componente está vinculado.
     * @see EscadaRolante
     */
    private EscadaRolante escadaRolante;

    // Construtores
    public ComponenteMecanico(int idComponente, String nomeComponente, double horasOperacao, double limiteMaxHoras, EscadaRolante escadaRolante) {
        this.idComponente = idComponente;
        this.nomeComponente = nomeComponente;
        this.horasOperacao = horasOperacao;
        this.limiteMaxHoras = limiteMaxHoras;
        this.escadaRolante = escadaRolante;
    }

    // Getters
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

    // Setters
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