package Main;

import Controlador.ControladorEstudante;
import ConsumoApis.ConsumidorAPIDisciplina;
import ConsumoApis.ConsumidorAPILivro;
import Controlador.ControladorEstudanteDisciplina;
import Visao.VisaoEstudante;
import ConsumoApis.ConsumidorAPIAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsumidorAPIAluno apiAluno = new ConsumidorAPIAluno();
        ConsumidorAPIDisciplina apiDisciplina = new ConsumidorAPIDisciplina();
        ConsumidorAPILivro apiLivro = new ConsumidorAPILivro();

//        apiAluno.printarEstudantes();
//        apiDisciplina.printarDisciplina();
//        apiLivro.printarLivros();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        ControladorEstudante controladorEstudante = new ControladorEstudante(apiAluno.devolverListaEstudantes());
        VisaoEstudante visaoEstudante = new VisaoEstudante(controladorEstudante);


        do {
            // Exibe o menu
            System.out.println("Menu de opções:");
            System.out.println("1 - Listar todos os estudantes do curso de \"História\" na modalidade presencial.");
            System.out.println("2 - Ver detalhes de um estudante específico (pesquisa por ID ou Nome).");
            System.out.println("3 - Permitir que um estudante com status ativo na modalidade presencial se matricule em uma disciplina de acordo com a oferta do curso de \"História\".");
            System.out.println("4 - Opção 4");
            System.out.println("5 - Opção 5");
            System.out.println("6 - Opção 6");
            System.out.println("7 - Opção 7");
            System.out.println("8 - Opção 8");
            System.out.println("9 - Opção 9");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // Lê a opção do usuário

            // Processa a opção
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1");
                    visaoEstudante.iniciarProcuraCurso("História");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2");
                    visaoEstudante.iniciarProcuraId();
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3");
                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4");
                    break;
                case 5:
                    System.out.println("Você escolheu a Opção 5");
                    break;
                case 6:
                    System.out.println("Você escolheu a Opção 6");
                    break;
                case 7:
                    System.out.println("Você escolheu a Opção 7");
                    break;
                case 8:
                    System.out.println("Você escolheu a Opção 8");
                    break;
                case 9:
                    System.out.println("Você escolheu a Opção 9");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0); // Continua até o usuário escolher 0

        scanner.close(); // Fecha o scanner
    }
}
