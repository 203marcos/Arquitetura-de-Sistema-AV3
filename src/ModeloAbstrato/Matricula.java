package ModeloAbstrato;

import Modelo.AlunoImplementador;
import Modelo.DisciplinaImplementador;

import java.util.List;

public abstract class Matricula {
    private List<AlunoImplementador> alunos;
    private List<DisciplinaImplementador> disciplinas;
    private Disciplina[] arrayDisciplina = new Disciplina[10];
    private int indiceAtual = 0;

    public Matricula(List<AlunoImplementador> alunos, List<DisciplinaImplementador> disciplinas) {
        this.alunos = alunos;
        this.disciplinas = disciplinas;
    }

    public List<AlunoImplementador> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoImplementador> alunos) {
        this.alunos = alunos;
    }

    public List<DisciplinaImplementador> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaImplementador> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getIndiceAtual() {
        return indiceAtual;
    }

    public void setIndiceAtual(int indiceAtual) {
        this.indiceAtual = indiceAtual;
    }

    public Disciplina[] getArrayDisciplina() {
        return arrayDisciplina;
    }

    public void setArrayDisciplina(Disciplina[] arrayDisciplina) {
        this.arrayDisciplina = arrayDisciplina;
    }

    public abstract void matricular(int id, String nomeCurso);
    public abstract void listarDisciplinas(int id);
    public abstract void removerDisciplina(int id, String nomeCurso);


}
