package Controlador;

import Modelo.Aluno;
import Visao.VisaoEstudante;

import java.util.List;

public class ControladorEstudante {
    private List<Aluno> listaDeEstudantes;
    private VisaoEstudante visao;

    public ControladorEstudante(List<Aluno> listaDeEstudantes){
        this.listaDeEstudantes = listaDeEstudantes;
        this.visao = new VisaoEstudante(this);
    }

    public void procuraCurso(String curso){

        for (Aluno estudante : listaDeEstudantes) {
            Aluno alunoEncontrado = estudante.listarCurso(curso);

            if (alunoEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoEncontrado);
            }

        }

    }

    public void procuraId(Integer id){
        for (Aluno estudante : listaDeEstudantes) {
            Aluno alunoEncontrado = estudante.listarId(id);

            if (alunoEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoEncontrado);
            }

        }


    }



}
