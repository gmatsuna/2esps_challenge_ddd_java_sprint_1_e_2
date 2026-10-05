package models;

public enum LinhaMotiva {
    LINHA_4_AMARELA("Linha 4-Amarela"),
    LINHA_5_LILAS("Linha 5-Lilás"),
    LINHA_8_DIAMANTE("Linha 8-Diamante"),
    LINHA_9_ESMERALDA("Linha 9-Esmeralda"),
    LINHA_17_OURO("Linha 17-Ouro");

    private final String descricao;

    // Construtor do Enum (responsável por aceitar o texto)
    LinhaMotiva(String descricao) {
        this.descricao = descricao;
    }

    // Getter para recuperar o texto formatado
    public String getDescricao() {
        return descricao;
    }
}
