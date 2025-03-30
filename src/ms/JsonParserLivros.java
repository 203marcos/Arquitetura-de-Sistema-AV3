package ms;

import Modelo.LivroImplementador;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParserLivros {
    public List<LivroImplementador> parse(String responseBody) {
        JSONArray livrosArray = new JSONArray(responseBody);
        List<LivroImplementador> livroImplementadors = new ArrayList<>();

        for (int i = 0; i < livrosArray.length(); i++) {
            JSONObject livrosObj = livrosArray.getJSONObject(i);

            // Verifica se a chave "titulo" existe
            if (!livrosObj.has("titulo")) {
                System.err.println("Erro: chave 'titulo' não encontrada no objeto JSON: " + livrosObj.toString());
                continue; // Pula este objeto e continua com o próximo
            }

            boolean disponivel = true;

            if(!livrosObj.get("status").equals("null")){
                disponivel = false;
            }


            LivroImplementador livroImplementador = new LivroImplementador(
                    livrosObj.getInt("id"),
                    livrosObj.getString("titulo"),
                    livrosObj.getString("autor"),
                    livrosObj.getInt("ano"),
                    disponivel
            );
            livroImplementadors.add(livroImplementador);
        }

        return livroImplementadors;
    }
}
