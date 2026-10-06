package services;

import models.EscadaRolante;
import models.OrdemServico;
import models.TecnicoManutencao;
import models.TipoServico;

import java.time.LocalDate;

/**
 * Serviço responsável pela gestão genérica de ordens de serviço.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class OrdemServicoService {

    /**
     * Cria e emite uma nova ordem de serviço genérica para qualquer tipo de manutenção
     * (preventiva, corretiva ou preditiva).
     *
     * @param idOrdem Identificador único da ordem
     * @param dataEmissao Data de emissão da ordem
     * @param tipoServico Tipo de serviço a ser executado
     * @param escada Escada rolante alvo
     * @param tecnico Técnico responsável
     * @return Instância de OrdemServico criada
     * @throws IllegalArgumentException se algum parâmetro obrigatório for nulo
     */
    public OrdemServico emitirOrdem(int idOrdem, LocalDate dataEmissao, TipoServico tipoServico, EscadaRolante escada, TecnicoManutencao tecnico) {
        if (tipoServico == null || escada == null || tecnico == null) {
            throw new IllegalArgumentException("Tipo de serviço, escada rolante e técnico são obrigatórios para emitir a ordem.");
        }

        System.out.println("📝 Emitindo Ordem de Serviço [" + tipoServico + "] para a escada: " + escada.getCodigoPatrimonio());
        return new OrdemServico(idOrdem, dataEmissao, tipoServico, escada, tecnico);
    }

    /**
     * Processa uma ordem de serviço utilizando o padrão polimórfico,
     * selecionando o processador de manutenção adequado conforme o tipo de serviço.
     *
     * @param ordem A ordem de serviço a ser processada
     * @throws IllegalArgumentException se a ordem fornecida for nula
     */
    public void processarOrdemPolimorfica(OrdemServico ordem) {
        if (ordem == null) {
            throw new IllegalArgumentException("A ordem de serviço não pode ser nula.");
        }

        System.out.println("⚙️ Processando Ordem ID: " + ordem.getIdOrdemServico() + " via serviço genérico.");

        // Seleção polimórfica do processador baseado no enum TipoServico
        ProcessadorServicoManutencao processador = selecionarProcessador(ordem.getTipoOrdemServico());

        if (processador != null) {
            processador.processarManutencao(ordem);
        } else {
            System.out.println("⚠️ Nenhum processador específico encontrado para este tipo de serviço.");
        }
    }

    /**
     * Métod0 auxiliar privado que retorna a implementação polimórfica correta
     * do processador de manutenção.
     *
     * @param tipo O tipo de serviço da ordem
     * @return Uma instância de ProcessadorServicoManutencao correspondente
     */
    private ProcessadorServicoManutencao selecionarProcessador(TipoServico tipo) {
        if (tipo == null) {
            return null;
        }

        switch (tipo) {
            case PREVENTIVA:
                return new ProcessadorPreventiva();
            case CORRETIVA:
                return new ProcessadorCorretiva();
            case PREDITIVA:
                return new ProcessadorPreditiva();
            default:
                return null;
        }
    }
}