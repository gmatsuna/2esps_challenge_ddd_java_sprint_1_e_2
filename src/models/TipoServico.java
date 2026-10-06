package models;

/**
 * Define os tipos de serviços de manutenção que podem ser realizados
 * nas escadas rolantes e seus componentes.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public enum TipoServico {

    /** Manutenção preventiva programada para evitar desgastes e falhas futuras. */
    PREVENTIVA,

    /** Manutenção corretiva realizada após a ocorrência de uma falha ou pane no equipamento. */
    CORRETIVA,

    /** Manutenção preditiva baseada no monitoramento contínuo das horas de operação e desempenho. */
    PREDITIVA
}