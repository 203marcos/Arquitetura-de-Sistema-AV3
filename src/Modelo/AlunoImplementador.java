package Modelo;

import ModeloAbstrato.Aluno;
import ModeloAbstrato.Disciplina;

public class AlunoImplementador extends Aluno  {


    public AlunoImplementador(int id, String nome, String curso, String modalidade, String status) {
        super(id, nome, curso, modalidade, status);
    }

    public Aluno buscarPorCurso (String cursoProcurado){

        if(super.getCurso().equals(cursoProcurado)){
            return this;
        }

        return null;
    }

    public Aluno buscarPorId (Integer id){

        if(super.getId() == id){
            return this;
        }

        return null;
    }

    public Boolean ativoPresencial(){

        if(super.getModalidade().equals("Presencial") && super.getStatus().equals("Ativo")){
            return true;
        }

        return false;
    }










}
