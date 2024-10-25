package Controlador;

import Modelo.AlunoImplementador;
import Visao.VisaoEstudante;

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



}
