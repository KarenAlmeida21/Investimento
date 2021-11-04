package br.com.zup.Investimento.Dto;

import br.com.zup.Investimento.Risco;

public class InvestimentoDto {
    private String email;
    private String cpf;
    private String nome;
    private double valorInvestido;
    private Risco taxaDeRetorno;

    public InvestimentoDto() {
    }

    public InvestimentoDto(String email, String cpf, String nome, double valorInvestido, Risco taxaDeRetorno) {
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.valorInvestido = valorInvestido;
        this.taxaDeRetorno = taxaDeRetorno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Risco getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

    public void setTaxaDeRetorno(Risco taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }
}
