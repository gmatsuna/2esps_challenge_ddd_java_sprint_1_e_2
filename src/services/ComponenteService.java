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
     * @param componente O objeto do tipo ComponenteMecanico a ser verificado
     * @return true se as horas de operação atingiram ou superaram o limite, false caso contrário
     * @see ComponenteMecanico
     * @throws IllegalArgumentException se o componente fornecido for nulo
     * @throws Exception pode lançar exceção genérica em falhas imprevisíveis de execução
     */
    public boolean verificarLimiteHoras(ComponenteMecanico componente) throws Exception {
        try {
            // Validação de segurança para garantir a integridade da referência recebida
            if (componente == null) {
                throw new IllegalArgumentException("O componente mecânico não pode ser nulo.");
            }

            // Comparação direta entre a contagem atual acumulada e o limite máximo cadastrado
            return componente.getHorasOperacao() >= componente.getLimiteMaxHoras();

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de argumento inválido para tratamento na camada superior
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura falhas inesperadas na verificação e imprime log no console
            System.out.println("Erro ao verificar limite de horas do componente: " + exception.getMessage());
            throw exception;
        }
    }

    /**
     * Gera uma mensagem de alerta detalhada baseada no percentual de desgaste
     * da vida útil do componente mecânico (horas de operação versus limite máximo).
     *
     * @param componente O objeto do tipo ComponenteMecanico para o qual o alerta será gerado
     * @return Uma String contendo o nível do alerta, o nome do componente e o status de desgaste
     * @see ComponenteMecanico
     * @throws IllegalArgumentException se o componente fornecido for nulo ou com limite de horas inválido
     * @throws Exception pode lançar exceção em inconsistências no cálculo de percentual
     */
    public String gerarAlertaManutencao(ComponenteMecanico componente) throws Exception {
        try {
            // Validação da instância do objeto
            if (componente == null) {
                throw new IllegalArgumentException("O componente mecânico não pode ser nulo.");
            }

            // Validação para evitar divisão por zero ou limites incoerentes
            if (componente.getLimiteMaxHoras() <= 0) {
                throw new IllegalArgumentException("O limite máximo de horas do componente deve ser maior que zero.");
            }

            // Resgate e cálculo do percentual de vida útil utilizada
            double horasAtuais = componente.getHorasOperacao();
            double limiteMax = componente.getLimiteMaxHoras();
            double percentual = (horasAtuais / limiteMax) * 100;

            // Avaliação das regras de negócio para classificação da criticidade
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

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de parâmetro inválido
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura erros de execução ou formatação
            System.out.println("Erro ao gerar alerta de manutenção: " + exception.getMessage());
            throw exception;
        }
    }
}