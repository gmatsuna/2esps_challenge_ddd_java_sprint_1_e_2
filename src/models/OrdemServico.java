package models;

import java.time.LocalDate;

public class OrdemServico {
    private int idOrdemServico;
    private LocalDate dataOrdemServico;
    private TipoServico tipoOrdemServico;
    private EscadaRolante escadaRolante;
    private TecnicoManutencao tecnicoManutencao;

    //Construtor
    public OrdemServico(int idOrdemServico, LocalDate dataOrdemServico, TipoServico tipoOrdemServico, EscadaRolante escadaRolante, TecnicoManutencao tecnicoManutencao) {
        this.idOrdemServico = idOrdemServico;
        this.dataOrdemServico = dataOrdemServico;
        this.tipoOrdemServico = tipoOrdemServico;
        this.escadaRolante = escadaRolante;
        this.tecnicoManutencao = tecnicoManutencao;
    }

    //Getters
    public int getIdOrdemServico() {
        return idOrdemServico;
    }

    public LocalDate getDataOrdemServico() {
        return dataOrdemServico;
    }

    public TipoServico getTipoOrdemServico() {
        return tipoOrdemServico;
    }

    public EscadaRolante getEscadaRolante() {
        return escadaRolante;
    }

    public TecnicoManutencao getTecnicoManutencao() {
        return tecnicoManutencao;
    }


    //Setters
    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    public void setDataOrdemServico(LocalDate dataOrdemServico) {
        this.dataOrdemServico = dataOrdemServico;
    }

    public void setTipoOrdemServico(TipoServico tipoOrdemServico) {
        this.tipoOrdemServico = tipoOrdemServico;
    }

    public void setEscadaRolante(EscadaRolante escadaRolante) {
        this.escadaRolante = escadaRolante;
    }

    public void setTecnicoManutencao(TecnicoManutencao tecnicoManutencao) {
        this.tecnicoManutencao = tecnicoManutencao;
    }


    @Override
    public String toString() {
        return "OrdemServico{" +
                "idOrdemServico=" + idOrdemServico +
                ", dataOrdemServico=" + dataOrdemServico +
                ", tipoOrdemServico=" + tipoOrdemServico +
                ", escadaRolante=" + escadaRolante +
                ", tecnicoManutencao=" + tecnicoManutencao +
                '}';
    }
}
