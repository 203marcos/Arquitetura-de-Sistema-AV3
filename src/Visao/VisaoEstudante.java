package Visao;

import Controlador.ControladorEstudante;
import Modelo.AlunoImplementador;

import java.util.Scanner;

public class VisaoEstudante {
    private ControladorEstudante controlador;
    private Scanner captura = new Scanner(System.in);

    public VisaoEstudante (ControladorEstudante controlador){
        this.controlador = controlador;
    }

    public void iniciarProcuraCurso (String curso){
        controlador.procuraCurso(curso);
    }

    public void iniciarProcuraId (){
        System.out.println("DIGITE O ID PARA A PROCURA");
        controlador.procuraId(captura.nextInt());
    }

    public void exibeDetalhesEstudante(AlunoImplementador alunoImplementador){
        System.out.println(alunoImplementador);
    }

    public void exibeDisciplinasCursada(){
        System.out.println("DIGITE A ID DO ESTUDANTE");
        controlador.listarDisciplinas(captura.nextInt());
        System.out.println("DISCIPLINAS CURSADAS");
        captura.nextLine();
    }

    public void excluirDisciplina(){
        System.out.println("ESCREVA O NOME DO CURSO PARA EXCLUSÃO");
        String nome = captura.nextLine();
        System.out.println("ESCREVA A ID DO ESTUDANTE");
        int id = captura.nextInt();


        controlador.removerMatricula(id,nome);

    }









}
