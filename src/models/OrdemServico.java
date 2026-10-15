package models;

import java.time.LocalDate;

/**
 * Representa uma ordem de serviço gerada para o atendimento de manutenção
 * em uma escada rolante, vinculando a data, o tipo de serviço,
 * qual escada rolante e o técnico responsável.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class OrdemServico {

    /** Propriedade do tipo int - Identificador único da ordem de serviço. */
    private int idOrdemServico;

    /** Propriedade do tipo LocalDate - Data em que a ordem de serviço foi emitida. */
    private LocalDate dataOrdemServico;

    /**
     * Propriedade do tipo TipoServico - Tipo de serviço a ser executado.
     *
     * @see TipoServico
     */
    private TipoServico tipoOrdemServico;

    /**
     * Propriedade do tipo EscadaRolante - Escada rolante alvo da manutenção.
     *
     * @see EscadaRolante
     */
    private EscadaRolante escadaRolante;

    /**
     * Propriedade do tipo TecnicoManutencao - Técnico encarregado pela execução do serviço.
     *
     * @see TecnicoManutencao
     */
    private TecnicoManutencao tecnicoManutencao;

    // Construtores
    public OrdemServico(int idOrdemServico, LocalDate dataOrdemServico, TipoServico tipoOrdemServico, EscadaRolante escadaRolante, TecnicoManutencao tecnicoManutencao) {
        this.idOrdemServico = idOrdemServico;
        this.dataOrdemServico = dataOrdemServico;
        this.tipoOrdemServico = tipoOrdemServico;
        this.escadaRolante = escadaRolante;
        this.tecnicoManutencao = tecnicoManutencao;
    }

    // Getters
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

    // Setters
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