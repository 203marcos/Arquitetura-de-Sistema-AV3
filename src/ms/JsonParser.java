package ms;


import org.json.JSONArray;
import org.json.JSONObject;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;
import Modelo.LivroImplementador;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {

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

    public List<DisciplinaImplementador> parse2(String responseBody) {

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

    public List<LivroImplementador> parse3(String responseBody) {
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

/*
        this.curso = curso;
        this.modalidade = modalidade;
        this.status = status;
 */