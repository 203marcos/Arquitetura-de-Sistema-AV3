package ModeloAbstrato;

import Modelo.AlunoImplementador;
import Modelo.LivroImplementador;

import java.util.List;

public abstract class Biblioteca {

    private List<AlunoImplementador> alunos;
    private List<LivroImplementador> livros;


    public Biblioteca(List<AlunoImplementador> alunos, List<LivroImplementador> livros) {
        this.alunos = alunos;
        this.livros = livros;
    }


    public List<AlunoImplementador> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoImplementador> alunos) {
        this.alunos = alunos;
    }

    public List<LivroImplementador> getLivros() {
        return livros;
    }

    public void setLivros(List<LivroImplementador> livros) {
        this.livros = livros;
    }

    public abstract void reservarLivros(int id, String nomeLivro);
    public abstract void listarLivros(int id);
    public abstract void cancelarReserva(int id, String nomeLivro);

}
