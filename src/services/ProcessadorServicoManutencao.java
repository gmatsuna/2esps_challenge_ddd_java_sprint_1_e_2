package services;

import exceptions.ManutencaoException;
import models.OrdemServico;

/**
 * Classe abstrata base para o processamento de ordens de serviço de manutenção,
 * estabelecendo o contrato de validação e o métod0 de execução para as subclasses.
 *
 * @author Vinicius Nathan
 * @version 1.0
 * @since 2026-10
 */
public abstract class ProcessadorServicoManutencao {

    /**
     * Valida se a ordem de serviço informada não é nula e se possui os vínculos obrigatórios
     * com a escada rolante e com o técnico responsável.
     *
     * @param ordem A ordem de serviço a ser validada
     * @see OrdemServico
     * @throws ManutencaoException se a ordem for nula, estiver sem escada rolante ou sem técnico responsável
     */
    public void validarOrdem(OrdemServico ordem) {
        try {
            // Validação da instância da ordem de serviço
            if (ordem == null) {
                throw new ManutencaoException("Erro: A ordem de serviço não pode ser nula.");
            }

            // Validação da associação obrigatória com o equipamento
            if (ordem.getEscadaRolante() == null) {
                throw new ManutencaoException("Erro: A ordem de serviço precisa estar vinculada a uma escada rolante.");
            }

            // Validação da associação obrigatória com o técnico responsável
            if (ordem.getTecnicoManutencao() == null) {
                throw new ManutencaoException("Erro: A ordem de serviço precisa ter um técnico responsável.");
            }

        } catch (ManutencaoException manutencaoException) {
            // Relança a exceção customizada de manutenção para tratamento na camada superior
            throw manutencaoException;

        } catch (Exception exception) {
            // Captura falhas inesperadas durante o processo de validação da ordem
            System.out.println("Erro ao validar ordem de serviço: " + exception.getMessage());
        }
    }

    /**
     * Métod0 abstrato responsável por executar o processamento específico da manutenção.
     * Deve ser implementado pelas subclasses conforme o tipo de serviço.
     *
     * @param ordem O objeto do tipo OrdemServico a ser processado
     * @see OrdemServico
     */
    public abstract void processarManutencao(OrdemServico ordem);
}