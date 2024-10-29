package Modelo;

import ModeloAbstrato.Livro;

public class LivroImplementador extends Livro {


    public LivroImplementador(int id, String titulo, String autor, int ano, boolean status) {
        super(id, titulo, autor, ano, status);
    }

    @Override
    public LivroImplementador buscaTitulo(String titulo) {

        if(super.getTitulo().equals(titulo)){
            return this;
        }

        return null;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(toString());
    }
}
