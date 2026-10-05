package services;

import models.OrdemServico;

public class ProcessadorPreditiva extends ProcessadorServicoManutencao {
    @Override
    public void processarManutencao(OrdemServico ordem) {
        validarOrdem(ordem);
        System.out.println("📊 [PREDITIVA] Analisando desgaste de componentes na Escada: " +
                ordem.getEscadaRolante().getCodigoPatrimonio());
        System.out.println("   -> Coleta de dados de vibração e horas de operação supervisionada pelo técnico " +
                ordem.getTecnicoManutencao().getNomeTecManutencao());
    }
}