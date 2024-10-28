package ConsumoApis;

import java.util.List;


import ms.JsonParser;
import Modelo.DisciplinaImplementador;
import ms.ServicoDeDisciplina;




public class ConsumidorAPIDisciplina {

    private ServicoDeDisciplina servico2 = new ServicoDeDisciplina();
    private JsonParser parser = new JsonParser();
    private String jsonResposta = servico2.obterDadosDisciplinaComoJson();
    private List<DisciplinaImplementador> listaDeDisciplinaImplementadors = parser.parse2(jsonResposta);



    public List<DisciplinaImplementador> devolverListaDisciplina(){
        return listaDeDisciplinaImplementadors;
    }

    public void printarDisciplina(){
        for (DisciplinaImplementador disciplinaImplementador : listaDeDisciplinaImplementadors) {
            System.out.println(disciplinaImplementador);
        }
    }



}
