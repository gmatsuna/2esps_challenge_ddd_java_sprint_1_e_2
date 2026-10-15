package services;

import models.EscadaRolante;
import models.OrdemServico;
import models.TecnicoManutencao;
import models.TipoServico;

import java.time.LocalDate;

/**
 * Serviço responsável pela gestão de ordens de serviço do sistema Motiva,
 * orquestrando a emissão e o processamento das manutenções.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class OrdemServicoService {

    /**
     * Cria e emite uma nova ordem de serviço para qualquer tipo de manutenção
     * (preventiva, corretiva ou preditiva).
     *
     * @param idOrdem Identificador único da ordem
     * @param dataEmissao Data de emissão da ordem
     * @param tipoServico Tipo de serviço a ser executado (instância de TipoServico)
     * @param escada Escada rolante alvo da manutenção
     * @param tecnico Técnico responsável pela execução
     * @return Instância de OrdemServico criada e emitida
     * @see OrdemServico
     * @see TipoServico
     * @see EscadaRolante
     * @see TecnicoManutencao
     * @throws IllegalArgumentException se algum parâmetro obrigatório for nulo
     */
    public OrdemServico emitirOrdem(int idOrdem, LocalDate dataEmissao, TipoServico tipoServico, EscadaRolante escada, TecnicoManutencao tecnico) {
        try {
            // Validação de segurança para garantir o preenchimento dos parâmetros obrigatórios
            if (tipoServico == null || escada == null || tecnico == null) {
                throw new IllegalArgumentException("Tipo de serviço, escada rolante e técnico são obrigatórios para emitir a ordem.");
            }

            // Exibição de log de confirmação de emissão da ordem
            System.out.println("📝 Emitindo Ordem de Serviço [" + tipoServico + "] para a escada: " + escada.getCodigoPatrimonio());

            // Instanciação e retorno da nova ordem de serviço
            return new OrdemServico(idOrdem, dataEmissao, tipoServico, escada, tecnico);

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de argumento inválido para a camada chamadora
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura falhas inesperadas na emissão da ordem de serviço
            System.out.println("Erro ao emitir ordem de serviço: " + exception.getMessage());
            return null;
        }
    }

    /**
     * Processa uma ordem de serviço utilizando o padrão polimórfico,
     * selecionando o processador de manutenção adequado conforme o tipo de serviço.
     *
     * @param ordem O objeto do tipo OrdemServico a ser processado
     * @see OrdemServico
     * @see ProcessadorServicoManutencao
     * @throws IllegalArgumentException se a ordem fornecida for nula
     */
    public void processarOrdemPolimorfica(OrdemServico ordem) {
        try {
            // Validação de segurança da instância recebida
            if (ordem == null) {
                throw new IllegalArgumentException("A ordem de serviço não pode ser nula.");
            }

            System.out.println("⚙️ Processando Ordem ID: " + ordem.getIdOrdemServico() + " via serviço genérico.");

            // Seleção polimórfica do processador baseado no enum TipoServico
            ProcessadorServicoManutencao processador = selecionarProcessador(ordem.getTipoOrdemServico());

            if (processador != null) {
                // Execução polimórfica do métod0 de processamento do serviço específico
                processador.processarManutencao(ordem);
            } else {
                System.out.println("⚠️ Nenhum processador específico encontrado para este tipo de serviço.");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            // Relança a exceção de argumento inválido
            throw illegalArgumentException;

        } catch (Exception exception) {
            // Captura erros durante o processamento polimórfico
            System.out.println("Erro ao processar ordem de serviço polimórfica: " + exception.getMessage());
        }
    }

    /**
     * Métod0 auxiliar privado que retorna a implementação polimórfica correta
     * do processador de manutenção.
     *
     * @param tipo O tipo de serviço da ordem (instância de TipoServico)
     * @return Uma instância de ProcessadorServicoManutencao correspondente ou null
     * @see TipoServico
     * @see ProcessadorServicoManutencao
     */
    private ProcessadorServicoManutencao selecionarProcessador(TipoServico tipo) {
        try {
            if (tipo == null) {
                return null;
            }

            // Seleção da estratégia de processamento de acordo com o tipo de serviço
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
        } catch (Exception exception) {
            System.out.println("Erro ao selecionar processador de manutenção: " + exception.getMessage());
            return null;
        }
    }
}