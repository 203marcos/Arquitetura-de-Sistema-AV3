package Principal;

import java.util.List;

import Controlador.ControladorEstudante;
import Modelo.Livro;
import Visao.VisaoEstudante;
import ms.JsonParser;
import ms.ServicoDeAlunos;
import Modelo.Aluno;
import Modelo.Disciplina;
import ms.ServicoDeDisciplina;
import ms.ServicoDeLivros;


public class consumidorAPIAluno {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ServicoDeAlunos servico = new ServicoDeAlunos();
        JsonParser parser = new JsonParser();

        // Faz a chamada ao serviço e obtém a resposta em formato JSON
        String jsonResposta = servico.obterDadosEstudantesComoJson();

        // Analisa a resposta JSON e obtém a lista de estudantes
        List<Aluno> listaDeEstudantes = parser.parse(jsonResposta);

        // Imprime os detalhes de cada estudante
//        for (Aluno estudante : listaDeEstudantes) {
//            System.out.println(estudante);
//        }

        //Disciplina
        ServicoDeDisciplina servico2 = new ServicoDeDisciplina();
        parser = new JsonParser();

        // Faz a chamada ao serviço e obtém a resposta em formato JSON
        jsonResposta = servico2.obterDadosDisciplinaComoJson();

        // Analisa a resposta JSON e obtém a lista de estudantes
        List<Disciplina> listaDeDisciplinas = parser.parse2(jsonResposta);

//         Imprime os detalhes de cada estudante
//        for (Disciplina disciplina : listaDeDisciplinas) {
//            System.out.println(disciplina);
//        }

        //LIVRO
        ServicoDeLivros servico3 = new ServicoDeLivros();
        parser = new JsonParser();

        // Faz a chamada ao serviço e obtém a resposta em formato JSON
        jsonResposta = servico3.obterDadosLivroComoJson();

        // Analisa a resposta JSON e obtém a lista de estudantes
        List<Livro> listaDeLivros = parser.parse3(jsonResposta);

        // Imprime os detalhes de cada estudante
//        for (Livro livro : listaDeLivros) {
//            System.out.println(livro);
//        }

        //PRIMEIRA FUNCIONALIDADE
        ControladorEstudante controladorEstudante = new ControladorEstudante(listaDeEstudantes);
        VisaoEstudante visaoEstudante = new VisaoEstudante(controladorEstudante);
//        visaoEstudante.iniciarProcuraCurso("História");
        visaoEstudante.iniciarProcuraId();
        //SEGUNDA FUNCIONALIDADE



    }

}
