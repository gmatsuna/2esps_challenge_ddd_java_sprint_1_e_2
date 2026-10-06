package services;

import models.OrdemServico;

/**
 * Processador especializado em ordens de serviço de manutenção preventiva.
 * Executa as rotinas de manutenção programadas e testes preventivos.
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
     * @throws IllegalArgumentException se a ordem fornecida for nula ou inválida
     */
    @Override
    public void processarManutencao(OrdemServico ordem) {
        validarOrdem(ordem);
        System.out.println("🔧 [PREVENTIVA] Executando rotina programada na Escada: " +
                ordem.getEscadaRolante().getCodigoPatrimonio());
        System.out.println("   -> Técnico " + ordem.getTecnicoManutencao().getNomeTecManutencao() +
                " realizando manutenção e testes de sensores preventivos.");
    }
}