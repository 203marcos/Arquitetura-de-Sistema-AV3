package Modelo;

import ModeloAbstrato.Aluno;
import ModeloAbstrato.Disciplina;

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

    public Boolean ativoPresencial(){

        if(super.getModalidade().equals("Presencial") && super.getStatus().equals("Ativo")){
            return true;
        }

        return false;
    }

    public AlunoImplementador listarDisciplina (DisciplinaImplementador disciplina){

        if(super.getCurso().equals(disciplina.getCurso())){
            return this;
        }

        return null;
    }


    public void adicionarDisciplina(Disciplina disciplina){
        if(super.getIndiceAtual() < 10){
            Disciplina[] arrayDisciplina = getArrayDisciplina();
            arrayDisciplina[getIndiceAtual()] = disciplina;
            setIndiceAtual(getIndiceAtual()+1);
        }else{
            System.out.println("VOCE JA TEM 10 DISCIPLINAS ADICIONADAS");
        }
    }

    public void disciplinasCursadas (){
        Disciplina[] arrayDisciplina = getArrayDisciplina();
        for(int i = 0;i<getIndiceAtual();i++){
            arrayDisciplina[i].exibirDisciplina();
        }
    }

    public void excluirDisciplina(String nomeDisciplina){
        Disciplina[] arrayDisciplina = getArrayDisciplina();
        for(int i = 0;i<getIndiceAtual();i++){
            arrayDisciplina[i].exibirDisciplina();

            if(arrayDisciplina[i].getNome().equals(nomeDisciplina)){
                System.out.println("EXCLUIDA COM SUCESSO");
                for (int j = i; j < getIndiceAtual() - 1; j++) {
                    arrayDisciplina[j] = arrayDisciplina[j + 1];
                }
                arrayDisciplina[getIndiceAtual() - 1] = null;
                setIndiceAtual(getIndiceAtual()-1);
            }
        }
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

}
