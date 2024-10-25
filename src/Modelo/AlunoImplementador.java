package Modelo;

import ModeloAbstrato.Aluno;

public class AlunoImplementador extends Aluno  {


    public AlunoImplementador(int id, String nome, String curso, String modalidade, String status) {
        super(id, nome, curso, modalidade, status);
    }

    public AlunoImplementador listarCurso (String cursoProcurado){

        if(super.getCurso().equals(cursoProcurado)){
            return this;
        }

        return null;
    }

    public AlunoImplementador listarId (Integer id){

        if(super.getId() == id){
            return this;
        }

        return null;
    }

    @Override
    public String toString() {
        // Utilizando os getters para acessar os atributos privados
        return "Estudante{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", modalidade='" + getModalidade() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }

    @Override
    public void exibirDados() {
        System.out.println(toString());
    }
}
