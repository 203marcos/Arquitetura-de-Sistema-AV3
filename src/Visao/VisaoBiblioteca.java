package Visao;

import Controlador.ControladorBiblioteca;
import Modelo.AlunoImplementador;
import Modelo.LivroImplementador;

import java.util.List;
import java.util.Scanner;

public class VisaoBiblioteca {
    private ControladorBiblioteca controlador;
    private Scanner captura = new Scanner(System.in);

    public VisaoBiblioteca(List<AlunoImplementador> alunos, List<LivroImplementador> livros){
        this.controlador = new ControladorBiblioteca(alunos,livros,this);
    }

    public void reservarLivro(){
        System.out.println("DIGITE O ID DO ESTUDANTE");
        int id = captura.nextInt();
        captura.nextLine(); // Consumir a nova linha pendente
        System.out.println("DIGITE O TITULO DO LIVRO QUE DESEJA RESERVAR");
        String titulo = captura.nextLine();
        controlador.reservarLivros(id,titulo);
    }

    public void listarLivros(){
        System.out.println("DIGITE O ID DO ESTUDANTE");
        int id = captura.nextInt();
        controlador.listarLivros(id);
    }

    public void cancerlarReserva(){
        System.out.println("DIGITE O ID DO ESTUDANTE");
        int id = captura.nextInt();
        captura.nextLine();
        System.out.println("DIGITE O NOME DO LIVRO QUE DESEJA A RETIRADA");
        String titulo = captura.nextLine();
        controlador.cancelarReserva(id,titulo);
    }


    public void testes(){
        controlador.exe();
    }
}
