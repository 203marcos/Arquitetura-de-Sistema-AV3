package Visao;

import Controlador.ControladorEstudanteDisciplina;

import java.util.Scanner;

public class VisaoEstudanteDisciplina {
    private Scanner captura = new Scanner(System.in);
    private ControladorEstudanteDisciplina controlador;

    public VisaoEstudanteDisciplina(ControladorEstudanteDisciplina controlador){
        this.controlador = controlador;
    }


    public void matricularEstudante(){
        System.out.println("ESCOLHA O NOME DA DISCIPLINA");
        controlador.permissaoMatricular(captura.nextLine());
    }



}
