package services;

import models.OrdemServico;
import models.StatusOperacional;

/**
 * Processador especializado em ordens de serviço de manutenção corretiva.
 * Altera o status operacional da escada para manutenção de emergência e aciona o técnico.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class ProcessadorCorretiva extends ProcessadorServicoManutencao {

    /**
     * Processa a ordem de serviço de manutenção corretiva, registrando o atendimento urgente,
     * atualizando o status da escada rolante para manutenção e acionando o técnico encarregado.
     *
     * @param ordem A ordem de serviço corretiva a ser processada
     * @throws IllegalArgumentException se a ordem fornecida for nula ou inválida
     */
    @Override
    public void processarManutencao(OrdemServico ordem) {
        validarOrdem(ordem);
        System.out.println("🚨 [CORRETIVA - URGENTE] Atendendo chamado de falha na Escada: " +
                ordem.getEscadaRolante().getCodigoPatrimonio());

        ordem.getEscadaRolante().setStatusOperacional(StatusOperacional.MANUTENCAO);

        System.out.println("   -> Técnico " + ordem.getTecnicoManutencao().getNomeTecManutencao() +
                " acionado para reparo de emergência e substituição de peças danificadas.");
    }
}