package main;

import models.*;
import services.*;

import java.time.LocalDate;

/**
 * Classe principal responsável por instanciar e demonstrar o funcionamento
 * de todos os objetos do sistema de gerenciamento de escadas rolantes (Motiva/CCR),
 * imprimindo seus dados via toString() e testando os serviços de manutenção.
 *
 * @author Gilberto Hideaki Matsunaga
 * @version 1.0
 * @since 2026-10
 */
public class Main {

    /**
     * Método principal que executa a aplicação de demonstração.
     *
     * @param args Argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   SISTEMA DE GERENCIAMENTO DE ESCADAS ROLANTES   ");
        System.out.println("          MOTIVA / CCR - DESAFIO FIAP             ");
        System.out.println("==================================================\n");

        // 1. Instanciando Enums
        LinhaMotiva linha = LinhaMotiva.LINHA_4_AMARELA;
        SentidoEscada sentido = SentidoEscada.SUBIDA;
        StatusOperacional status = StatusOperacional.OPERACIONAL;
        EspecialidadeTecnico especialidade = EspecialidadeTecnico.MECANICA;
        TipoServico tipoServico = TipoServico.PREVENTIVA;

        // 2. Instanciando Estação
        Estacao estacao = new Estacao(101, "Estação Paulista", linha);
        System.out.println("🔹 Estação Instanciada:");
        System.out.println(estacao.toString() + "\n");

        // 3. Instanciando Escada Rolante
        EscadaRolante escada = new EscadaRolante(1, "PAT-ESC-4045", sentido, status, estacao);
        System.out.println("🔹 Escada Rolante Instanciada:");
        System.out.println(escada.toString() + "\n");

        // 4. Instanciando Componente Mecânico
        ComponenteMecanico componente = new ComponenteMecanico(501, "Corrente de Degraus", 4200.0, 5000.0, escada);
        System.out.println("🔹 Componente Mecânico Instanciado:");
        System.out.println(componente.toString() + "\n");

        // 5. Instanciando Técnico de Manutenção
        TecnicoManutencao tecnico = new TecnicoManutencao(10, "Gilberto", "123.456.789-00", especialidade);
        System.out.println("🔹 Técnico de Manutenção Instanciado:");
        System.out.println(tecnico.toString() + "\n");

        // 6. Instanciando Ordem de Serviço
        OrdemServico ordem = new OrdemServico(9910, LocalDate.now(), tipoServico, escada, tecnico);
        System.out.println("🔹 Ordem de Serviço Instanciada:");
        System.out.println(ordem.toString() + "\n");

        System.out.println("==================================================");
        System.out.println("          DEMONSTRAÇÃO DOS SERVIÇOS               ");
        System.out.println("==================================================");

        // Testando EscadaRolanteService
        EscadaRolanteService escadaRolanteService = new EscadaRolanteService();
        escadaRolanteService.alterarStatusOperacional(escada, StatusOperacional.MANUTENCAO);
        System.out.println();

        // Testando ComponenteService
        ComponenteService componenteService = new ComponenteService();
        System.out.println(componenteService.gerarAlertaManutencao(componente));

        boolean limiteAtingido = componenteService.verificarLimiteHoras(componente);
        System.out.println("-> Limite de horas atingido? " + (limiteAtingido ? "Sim" : "Não") + "\n");

        // Testando OrdemServicoService (Emissão e Processamento Polimórfico)
        OrdemServicoService ordemServicoService = new OrdemServicoService();

        // Emitindo e processando Ordem Preventiva
        OrdemServico ordemPreventiva = ordemServicoService.emitirOrdem(9910, LocalDate.now(), TipoServico.PREVENTIVA, escada, tecnico);
        System.out.println("🔹 " + ordemPreventiva.toString());
        ordemServicoService.processarOrdemPolimorfica(ordemPreventiva);

        System.out.println("\n--------------------------------------------------");

        // Emitindo e processando Ordem Corretiva
        OrdemServico ordemCorretiva = ordemServicoService.emitirOrdem(9911, LocalDate.now(), TipoServico.CORRETIVA, escada, tecnico);
        System.out.println("🔹 " + ordemCorretiva.toString());
        ordemServicoService.processarOrdemPolimorfica(ordemCorretiva);

        System.out.println("\n==================================================");
        System.out.println(" FIM DA EXECUÇÃO - OBJETOS TESTADOS COM SUCESSO!  ");
        System.out.println("==================================================");
    }
}