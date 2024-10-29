package Visao;

import Controlador.ControladorDisciplina;

import java.util.Scanner;

public class VisaoDisciplina {

    private ControladorDisciplina controlador;
    private Scanner captura = new Scanner(System.in);

    public VisaoDisciplina (ControladorDisciplina controlador){
        this.controlador = controlador;
    }


}
