package Modelo;

import ModeloAbstrato.Biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibliotecaImplementador extends Biblioteca {
    private Map<Integer, List<LivroImplementador>> livrosReservados;

    public BibliotecaImplementador(List<AlunoImplementador> alunos, List<LivroImplementador> livros) {
        super(alunos, livros);
        this.livrosReservados = new HashMap<>();
    }

    @Override
    public void reservarLivros(int id, String nomeLivro) {


    }

    @Override
    public void listarLivros(int id) {

    }

    @Override
    public void cancelarReserva(int id, String nomeLivro) {

    }
}
