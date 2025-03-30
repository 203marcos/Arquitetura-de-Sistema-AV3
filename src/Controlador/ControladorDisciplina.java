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



    public List<DisciplinaImplementador> getListaDeDisciplina() {
        return listaDeDisciplina;
    }

    public void setListaDeDisciplina(List<DisciplinaImplementador> listaDeDisciplina) {
        this.listaDeDisciplina = listaDeDisciplina;
    }
}
