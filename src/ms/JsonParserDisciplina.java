package ms;

import Modelo.DisciplinaImplementador;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParserDisciplina {

    public List<DisciplinaImplementador> parse(String responseBody) {

        JSONArray disciplinasArray = new JSONArray(responseBody);
        List<DisciplinaImplementador> disciplinaImplementadors = new ArrayList<>();

        for (int i = 0; i < disciplinasArray.length(); i++) {
            JSONObject disciplinasObj = disciplinasArray.getJSONObject(i);
            DisciplinaImplementador disciplinaImplementador = new DisciplinaImplementador(
                    disciplinasObj.getInt("id"),
                    disciplinasObj.getString("curso"),
                    disciplinasObj.getString("nome")
            );
            disciplinaImplementadors.add(disciplinaImplementador);
        }

        return disciplinaImplementadors;
    }
}
