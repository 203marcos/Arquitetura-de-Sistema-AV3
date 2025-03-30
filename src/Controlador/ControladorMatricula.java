package Controlador;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;
import Modelo.MatriculaImplementador;
import ModeloAbstrato.Aluno;
import ModeloAbstrato.Disciplina;
import ModeloAbstrato.Matricula;
import Visao.VisaoMatricula;

import java.util.List;

public class ControladorMatricula {
    private VisaoMatricula visaoMatricula;
    private MatriculaImplementador matriculaImplementador;

    public ControladorMatricula(List<AlunoImplementador> alunos, List<DisciplinaImplementador> disciplinas,VisaoMatricula visaoMatricula){
        this.matriculaImplementador = new MatriculaImplementador(alunos,disciplinas);
        this.visaoMatricula = visaoMatricula;
    }

    public void matricularAluno(int id, String nomeCurso){
        matriculaImplementador.matricular(id,nomeCurso);
    }

    public void listarDisciplinas(int id){
        matriculaImplementador.listarDisciplinas(id);
    }

    public void removerDisciplinas(int id, String nomeCurso){
        matriculaImplementador.removerDisciplina(id,nomeCurso);
    }


}
