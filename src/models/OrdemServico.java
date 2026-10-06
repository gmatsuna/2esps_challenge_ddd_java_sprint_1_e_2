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
    private int idOrdemServico;
    private LocalDate dataOrdemServico;
    private TipoServico tipoOrdemServico;
    private EscadaRolante escadaRolante;
    private TecnicoManutencao tecnicoManutencao;

    /**
     * Construtor da classe OrdemServico.
     *
     * @param idOrdemServico Identificador único da ordem de serviço
     * @param dataOrdemServico Data em que a ordem de serviço foi emitida
     * @param tipoOrdemServico Tipo de serviço a ser executado (instância de TipoServico)
     * @param escadaRolante Escada rolante alvo da manutenção
     * @param tecnicoManutencao Técnico encarregado pela execução do serviço
     */
    public OrdemServico(int idOrdemServico, LocalDate dataOrdemServico, TipoServico tipoOrdemServico, EscadaRolante escadaRolante, TecnicoManutencao tecnicoManutencao) {
        this.idOrdemServico = idOrdemServico;
        this.dataOrdemServico = dataOrdemServico;
        this.tipoOrdemServico = tipoOrdemServico;
        this.escadaRolante = escadaRolante;
        this.tecnicoManutencao = tecnicoManutencao;
    }

    /**
     * Retorna o identificador único da ordem de serviço.
     *
     * @return O ID da ordem de serviço
     */
    public int getIdOrdemServico() {
        return idOrdemServico;
    }

    /**
     * Retorna a data de emissão da ordem de serviço.
     *
     * @return A data da ordem de serviço
     */
    public LocalDate getDataOrdemServico() {
        return dataOrdemServico;
    }

    /**
     * Retorna o tipo de serviço da ordem.
     *
     * @return O tipo de serviço (instância de TipoServico)
     */
    public TipoServico getTipoOrdemServico() {
        return tipoOrdemServico;
    }

    /**
     * Retorna a escada rolante associada à ordem de serviço.
     *
     * @return O objeto EscadaRolante vinculado
     */
    public EscadaRolante getEscadaRolante() {
        return escadaRolante;
    }

    /**
     * Retorna o técnico responsável pelo atendimento.
     *
     * @return O objeto TecnicoManutencao responsável
     */
    public TecnicoManutencao getTecnicoManutencao() {
        return tecnicoManutencao;
    }

    /**
     * Define o identificador único da ordem de serviço.
     *
     * @param idOrdemServico O novo ID da ordem de serviço
     */
    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    /**
     * Define a data da ordem de serviço.
     *
     * @param dataOrdemServico A nova data de emissão
     */
    public void setDataOrdemServico(LocalDate dataOrdemServico) {
        this.dataOrdemServico = dataOrdemServico;
    }

    /**
     * Define o tipo de serviço da ordem.
     *
     * @param tipoOrdemServico O novo tipo de serviço (instância de TipoServico)
     */
    public void setTipoOrdemServico(TipoServico tipoOrdemServico) {
        this.tipoOrdemServico = tipoOrdemServico;
    }

    /**
     * Define a escada rolante associada à ordem de serviço.
     *
     * @param escadaRolante O novo objeto EscadaRolante vinculado
     */
    public void setEscadaRolante(EscadaRolante escadaRolante) {
        this.escadaRolante = escadaRolante;
    }

    /**
     * Define o técnico responsável pela ordem de serviço.
     *
     * @param tecnicoManutencao O novo objeto TecnicoManutencao responsável
     */
    public void setTecnicoManutencao(TecnicoManutencao tecnicoManutencao) {
        this.tecnicoManutencao = tecnicoManutencao;
    }

    /**
     * Retorna uma representação em formato de texto (String) da ordem de serviço.
     *
     * @return Uma String contendo todos os atributos e valores da ordem de serviço
     */
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