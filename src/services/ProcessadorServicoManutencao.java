package services;

import exceptions.ManutencaoException;
import models.OrdemServico;

public abstract class ProcessadorServicoManutencao {

    //Validação de nulos
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

    public abstract void processarManutencao(OrdemServico ordem);
}
