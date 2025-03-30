package IniciarSistema;

import IniciarSistema.Tipos.IniciaAluno;
import IniciarSistema.Tipos.IniciaDisciplina;
import IniciarSistema.Tipos.IniciaLivro;

public class IniciadorApi {

    private final IniciaAluno iniciaAluno;
    private final IniciaDisciplina iniciaDisciplina;
    private final IniciaLivro iniciaLivro;

    public IniciadorApi() {
        this.iniciaAluno = new IniciaAluno();
        this.iniciaDisciplina = new IniciaDisciplina();
        this.iniciaLivro = new IniciaLivro();
    }

    public IniciaAluno getIniciaAluno() {
        return iniciaAluno;
    }

    public IniciaDisciplina getIniciaDisciplina() {
        return iniciaDisciplina;
    }

    public IniciaLivro getIniciaLivro() {
        return iniciaLivro;
    }
}
