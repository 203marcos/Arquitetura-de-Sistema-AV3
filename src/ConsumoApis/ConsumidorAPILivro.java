package ConsumoApis;

import Modelo.LivroImplementador;
import ms.JsonParser;
import ms.ServicoDeLivros;

import java.util.List;

public class ConsumidorAPILivro {
    private  ServicoDeLivros servico3 = new ServicoDeLivros();
    private JsonParser parser = new JsonParser();
    private String jsonResposta = servico3.obterDadosLivroComoJson();
    private List<LivroImplementador> listaDeLivroImplementadors = parser.parse3(jsonResposta);

    public List<LivroImplementador> devolverListaLivros(){
        return listaDeLivroImplementadors;
    }

    public void printarLivros(){
        for (LivroImplementador livroImplementador : listaDeLivroImplementadors) {
            System.out.println(livroImplementador);
        }
    }



}
