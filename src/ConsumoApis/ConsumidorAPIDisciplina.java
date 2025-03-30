package ConsumoApis;

import java.util.List;


import ms.JsonParserAlunos;
import Modelo.DisciplinaImplementador;
import ms.JsonParserDisciplina;
import ms.ServicoDeDisciplina;




public class ConsumidorAPIDisciplina {

    private ServicoDeDisciplina servico2 = new ServicoDeDisciplina();
    private JsonParserDisciplina parser = new JsonParserDisciplina();
    private String jsonResposta = servico2.obterDadosDisciplinaComoJson();
    private List<DisciplinaImplementador> listaDeDisciplinaImplementadors = parser.parse(jsonResposta);

    public List<DisciplinaImplementador> devolverListaDisciplina(){
        return listaDeDisciplinaImplementadors;
    }



}
