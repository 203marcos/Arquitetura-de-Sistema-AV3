package Controlador;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;
import Visao.VisaoEstudante;

import java.util.AbstractSet;
import java.util.List;

public class ControladorEstudante {
    private List<AlunoImplementador> listaDeEstudantes;
    private VisaoEstudante visao;

    public ControladorEstudante(List<AlunoImplementador> listaDeEstudantes){
        this.listaDeEstudantes = listaDeEstudantes;
        this.visao = new VisaoEstudante(this);
    }

    public void procuraCurso(String curso){

        for (AlunoImplementador estudante : listaDeEstudantes) {
            AlunoImplementador alunoImplementadorEncontrado = estudante.listarCurso(curso);

            if (alunoImplementadorEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoImplementadorEncontrado);
            }

        }

    }

    public void procuraId(Integer id){
        for (AlunoImplementador estudante : listaDeEstudantes) {
            AlunoImplementador alunoImplementadorEncontrado = estudante.listarId(id);
            if (alunoImplementadorEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoImplementadorEncontrado);
            }
        }
    }


    public void permitirAlunoMatricular(DisciplinaImplementador disciplina){
        for (AlunoImplementador estudante : listaDeEstudantes) {
            AlunoImplementador alunoImplementadorEncontrado = estudante.listarDisciplina(disciplina);

            if (alunoImplementadorEncontrado != null && alunoImplementadorEncontrado.ativoPresencial()) {
                System.out.println("ALUNO PERMITIDO FAZER ESSA DISCIPLINA");
                visao.exibeDetalhesEstudante(alunoImplementadorEncontrado);
                alunoImplementadorEncontrado.adicionarDisciplina(disciplina);
                break;
            }

        }
    }

    public void removerMatricula (Integer id,String nomeCurso){
        for (AlunoImplementador estudante : listaDeEstudantes) {
            AlunoImplementador alunoImplementadorEncontrado = estudante.listarId(id);
            if (alunoImplementadorEncontrado != null) {
                alunoImplementadorEncontrado.excluirDisciplina(nomeCurso);
            }
        }
    }





    public void listarDisciplinas(int id){
        for (AlunoImplementador estudante : listaDeEstudantes) {
            AlunoImplementador alunoImplementadorEncontrado = estudante.listarId(id);
            if (alunoImplementadorEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoImplementadorEncontrado);
                alunoImplementadorEncontrado.disciplinasCursadas();
            }
        }
    }



}
