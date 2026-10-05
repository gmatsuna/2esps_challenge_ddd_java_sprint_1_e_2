package models;

public class TecnicoManutencao {
    private int idTecManutencao;
    private String nomeTecManutencao;
    private String cpfTecManutencao;
    private EspecialidadeTecnico especialidadeTecManutencao;

    //Contrutores
    public TecnicoManutencao(int idTecManutencao, String nomeTecManutencao, String cpfTecManutencao, EspecialidadeTecnico especialidadeTecManutencao) {
        this.idTecManutencao = idTecManutencao;
        this.nomeTecManutencao = nomeTecManutencao;
        this.cpfTecManutencao = cpfTecManutencao;
        this.especialidadeTecManutencao = especialidadeTecManutencao;
    }

    //Getters
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

    //Setters
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
