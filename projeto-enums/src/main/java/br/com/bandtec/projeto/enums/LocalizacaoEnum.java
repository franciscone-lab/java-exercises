package br.com.bandtec.projeto.enums;

public enum LocalizacaoEnum {
    SUL("RS"),
    CENTRO("DF"),
    NORTE("RN"),
    SUDESTE("SP"),
    NORDESTE("BA");

    private final String abreviacao;

    public String getAbreviacao() {
        return abreviacao;
    }

    private LocalizacaoEnum(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    @Override
    public String toString() {
        return abreviacao;
    }
}
