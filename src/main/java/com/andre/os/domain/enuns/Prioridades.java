package com.andre.os.domain.enuns;

public enum Prioridades {
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private Integer cod;
    private String descricao;

    private Prioridades(Integer cod, String descricao) {
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
        throw new IllegalArgumentException("Prioridade inválida! " + cod);

    }

}