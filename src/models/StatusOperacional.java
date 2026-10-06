package models;

/**
 * Define os estados operacionais possíveis de uma escada rolante,
 * indicando se está funcionando, em manutenção ou apresentando falhas.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public enum StatusOperacional {

    /** Equipamento em pleno funcionamento e disponível para uso dos passageiros. */
    OPERACIONAL,

    /** Equipamento temporariamente interditado para realização de manutenção. */
    MANUTENCAO,

    /** Equipamento parado devido a uma falha mecânica, elétrica ou acionamento de segurança. */
    FALHA
}