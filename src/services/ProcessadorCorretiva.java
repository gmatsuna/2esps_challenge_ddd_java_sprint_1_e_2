package services;

import models.OrdemServico;
import models.StatusOperacional;

public class ProcessadorCorretiva extends ProcessadorServicoManutencao {
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