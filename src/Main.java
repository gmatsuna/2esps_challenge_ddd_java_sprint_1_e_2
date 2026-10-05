import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estacao estacaoPinheiros = new Estacao(1, "Pinheiros", LinhaMotiva.LINHA_4_AMARELA);

        EscadaRolante escada01 = new EscadaRolante(
                1001,
                "ER-PIN-01",
                SentidoEscada.SUBIDA,
                StatusOperacional.OPERACIONAL,
                estacaoPinheiros
        );

        ComponenteMecanico correnteDegrau = new ComponenteMecanico(
                5001,
                "Corrente Principal de Degraus",
                18500.00,
                20000.00,
                escada01
        );

        TecnicoManutencao tecnico01 = new TecnicoManutencao(
                1,
                "Gilberto",
                "123.456.789-00",
                EspecialidadeTecnico.MECANICA
        );

        OrdemServico ordem01 = new OrdemServico(
                1005,
                LocalDate.of(2020, 1, 1),
                TipoServico.PREVENTIVA,
                escada01,
                tecnico01
        );

        System.out.println(ordem01);

    }
}