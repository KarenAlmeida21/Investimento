package br.com.zup.Investimento;

public enum Risco {
    BAIXO(0.0005),
    MEDIO(0.0015),
    ALTO(0.0025);

    private double taxaDeRetorno;

    Risco(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }

    public double getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

}
