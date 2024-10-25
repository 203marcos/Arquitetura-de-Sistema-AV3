package Modelo;

import ModeloAbstrato.Disciplina;

public class DisciplinaImplementador extends Disciplina {


    public DisciplinaImplementador(int id, String curso, String nome) {
        super(id, curso, nome);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + getId() +
                ", curso='" + getCurso() + '\'' +
                ", nome='" + getNome() + '\'' +
                '}';
    }

    @Override
    public void exibirDisciplina() {
        System.out.println(toString());
    }
}
