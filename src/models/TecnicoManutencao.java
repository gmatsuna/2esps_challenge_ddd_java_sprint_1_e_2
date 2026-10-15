package models;

/**
 * Representa um técnico de manutenção encarregado da inspeção, reparo
 * e conservação das escadas rolantes, registrando sua identificação, dados pessoais
 * e especialidade técnica.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class TecnicoManutencao {

    /** Propriedade do tipo int - Identificador único do técnico. */
    private int idTecManutencao;

    /** Propriedade do tipo String - Nome completo do técnico de manutenção. */
    private String nomeTecManutencao;

    /** Propriedade do tipo String - Número de CPF do técnico. */
    private String cpfTecManutencao;

    /**
     * Propriedade do tipo EspecialidadeTecnico - Especialidade técnica principal do profissional.
     *
     * @see EspecialidadeTecnico
     */
    private EspecialidadeTecnico especialidadeTecManutencao;

    // Construtores
    public TecnicoManutencao(int idTecManutencao, String nomeTecManutencao, String cpfTecManutencao, EspecialidadeTecnico especialidadeTecManutencao) {
        this.idTecManutencao = idTecManutencao;
        this.nomeTecManutencao = nomeTecManutencao;
        this.cpfTecManutencao = cpfTecManutencao;
        this.especialidadeTecManutencao = especialidadeTecManutencao;
    }

    // Getters
    public int getIdTecManutencao() {
        return idTecManutencao;
    }

    public String getNomeTecManutencao() {
        return nomeTecManutencao;
    }

    public String getCpfTecManutencao() {
        return cpfTecManutencao;
    }

    public EspecialidadeTecnico getEspecialidadeTecManutencao() {
        return especialidadeTecManutencao;
    }

    // Setters
    public void setIdTecManutencao(int idTecManutencao) {
        this.idTecManutencao = idTecManutencao;
    }

    public void setNomeTecManutencao(String nomeTecManutencao) {
        this.nomeTecManutencao = nomeTecManutencao;
    }

    public void setCpfTecManutencao(String cpfTecManutencao) {
        this.cpfTecManutencao = cpfTecManutencao;
    }

    public void setEspecialidadeTecManutencao(EspecialidadeTecnico especialidadeTecManutencao) {
        this.especialidadeTecManutencao = especialidadeTecManutencao;
    }

    @Override
    public String toString() {
        return "TecnicoManutencao{" +
                "idTecManutencao=" + idTecManutencao +
                ", nomeTecManutencao='" + nomeTecManutencao + '\'' +
                ", cpfTecManutencao='" + cpfTecManutencao + '\'' +
                ", especialidadeTecManutencao=" + especialidadeTecManutencao +
                '}';
    }
}