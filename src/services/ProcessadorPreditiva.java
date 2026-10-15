package services;

import models.OrdemServico;

/**
 * Processador especializado na análise e execução de ordens de serviço de manutenção preditiva.
 * Avalia o desgaste dos componentes e monitora as horas de operação para prevenção de falhas.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class ProcessadorPreditiva extends ProcessadorServicoManutencao {

    /**
     * Processa a ordem de serviço de manutenção preditiva, executando a coleta de dados
     * e verificação de horas de operação supervisionada pelo técnico.
     *
     * @param ordem A ordem de serviço preditiva a ser processada
     * @see OrdemServico
     * @throws IllegalArgumentException se a ordem fornecida for nula ou inválida
     */
    @Override
    public void processarManutencao(OrdemServico ordem) {
        try {
            // Validação de segurança da ordem de serviço via métod0 da classe base
            validarOrdem(ordem);

            // Registro do início do diagnóstico preditivo no equipamento
            System.out.println("📊 [PREDITIVA] Analisando desgaste de componentes na Escada: " +
                    ordem.getEscadaRolante().getCodigoPatrimonio());

            // Registro do acompanhamento técnico e coleta de telemetria/telemetria de operação
            System.out.println("   -> Coleta de dados de anomalias e horas de operação supervisionada pelo técnico " +
                    ordem.getTecnicoManutencao().getNomeTecManutencao());

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de validação para a camada chamadora
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura falhas inesperadas no processamento da manutenção preditiva
            System.out.println("Erro ao processar manutenção preditiva: " + exception.getMessage());
        }
    }
}