package ConsumoApis;

import java.util.List;


import ms.JsonParserAlunos;
import ms.ServicoDeAlunos;
import Modelo.AlunoImplementador;



public class ConsumidorAPIAluno {

    private ServicoDeAlunos servico = new ServicoDeAlunos();
    private JsonParserAlunos parser = new JsonParserAlunos();
    private String jsonResposta = servico.obterDadosEstudantesComoJson();
    private List<AlunoImplementador> listaDeEstudantes = parser.parse(jsonResposta);

    public List<AlunoImplementador> devolverListaEstudantes(){
        return listaDeEstudantes;
    }


}
