package Modelo;

import ModeloAbstrato.Aluno;
import ModeloAbstrato.Disciplina;
import ModeloAbstrato.Matricula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatriculaImplementador extends Matricula {

    private Map<Integer, List<DisciplinaImplementador>> disciplinasMatriculadas;

    public MatriculaImplementador(List<AlunoImplementador> alunos, List<DisciplinaImplementador> disciplinas) {
        super(alunos, disciplinas);
        this.disciplinasMatriculadas = new HashMap<>();
    }

    @Override
    public void matricular(int id, String nomeCurso) {
        for (Aluno estudante : super.getAlunos()) {
            Aluno alunoEncontrado = estudante.buscarPorId(id);
            if (alunoEncontrado != null && alunoEncontrado.ativoPresencial()) {
                System.out.println(alunoEncontrado);
                for (DisciplinaImplementador disciplina : super.getDisciplinas()) {
                    DisciplinaImplementador disciplinaEncontrada = disciplina.encontraDisiciplinaNome(nomeCurso);
                    if (disciplinaEncontrada != null && disciplinaEncontrada.getCurso().equals("História")) {
                        System.out.println(disciplinaEncontrada);
                        if (super.getIndiceAtual() < 10) {
                            Disciplina[] arrayDisciplina = super.getArrayDisciplina();
                            arrayDisciplina[super.getIndiceAtual()] = disciplinaEncontrada;
                            super.setIndiceAtual(super.getIndiceAtual() + 1);

                            // Adicionar a disciplina ao aluno
                            disciplinasMatriculadas.computeIfAbsent(id, k -> new ArrayList<>()).add(disciplinaEncontrada);
                        } else {
                            System.out.println("VOCE JA TEM 10 DISCIPLINAS ADICIONADAS");
                        }
                        break; // Para o loop das disciplinas
                    }
                }
                break; // Para o loop dos alunos
            }
        }
    }


    @Override
    public void listarDisciplinas(int id) {
        List<DisciplinaImplementador> disciplinas = disciplinasMatriculadas.get(id);
        if (disciplinas != null) {
            for (DisciplinaImplementador disciplina : disciplinas) {
                System.out.println(disciplina);
            }
        } else {
            System.out.println("Nenhuma disciplina encontrada para o aluno com ID: " + id);
        }
    }

    @Override
    public void removerDisciplina(int id, String nomeCurso) {
        List<DisciplinaImplementador> disciplinas = disciplinasMatriculadas.get(id);
        if (disciplinas != null) {
            disciplinas.removeIf(disciplina -> disciplina.getNome().equals(nomeCurso));
            System.out.println("Disciplina removida: " + nomeCurso);
        } else {
            System.out.println("Nenhuma disciplina encontrada para o aluno com ID: " + id);
        }
    }
}
