package Controlador;

import Visao.VisaoBiblioteca;
import Visao.VisaoDisciplina;
import Visao.VisaoEstudante;
import Visao.VisaoMatricula;

public class ControladorMenu {
    private VisaoEstudante visaoEstudante;
    private VisaoMatricula visaoMatricula;
    private VisaoBiblioteca visaoBiblioteca;

    public ControladorMenu(VisaoEstudante visaoEstudante,VisaoMatricula visaoMatricula,VisaoBiblioteca visaoBiblioteca) {
        this.visaoEstudante = visaoEstudante;
        this.visaoMatricula = visaoMatricula;
        this.visaoBiblioteca = visaoBiblioteca;
    }

    public VisaoEstudante getVisaoEstudante() {
        return visaoEstudante;
    }

    public VisaoMatricula getVisaoMatricula() {
        return visaoMatricula;
    }

    public VisaoBiblioteca getVisaoBiblioteca() {
        return visaoBiblioteca;
    }
}
