package services;

import models.ComponenteMecanico;

/**
 * Serviço responsável pelas regras de negócio e validações relacionadas
 * aos componentes mecânicos das escadas rolantes, incluindo verificação de limites
 * de horas e geração de alertas preditivos.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class ComponenteService {

    /**
     * Verifica se o componente mecânico atingiu ou ultrapassou o limite máximo
     * de horas de operação estabelecido.
     *
     * @param componente O componente mecânico a ser verificado
     * @return true se as horas de operação atingiram ou superaram o limite, false caso contrário
     * @throws IllegalArgumentException se o componente fornecido for nulo
     */
    public boolean verificarLimiteHoras(ComponenteMecanico componente) {
        if (componente == null) {
            throw new IllegalArgumentException("O componente mecânico não pode ser nulo.");
        }

        return componente.getHorasOperacao() >= componente.getLimiteMaxHoras();
    }

    /**
     * Gera uma mensagem de alerta detalhada baseada no percentual de desgaste
     * da vida útil do componente mecânico (horas de operação versus limite máximo).
     *
     * @param componente O componente mecânico para o qual o alerta será gerado
     * @return Uma String contendo o nível do alerta, o nome do componente e o status de desgaste
     * @throws IllegalArgumentException se o componente fornecido for nulo
     */
    public String gerarAlertaManutencao(ComponenteMecanico componente) {
        if (componente == null) {
            throw new IllegalArgumentException("O componente mecânico não pode ser nulo.");
        }

        double horasAtuais = componente.getHorasOperacao();
        double limiteMax = componente.getLimiteMaxHoras();
        double percentual = (horasAtuais / limiteMax) * 100;

        if (horasAtuais >= limiteMax) {
            return "⚠ ALERTA CRÍTICO: O componente '" + componente.getNomeComponente() +
                    "' atingiu ou ultrapassou o limite máximo (" + horasAtuais + "/" + limiteMax + " hrs). Substituição imediata necessária!";
        } else if (percentual >= 80.0) {
            return "⚠️ ATENÇÃO: O componente '" + componente.getNomeComponente() +
                    "' está com " + String.format("%.1f", percentual) + "% da vida útil esgotada. Programe a manutenção preventiva.";
        } else {
            return "✅ O componente '" + componente.getNomeComponente() +
                    "' está operando dentro da normalidade (" + String.format("%.1f", percentual) + "% da vida útil utilizada).";
        }
    }
}