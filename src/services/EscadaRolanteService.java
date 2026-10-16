package services;

import models.EscadaRolante;
import models.StatusOperacional;

/**
 * Serviço responsável pelas regras de controle operacional das escadas rolantes,
 * gerenciando alterações de status e liberação para uso no sistema metroviário.
 *
 * @author Diogo Henrique Alves Magalhães
 * @version 1.0
 * @since 2026-10
 */
public class EscadaRolanteService {

    /**
     * Altera o status operacional de uma escada rolante, registrando a transição
     * e validando as condições de segurança.
     *
     * @param escada O objeto do tipo EscadaRolante a ser atualizada
     * @param novoStatus O novo status operacional pretendido (instância de StatusOperacional)
     * @see EscadaRolante
     * @see StatusOperacional
     * @throws IllegalArgumentException se a escada ou o novo status forem nulos
     */
    public void alterarStatusOperacional(EscadaRolante escada, StatusOperacional novoStatus) {
        try {
            // Validação de segurança para garantir a integridade dos parâmetros fornecidos
            if (escada == null) {
                throw new IllegalArgumentException("A escada rolante não pode ser nula.");
            }
            if (novoStatus == null) {
                throw new IllegalArgumentException("O novo status operacional não pode ser nulo.");
            }

            // Resgate do status atual antes da modificação para histórico de transição
            StatusOperacional statusAnterior = escada.getStatusOperacional();
            escada.setStatusOperacional(novoStatus);

            // Exibição da mensagem de confirmação da transição
            System.out.println("🔄 Escada " + escada.getCodigoPatrimonio() +
                    " teve o status alterado de [" + statusAnterior + "] para [" + novoStatus + "].");

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de argumento inválido para tratamento na camada superior
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura erros inesperados durante a atualização do status operacional
            System.out.println("Erro ao alterar o status operacional da escada rolante: " + exception.getMessage());
        }
    }
}