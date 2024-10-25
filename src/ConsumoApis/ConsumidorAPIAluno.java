package ConsumoApis;

import java.util.List;


import ms.JsonParser;
import ms.ServicoDeAlunos;
import Modelo.AlunoImplementador;



public class ConsumidorAPIAluno {

    private ServicoDeAlunos servico = new ServicoDeAlunos();
    private JsonParser parser = new JsonParser();
    private String jsonResposta = servico.obterDadosEstudantesComoJson();
    private List<AlunoImplementador> listaDeEstudantes = parser.parse(jsonResposta);

    public List<AlunoImplementador> devolverListaEstudantes(){
        return listaDeEstudantes;
    }

    public void printarEstudantes(){
        for (AlunoImplementador alunoImplementador : listaDeEstudantes) {
            System.out.println(alunoImplementador);
        }
    }

}
