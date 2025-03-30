package Modelo;

import ModeloAbstrato.Disciplina;

public class DisciplinaImplementador extends Disciplina {


    public DisciplinaImplementador(int id, String curso, String nome) {
        super(id, curso, nome);
    }


    public DisciplinaImplementador encontraDisiciplinaNome(String nome){
        if(super.getNome().equals(nome)){
            return this;
        }
        return null;
    }

    @Override
    public DisciplinaImplementador encontraDisiciplinaCurso(String curso) {
        if(super.getCurso().equals(curso)){
            return this;
        }
        return null;
    }

    @Override
    public void exibirDisciplina() {
        System.out.println(toString());
    }
}
