package Controlador;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;
import Visao.VisaoDisciplina;
import Visao.VisaoEstudante;

import java.util.List;

public class ControladorDisciplina {
    private List<DisciplinaImplementador> listaDeDisciplina;
    private VisaoDisciplina visao;

    public ControladorDisciplina(List<DisciplinaImplementador> listaDeDisciplina){
        this.listaDeDisciplina = listaDeDisciplina;
        this.visao = new VisaoDisciplina(this);
    }

    public DisciplinaImplementador cursoDisciplinaOfertada (String nome){

        for (DisciplinaImplementador curso : listaDeDisciplina) {

            DisciplinaImplementador disciplinaImplementadorEncontrado = curso.encontraDisiciplina(nome);

            if (disciplinaImplementadorEncontrado != null) {
                System.out.println("ACHAMOS SEU CURSO");
                disciplinaImplementadorEncontrado.exibirDisciplina();
                return disciplinaImplementadorEncontrado;
            }

        }

        return null;
    }

}
