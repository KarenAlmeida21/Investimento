package br.com.zup.Investimento.dto;

public class InvestimentoSaidaDto {
    private double valor;
    private double lucro;
    private double total;

    public InvestimentoSaidaDto(double valor, double lucro, double total) {
        this.valor = valor;
        this.lucro = lucro;
        this.total = total;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
