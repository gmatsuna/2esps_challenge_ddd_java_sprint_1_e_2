package services;

import exceptions.ManutencaoException;
import models.OrdemServico;

/**
 * Classe abstrata base para o processamento de ordens de serviço de manutenção,
 * estabelecendo o contrato de validação e o métod0 de execução para as subclasses.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public abstract class ProcessadorServicoManutencao {

    /**
     * Valida se a ordem de serviço informada não é nula e se possui os vínculos obrigatórios
     * com a escada rolante e com o técnico responsável.
     *
     * @param ordem A ordem de serviço a ser validada
     * @throws ManutencaoException se a ordem for nula, estiver sem escada rolante ou sem técnico responsável
     */
    public void validarOrdem(OrdemServico ordem) {
        if (ordem == null) {
            throw new ManutencaoException("Erro: A ordem de serviço não pode ser nula.");
        }
        if (ordem.getEscadaRolante() == null) {
            throw new ManutencaoException("Erro: A ordem de serviço precisa estar vinculada a uma escada rolante.");
        }
        if (ordem.getTecnicoManutencao() == null) {
            throw new ManutencaoException("Erro: A ordem de serviço precisa ter um técnico responsável.");
        }
    }

    /**
     * Métod0 abstrato responsável por executar o processamento específico da manutenção.
     * Deve ser implementado pelas subclasses conforme o tipo de serviço.
     *
     * @param ordem A ordem de serviço a ser processada
     */
    public abstract void processarManutencao(OrdemServico ordem);
}