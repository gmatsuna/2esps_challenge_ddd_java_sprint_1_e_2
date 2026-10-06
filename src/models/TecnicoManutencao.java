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
    private int idTecManutencao;
    private String nomeTecManutencao;
    private String cpfTecManutencao;
    private EspecialidadeTecnico especialidadeTecManutencao;

    /**
     * Construtor da classe TecnicoManutencao.
     *
     * @param idTecManutencao Identificador único do técnico
     * @param nomeTecManutencao Nome completo do técnico de manutenção
     * @param cpfTecManutencao Número de CPF do técnico
     * @param especialidadeTecManutencao Especialidade técnica principal do profissional (instância de EspecialidadeTecnico)
     */
    public TecnicoManutencao(int idTecManutencao, String nomeTecManutencao, String cpfTecManutencao, EspecialidadeTecnico especialidadeTecManutencao) {
        this.idTecManutencao = idTecManutencao;
        this.nomeTecManutencao = nomeTecManutencao;
        this.cpfTecManutencao = cpfTecManutencao;
        this.especialidadeTecManutencao = especialidadeTecManutencao;
    }

    /**
     * Retorna o identificador único do técnico.
     *
     * @return O ID do técnico de manutenção
     */
    public int getIdTecManutencao() {
        return idTecManutencao;
    }

    /**
     * Retorna o nome completo do técnico.
     *
     * @return O nome do técnico de manutenção
     */
    public String getNomeTecManutencao() {
        return nomeTecManutencao;
    }

    /**
     * Retorna o CPF do técnico.
     *
     * @return O CPF cadastrado do técnico
     */
    public String getCpfTecManutencao() {
        return cpfTecManutencao;
    }

    /**
     * Retorna a especialidade técnica do profissional.
     *
     * @return A especialidade (instância de EspecialidadeTecnico)
     */
    public EspecialidadeTecnico getEspecialidadeTecManutencao() {
        return especialidadeTecManutencao;
    }

    /**
     * Define o identificador único do técnico.
     *
     * @param idTecManutencao O novo ID do técnico de manutenção
     */
    public void setIdTecManutencao(int idTecManutencao) {
        this.idTecManutencao = idTecManutencao;
    }

    /**
     * Define o nome completo do técnico.
     *
     * @param nomeTecManutencao O novo nome do técnico de manutenção
     */
    public void setNomeTecManutencao(String nomeTecManutencao) {
        this.nomeTecManutencao = nomeTecManutencao;
    }

    /**
     * Define o CPF do técnico.
     *
     * @param cpfTecManutencao O novo CPF do técnico
     */
    public void setCpfTecManutencao(String cpfTecManutencao) {
        this.cpfTecManutencao = cpfTecManutencao;
    }

    /**
     * Define a especialidade técnica do profissional.
     *
     * @param especialidadeTecManutencao A nova especialidade (instância de EspecialidadeTecnico)
     */
    public void setEspecialidadeTecManutencao(EspecialidadeTecnico especialidadeTecManutencao) {
        this.especialidadeTecManutencao = especialidadeTecManutencao;
    }

    /**
     * Retorna uma representação em formato de texto (String) do técnico de manutenção.
     *
     * @return Uma String contendo todos os atributos e valores do técnico
     */
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