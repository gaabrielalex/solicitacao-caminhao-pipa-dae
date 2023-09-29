package edu.ifmt.solicitacaocaminhaopipadae.model.solicitacao_cp;

public enum NivelUrgencia {
    ALTO("Alto"),
    MEDIO("Médio"),
    BAIXO("Baixo"),
    NENHUM("Nenhum");

    private String descricao;

    NivelUrgencia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
