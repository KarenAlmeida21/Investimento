package br.com.zup.Investimento.service;

import br.com.zup.Investimento.dto.InvestimentoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    private List<InvestimentoDto> investimentoDtoList = new ArrayList<>();

    public void cadastrarInvestimento(InvestimentoDto investimento) {
        investimentoDtoList.add(investimento);
    }

    public List<InvestimentoDto>exibirInvestimento(){
        return investimentoDtoList;
    }

    public void calcularInvestimento(InvestimentoDto investimentoDto) {
        double taxaDeRendimento = investimentoDto.getValorInvestimento();
        double valorAplicado = investimentoDto.getValorInvestimento();
        int periodoAplicado = investimentoDto.getPeriodoAplicacao();
        double valorDoLucro = 0;
        double valorTotal = valorAplicado;
        for (int x=0;x< periodoAplicado; x++){
            valorTotal = valorAplicado + (taxaDeRendimento * periodoAplicado);
        }
    }





}



