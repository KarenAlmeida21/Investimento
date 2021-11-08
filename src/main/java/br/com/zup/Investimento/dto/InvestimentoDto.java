package br.com.zup.Investimento.dto;

import br.com.zup.Investimento.Risco;

public class InvestimentoDto {
    private String email;
    private String cpf;
    private String nome;
    private double valorInvestimento;
    private Risco taxaDeRetorno;
    private int periodoAplicacao;

    public InvestimentoDto() {
    }

    public InvestimentoDto(String email, String cpf, String nome, double valorInvestido, Risco taxaDeRetorno, int periodoAplicacao) {
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.valorInvestimento = valorInvestido;
        this.taxaDeRetorno = taxaDeRetorno;
        this.periodoAplicacao = periodoAplicacao;
    }

    public int getPeriodoAplicacao() {
        return periodoAplicacao;
    }

    public void setPeriodoAplicacao(int periodoAplicacao) {
        this.periodoAplicacao = periodoAplicacao;
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

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public Risco getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

    public void setTaxaDeRetorno(Risco taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }
}
