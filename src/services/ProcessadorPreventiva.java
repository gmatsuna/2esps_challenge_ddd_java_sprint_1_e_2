package services;

import models.OrdemServico;

/**
 * Processador especializado na execução de ordens de serviço de manutenção preventiva.
 * Realiza as rotinas programadas de inspecção, lubrificação e testes periódicos de segurança.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class ProcessadorPreventiva extends ProcessadorServicoManutencao {

    /**
     * Processa a ordem de serviço de manutenção preventiva, realizando a rotina programada
     * de manutenção e testes de sensores conduzida pelo técnico responsável.
     *
     * @param ordem A ordem de serviço preventiva a ser processada
     * @see OrdemServico
     * @throws IllegalArgumentException se a ordem fornecida for nula ou inválida
     */
    @Override
    public void processarManutencao(OrdemServico ordem) {
        try {
            // Validação de segurança da ordem de serviço via métod0 da classe base
            validarOrdem(ordem);

            // Registro do início da execução da rotina preventiva programada
            System.out.println("🔧 [PREVENTIVA] Executando rotina programada na Escada: " +
                    ordem.getEscadaRolante().getCodigoPatrimonio());

            // Notificação dos procedimentos técnicos e testes operacionais realizados
            System.out.println("   -> Técnico " + ordem.getTecnicoManutencao().getNomeTecManutencao() +
                    " realizando manutenção e testes de sensores preventivos.");

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de validação para a camada superior
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura erros inesperados durante o processamento da manutenção preventiva
            System.out.println("Erro ao processar manutenção preventiva: " + exception.getMessage());
        }
    }
}