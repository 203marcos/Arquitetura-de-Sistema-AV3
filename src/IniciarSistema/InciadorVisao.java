package IniciarSistema;

import IniciarSistema.Tipos.IniciaAluno;
import IniciarSistema.Tipos.IniciaDisciplina;
import IniciarSistema.Tipos.IniciaLivro;
import Visao.VisaoBiblioteca;
import Visao.VisaoEstudante;
import Visao.VisaoMatricula;

public class InciadorVisao {

    private  VisaoEstudante visaoEstudante;
    private  VisaoMatricula visaoMatricula;
    private  VisaoBiblioteca visaoBiblioteca;

    // Construtor com injeção de dependência
    public InciadorVisao(IniciaAluno iniciaAluno, IniciaDisciplina iniciaDisciplina, IniciaLivro iniciaLivro) {
        this.visaoEstudante = new VisaoEstudante(iniciaAluno.getApiAluno().devolverListaEstudantes());
        this.visaoMatricula = new VisaoMatricula(
                iniciaAluno.getApiAluno().devolverListaEstudantes(),
                iniciaDisciplina.getApiDisciplina().devolverListaDisciplina()
        );
        this.visaoBiblioteca = new VisaoBiblioteca(
                iniciaAluno.getApiAluno().devolverListaEstudantes(),
                iniciaLivro.getApiLivro().devolverListaLivros()
        );
    }

    // Getters (removidos setters para manter imutabilidade)
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
