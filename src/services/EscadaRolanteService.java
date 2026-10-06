package services;

import models.EscadaRolante;
import models.StatusOperacional;

/**
 * Serviço responsável pelas regras de controle operacional das escadas rolantes,
 * gerenciando alterações de status e liberação para uso no sistema metroferroviário.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class EscadaRolanteService {

    /**
     * Altera o status operacional de uma escada rolante, registrando a transição
     * e validando as condições de segurança.
     *
     * @param escada A escada rolante a ser atualizada
     * @param novoStatus O novo status operacional pretendido
     * @throws IllegalArgumentException se a escada fornecida for nula
     */
    public void alterarStatusOperacional(EscadaRolante escada, StatusOperacional novoStatus) {
        if (escada == null) {
            throw new IllegalArgumentException("A escada rolante não pode ser nula.");
        }

        StatusOperacional statusAnterior = escada.getStatusOperacional();
        escada.setStatusOperacional(novoStatus);

        System.out.println("🔄 Escada " + escada.getCodigoPatrimonio() +
                " teve o status alterado de [" + statusAnterior + "] para [" + novoStatus + "].");
    }
}