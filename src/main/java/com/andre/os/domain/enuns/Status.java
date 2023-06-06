package com.andre.os.domain.enuns;

public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer cod;
    private String descricao;

    private Status(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;

    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Prioridades toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Prioridades x : Prioridades.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("STATUS inválida! " + cod);

    }

}