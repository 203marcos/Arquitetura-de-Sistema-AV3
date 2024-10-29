package Modelo;

import ModeloAbstrato.Aluno;
import ModeloAbstrato.Biblioteca;
import ModeloAbstrato.Livro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibliotecaImplementador extends Biblioteca {
    private Map<Integer, List<Livro>> livrosReservados;

    public BibliotecaImplementador(List<AlunoImplementador> alunos, List<LivroImplementador> livros) {
        super(alunos, livros);
        this.livrosReservados = new HashMap<>();
    }

    @Override
    public void reservarLivros(int id, String nomeLivro) {
        for (Aluno estudante : super.getAlunos()) {
            Aluno alunoEncontrado = estudante.buscarPorId(id);
            if (alunoEncontrado != null && alunoEncontrado.getStatus().equals("Ativo")) {
                System.out.println(alunoEncontrado);
                for (LivroImplementador livro : super.getLivros()) {
                    LivroImplementador livroEncontrado = livro.buscaTitulo(nomeLivro);
                    if (livroEncontrado != null && livroEncontrado.isStatus()) {
                        livroEncontrado.setStatus(false);
                        livrosReservados.computeIfAbsent(id, k -> new ArrayList<>()).add(livroEncontrado);
                        System.out.println("Livro reservado: " + nomeLivro);
                        return;
                    }
                }
                System.out.println("Livro não encontrado ou já reservado: " + nomeLivro);
                return;
            }
        }
        System.out.println("Aluno não encontrado ou não está ativo: " + id);
    }

    @Override
    public void listarLivros(int id) {
        List<Livro> livros = livrosReservados.get(id);
        if (livros != null && !livros.isEmpty()) {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        } else {
            System.out.println("Nenhum livro reservado para o aluno com ID: " + id);
        }
    }

    @Override
    public void cancelarReserva(int id, String nomeLivro) {
        List<Livro> livros = livrosReservados.get(id);
        if (livros != null) {
            boolean removed = livros.removeIf(livro -> livro.getTitulo().equals(nomeLivro));
            if (removed) {
                System.out.println("Livro removido: " + nomeLivro);
                // Atualizar o status do livro para disponível
                for (Livro livro : super.getLivros()) {
                    if (livro.getTitulo().equals(nomeLivro)) {
                        livro.setStatus(true);
                        break;
                    }
                }
            } else {
                System.out.println("Livro não encontrado na reserva: " + nomeLivro);
            }
        } else {
            System.out.println("Nenhum livro reservado para o aluno com ID: " + id);
        }
    }


//    public void exe(){
//        for (Livro livro : super.getLivros()) {
//            System.out.println(livro);
//        }
//    }
}