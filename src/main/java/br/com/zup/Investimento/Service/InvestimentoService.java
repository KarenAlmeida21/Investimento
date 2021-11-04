package br.com.zup.Investimento.Service;

import br.com.zup.Investimento.Dto.InvestimentoDto;
import br.com.zup.Investimento.Risco;
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

}



