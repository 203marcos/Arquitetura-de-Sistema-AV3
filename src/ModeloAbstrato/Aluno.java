package ModeloAbstrato;

public abstract class Aluno {
    private int id;
    private String nome;
    private String curso;
    private String modalidade;
    private String status;
    private Disciplina[] arrayDisciplina = new Disciplina[10];
    private int indiceAtual = 0;


    // Construtor
    public Aluno(int id, String nome, String curso, String modalidade, String status) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.modalidade = modalidade;
        this.status = status;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Disciplina[] getArrayDisciplina() {
        return arrayDisciplina;
    }

    public void setArrayDisciplina(Disciplina[] arrayDisciplina) {
        this.arrayDisciplina = arrayDisciplina;
    }

    public int getIndiceAtual() {
        return indiceAtual;
    }

    public void setIndiceAtual(int indiceAtual) {
        this.indiceAtual = indiceAtual;
    }


}