package models;

public enum StatusOperacional {
    OPERACIONAL("Operacional"),
    MANUTENCAO("Em Manutenção"),
    FALHA("Em Falha/Parada de Segurança");

    private final String descricao;

    StatusOperacional(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
