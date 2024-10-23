package ms;


import org.json.JSONArray;
import org.json.JSONObject;

import Modelo.Aluno;
import Modelo.Disciplina;
import Modelo.Livro;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public List<Aluno> parse(String responseBody) {
    	
        JSONArray alunosArray = new JSONArray(responseBody);
        List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < alunosArray.length(); i++) {
            JSONObject alunoObj = alunosArray.getJSONObject(i);
            Aluno aluno = new Aluno(
                    alunoObj.getInt("id"),
                    alunoObj.getString("nome"),
                    alunoObj.getString("curso"),
                    alunoObj.getString("modalidade"),
                    alunoObj.getString("status")
            );
            alunos.add(aluno);
        }

        return alunos;
    }

    public List<Disciplina> parse2(String responseBody) {

        JSONArray disciplinasArray = new JSONArray(responseBody);
        List<Disciplina> disciplinas = new ArrayList<>();

        for (int i = 0; i < disciplinasArray.length(); i++) {
            JSONObject disciplinasObj = disciplinasArray.getJSONObject(i);
            Disciplina disciplina = new Disciplina(
                    disciplinasObj.getInt("id"),
                    disciplinasObj.getString("curso"),
                    disciplinasObj.getString("nome")
            );
            disciplinas.add(disciplina);
        }

        return disciplinas;
    }

    public List<Livro> parse3(String responseBody) {
        JSONArray livrosArray = new JSONArray(responseBody);
        List<Livro> livros = new ArrayList<>();

        for (int i = 0; i < livrosArray.length(); i++) {
            JSONObject livrosObj = livrosArray.getJSONObject(i);

            // Verifica se a chave "titulo" existe
            if (!livrosObj.has("titulo")) {
                System.err.println("Erro: chave 'titulo' não encontrada no objeto JSON: " + livrosObj.toString());
                continue; // Pula este objeto e continua com o próximo
            }

            boolean disponivel = false;

            if(!livrosObj.get("status").equals("null")){
                disponivel = true;
            }


            Livro livro = new Livro(
                    livrosObj.getInt("id"),
                    livrosObj.getString("titulo"),
                    livrosObj.getString("autor"),
                    livrosObj.getInt("ano"),
                    disponivel
            );
            livros.add(livro);
        }

        return livros;
    }


}

/*
        this.curso = curso;
        this.modalidade = modalidade;
        this.status = status;
 */