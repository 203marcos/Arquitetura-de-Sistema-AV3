package ms;


import org.json.JSONArray;
import org.json.JSONObject;

import Modelo.AlunoImplementador;

import java.util.ArrayList;
import java.util.List;

public class JsonParserAlunos {

    public List<AlunoImplementador> parse(String responseBody) {
    	
        JSONArray alunosArray = new JSONArray(responseBody);
        List<AlunoImplementador> alunoImplementadors = new ArrayList<>();

        for (int i = 0; i < alunosArray.length(); i++) {
            JSONObject alunoObj = alunosArray.getJSONObject(i);
            AlunoImplementador alunoImplementador = new AlunoImplementador(
                    alunoObj.getInt("id"),
                    alunoObj.getString("nome"),
                    alunoObj.getString("curso"),
                    alunoObj.getString("modalidade"),
                    alunoObj.getString("status")
            );
            alunoImplementadors.add(alunoImplementador);
        }

        return alunoImplementadors;
    }




}

/*
        this.curso = curso;
        this.modalidade = modalidade;
        this.status = status;
 */