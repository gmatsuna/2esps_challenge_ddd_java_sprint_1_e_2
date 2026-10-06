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

    //Propriedades
    private int idComponente;
    private String nomeComponente;
    private double horasOperacao;
    private double limiteMaxHoras;
    private EscadaRolante escadaRolante;

    /**
     * Construtor da classe ComponenteMecanico.
     *
     * @param idComponente Identificador único do componente
     * @param nomeComponente Nome descritivo do componente mecânico
     * @param horasOperacao Quantidade de horas de operação acumuladas
     * @param limiteMaxHoras Limite máximo de horas antes da manutenção recomendada
     * @param escadaRolante Escada rolante à qual este componente pertence
     */

    //Contrutores
    public ComponenteMecanico(int idComponente, String nomeComponente, double horasOperacao, double limiteMaxHoras, EscadaRolante escadaRolante) {
        this.idComponente = idComponente;
        this.nomeComponente = nomeComponente;
        this.horasOperacao = horasOperacao;
        this.limiteMaxHoras = limiteMaxHoras;
        this.escadaRolante = escadaRolante;
    }

    //Getters
    /**
     * Retorna o identificador do componente.
     *
     * @return ID do componente
     */
    public int getIdComponente() {
        return idComponente;
    }

    /**
     * Retorna o nome do componente.
     *
     * @return Nome do componente
     */
    public String getNomeComponente() {
        return nomeComponente;
    }

    /**
     * Retorna as horas de operação atuais.
     *
     * @return As horas de operação acumuladas
     */
    public double getHorasOperacao() {
        return horasOperacao;
    }

    /**
     * Retorna o limite máximo de horas de operação.
     *
     * @return O limite máximo de horas
     */
    public double getLimiteMaxHoras() {
        return limiteMaxHoras;
    }

    /**
     * Retorna a escada rolante associada ao componente.
     *
     * @return O objeto EscadaRolante vinculado
     */
    public EscadaRolante getEscadaRolante() {
        return escadaRolante;
    }

    //Setters
    /**
     * Define o identificador do componente.
     *
     * @param idComponente Novo ID do componente
     */
    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    /**
     * Define o nome do componente.
     *
     * @param nomeComponente Novo nome do componente
     */
    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    /**
     * Define as horas de operação do componente.
     *
     * @param horasOperacao As novas horas de operação acumuladas
     */
    public void setHorasOperacao(double horasOperacao) {
        this.horasOperacao = horasOperacao;
    }

    /**
     * Define o limite máximo de horas de operação.
     *
     * @param limiteMaxHoras O novo limite máximo de horas
     */
    public void setLimiteMaxHoras(double limiteMaxHoras) {
        this.limiteMaxHoras = limiteMaxHoras;
    }

    /**
     * Define a escada rolante associada ao componente.
     *
     * @param escadaRolante O novo objeto EscadaRolante vinculado
     */
    public void setEscadaRolante(EscadaRolante escadaRolante) {
        this.escadaRolante = escadaRolante;
    }

    /**
     * Retorna uma representação em formato de texto (String) do componente mecânico.
     *
     * @return Uma String contendo os atributos e valores do componente
     */
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
