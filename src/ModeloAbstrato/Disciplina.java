package ModeloAbstrato;

import Modelo.DisciplinaImplementador;

public abstract class Disciplina {
    private int id;
    private String curso;
    private String nome;

    // Construtor
    public Disciplina(int id, String curso, String nome) {
        this.id = id;
        this.curso = curso;
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract DisciplinaImplementador encontraDisiciplinaNome(String nome);
    public abstract DisciplinaImplementador encontraDisiciplinaCurso(String curso);

    public abstract void exibirDisciplina();

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + getId() +
                ", curso='" + getCurso() + '\'' +
                ", nome='" + getNome() + '\'' +
                '}';
    }
}

