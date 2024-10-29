package Visao;

import Controlador.ControladorEstudante;
import Modelo.AlunoImplementador;
import ModeloAbstrato.Aluno;

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

    public void exibeDetalhesEstudante(Aluno alunoImplementador){
        System.out.println(alunoImplementador);
    }



}
