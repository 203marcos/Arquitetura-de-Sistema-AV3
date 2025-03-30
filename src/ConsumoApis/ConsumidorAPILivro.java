package ConsumoApis;

import Modelo.LivroImplementador;
import ms.JsonParserAlunos;
import ms.JsonParserLivros;
import ms.ServicoDeLivros;

import java.util.List;

public class ConsumidorAPILivro {
    private  ServicoDeLivros servico3 = new ServicoDeLivros();
    private JsonParserLivros parser = new JsonParserLivros();
    private String jsonResposta = servico3.obterDadosLivroComoJson();
    private List<LivroImplementador> listaDeLivroImplementadors = parser.parse(jsonResposta);

    public List<LivroImplementador> devolverListaLivros(){
        return listaDeLivroImplementadors;
    }


}
