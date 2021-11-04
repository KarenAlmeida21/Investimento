package br.com.zup.Investimento;

import br.com.zup.Investimento.Dto.InvestimentoDto;
import br.com.zup.Investimento.Service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping
    public void cadastrarInvestimento(@RequestBody InvestimentoDto investimentoDto) {
        investimentoService.cadastrarInvestimento(investimentoDto);

    }
}