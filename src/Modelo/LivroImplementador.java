package Modelo;

import ModeloAbstrato.Livro;

public class LivroImplementador extends Livro {


    public LivroImplementador(int id, String titulo, String autor, int ano, boolean status) {
        super(id, titulo, autor, ano, status);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", ano='" + getAno() + '\'' +
                ", disponivel='" + isStatus() + '\'' +
                '}';
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(toString());
    }
}
