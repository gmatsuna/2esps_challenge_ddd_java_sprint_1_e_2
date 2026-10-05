package services;

import models.ComponenteMecanico;

public class ComponenteService {

    /**
     * Verifica se o componente mecânico atingiu ou ultrapassou o limite máximo de horas de operação.
     */

    public boolean verificarLimiteHoras(ComponenteMecanico componente) {
        if (componente == null) {
            throw new IllegalArgumentException("O componente mecânico não pode ser nulo.");
        }

        return componente.getHorasOperacao() >= componente.getLimiteMaxHoras();
    }

    /**
     * Retorna uma mensagem de alerta com base na porcentagem de desgaste do componente.
     */

    public String gerarAlertaManutencao(ComponenteMecanico componente) {
        if (componente == null) {
            throw new IllegalArgumentException("O componente mecânico não pode ser nulo.");
        }

        double horasAtuais = componente.getHorasOperacao();
        double limiteMax = componente.getLimiteMaxHoras();
        double percentual = (horasAtuais / limiteMax) * 100;

        if (horasAtuais >= limiteMax) {
            return "⚠️️ ALERTA CRÍTICO: O componente '" + componente.getNomeComponente() +
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