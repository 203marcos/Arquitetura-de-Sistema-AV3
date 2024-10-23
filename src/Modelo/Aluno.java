package Modelo;

public class Aluno {
    private int id;
    private String nome;
    private String curso;
    private String modalidade;
    private String status;

    // Construtor
    public Aluno(int id, String nome, String curso,String modalidade,String status) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.modalidade = modalidade;
        this.status = status;
    }

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

    public Aluno listarCurso (String cursoProcurado){

        if(curso.equals(cursoProcurado)){
            return this;
        }

        return null;
    }

    public Aluno listarId (Integer id){

        if(this.id == id){
            return this;
        }

        return null;
    }



    @Override
    public String toString() {
        return "Estudante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", modalidade='" + modalidade + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
