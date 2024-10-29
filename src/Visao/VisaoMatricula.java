package Visao;

import Controlador.ControladorMatricula;

import java.util.Scanner;

public class VisaoMatricula {

    private ControladorMatricula controlador;
    private Scanner captura = new Scanner(System.in);

    public VisaoMatricula (ControladorMatricula controlador){
        this.controlador = controlador;
    }


    public void matricular() {
        System.out.println("DIGITE O ID DO ESTUDANTE");
        int id = captura.nextInt();
        captura.nextLine(); // Consumir a nova linha pendente
        System.out.println("DIGITE O NOME DO CURSO QUE O ESTUDANTE QUER INGRESSAR");
        String curso = captura.nextLine();
        controlador.matricularAluno(id, curso);
    }


    public void listarDisciplinas(){
        System.out.println("DIGITE O ID DO ESTUDANTE");
        int id = captura.nextInt();
        controlador.listarDisciplinas(id);
    }

    public void removerDisciplina(){
        System.out.println("DIGITE O ID DO ESTUDANTE");
        int id = captura.nextInt();
        captura.nextLine();
        System.out.println("DIGITE O NOME DO CURSO QUE DESEJA A RETIRADA");
        String nomeCurso = captura.nextLine();
        controlador.removerDisciplinas(id,nomeCurso);
    }

}
