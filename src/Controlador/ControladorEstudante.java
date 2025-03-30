package Controlador;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;
import ModeloAbstrato.Aluno;
import Visao.VisaoEstudante;

import java.util.List;

public class ControladorEstudante {
    private List<AlunoImplementador> listaDeEstudantes;
    private VisaoEstudante visao;

    public ControladorEstudante(List<AlunoImplementador> listaDeEstudantes,VisaoEstudante visao){
        this.listaDeEstudantes = listaDeEstudantes;
        this.visao = visao;
    }

    public List<AlunoImplementador> getListaDeEstudantes() {
        return listaDeEstudantes;
    }

    public void setListaDeEstudantes(List<AlunoImplementador> listaDeEstudantes) {
        this.listaDeEstudantes = listaDeEstudantes;
    }

    public void procuraCurso(String curso) {
        for (Aluno estudante : listaDeEstudantes) {
            Aluno alunoEncontrado = estudante.buscarPorCurso(curso);
            if (alunoEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoEncontrado);
            }
        }
    }

    public void procuraId(Integer id) {
        for (Aluno estudante : listaDeEstudantes) {
            Aluno alunoEncontrado = estudante.buscarPorId(id);
            if (alunoEncontrado != null) {
                visao.exibeDetalhesEstudante(alunoEncontrado);
            }
        }
    }
}