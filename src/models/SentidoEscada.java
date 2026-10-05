package models;

public enum SentidoEscada {
    SUBIDA("Subida"),
    DESCIDA("Descida"),
    PARADA("Parada");

    private final String descricao;

    SentidoEscada(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
