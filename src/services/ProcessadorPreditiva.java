package services;

import models.OrdemServico;

/**
 * Processador especializado em ordens de serviço de manutenção preditiva.
 * Realiza a análise de desgaste dos componentes e monitoramento de horas de operação.
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
     * @throws IllegalArgumentException se a ordem fornecida for nula ou inválida
     */
    @Override
    public void processarManutencao(OrdemServico ordem) {
        validarOrdem(ordem);
        System.out.println("📊 [PREDITIVA] Analisando desgaste de componentes na Escada: " +
                ordem.getEscadaRolante().getCodigoPatrimonio());
        System.out.println("   -> Coleta de dados de anomalias e horas de operação supervisionada pelo técnico " +
                ordem.getTecnicoManutencao().getNomeTecManutencao());
    }
}