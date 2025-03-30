package Controlador;

import Modelo.*;
import ModeloAbstrato.Aluno;
import ModeloAbstrato.Biblioteca;
import ModeloAbstrato.Livro;
import Visao.VisaoBiblioteca;
import Visao.VisaoMatricula;

import java.util.List;

public class ControladorBiblioteca {

    private VisaoBiblioteca visaoBiblioteca;
    private BibliotecaImplementador bibliotecaImplementador;

    public ControladorBiblioteca(List<AlunoImplementador> alunos, List<LivroImplementador> livros,VisaoBiblioteca visaoBiblioteca){
        this.bibliotecaImplementador = new BibliotecaImplementador(alunos,livros);
        this.visaoBiblioteca = visaoBiblioteca;
    }

    public void reservarLivros(int id, String titulo){
        bibliotecaImplementador.reservarLivros(id,titulo);
    }

    public void listarLivros(int id){
        bibliotecaImplementador.listarLivros(id);
    }

    public void cancelarReserva(int id, String titulo){
        bibliotecaImplementador.cancelarReserva(id,titulo);
    }

    public void exe (){

        for(Livro livro: bibliotecaImplementador.getLivros()){
            System.out.println(livro);
        }
    }

}
