package Controlador;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;
import Visao.VisaoEstudante;

import java.util.List;

public class ControladorEstudanteDisciplina {
    private ControladorEstudante controladorEstudante;
    private ControladorDisciplina controladorDisciplina;

    public ControladorEstudanteDisciplina(ControladorEstudante controladorEstudante,ControladorDisciplina controladorDisciplina){
        this.controladorEstudante = controladorEstudante;
        this.controladorDisciplina = controladorDisciplina;
    }

    public void permissaoMatricular(String nome){
        controladorEstudante.permitirAlunoMatricular(controladorDisciplina.cursoDisciplinaOfertada(nome));
    }


}
