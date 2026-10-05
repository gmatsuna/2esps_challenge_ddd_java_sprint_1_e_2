package services;

import models.OrdemServico;

public class ProcessadorPreventiva extends ProcessadorServicoManutencao {
    @Override
    public void processarManutencao(OrdemServico ordem) {
        validarOrdem(ordem);
        System.out.println("🔧 [PREVENTIVA] Executando rotina programada na Escada: " +
                ordem.getEscadaRolante().getCodigoPatrimonio());
        System.out.println("   -> Técnico " + ordem.getTecnicoManutencao().getNomeTecManutencao() +
                " realizando lubrificação e testes de sensores preventivos.");
    }
}
