package models;

/**
 * Define os estados operacionais possíveis de uma escada rolante,
 * indicando se está funcionando, em manutenção ou apresentando falhas.
 *
 * @author Vinicius Nathan
 * @version 1.0
 * @since 2026-10
 */
public enum StatusOperacional {
    OPERACIONAL,
    MANUTENCAO,
    FALHA
}