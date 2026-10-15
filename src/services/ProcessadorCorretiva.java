package services;

import models.OrdemServico;
import models.StatusOperacional;

/**
 * Processador especializado no atendimento e execução de ordens de serviço de manutenção corretiva.
 * Altera o status da escada rolante para manutenção e aciona a equipe para reparos emergenciais.
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
     * @see OrdemServico
     * @see StatusOperacional
     * @throws IllegalArgumentException se a ordem fornecida for nula ou inválida
     */
    @Override
    public void processarManutencao(OrdemServico ordem) {
        try {
            // Validação da ordem de serviço por meio do métod0 herdado da classe base
            validarOrdem(ordem);

            // Registro do início do atendimento emergencial
            System.out.println("🚨 [CORRETIVA - URGENTE] Atendendo chamado de falha na Escada: " +
                    ordem.getEscadaRolante().getCodigoPatrimonio());

            // Atualização do status operacional do equipamento para manutenção
            ordem.getEscadaRolante().setStatusOperacional(StatusOperacional.MANUTENCAO);

            // Notificação do técnico responsável encarregado do reparo
            System.out.println("   -> Técnico " + ordem.getTecnicoManutencao().getNomeTecManutencao() +
                    " acionado para reparo de emergência e substituição de peças danificadas.");

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de validação para a camada superior
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura erros inesperados durante o processamento da manutenção corretiva
            System.out.println("Erro ao processar manutenção corretiva: " + exception.getMessage());
        }
    }
}