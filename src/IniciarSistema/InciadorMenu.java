package IniciarSistema;
import Controlador.ControladorMenu;


import java.util.Scanner;

public class InciadorMenu {
    ControladorMenu controladorMenu;



    public InciadorMenu(InciadorVisao visao) {
        controladorMenu = new ControladorMenu(visao.getVisaoEstudante(),visao.getVisaoMatricula(),visao.getVisaoBiblioteca());
    }

    public void inicioMenu(){
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            // Exibe o menu
            System.out.println("Menu de opções:");
            System.out.println("1 - Listar todos os estudantes do curso de \"História\" na modalidade presencial.");
            System.out.println("2 - Ver detalhes de um estudante específico (pesquisa por ID ou Nome).");
            System.out.println("3 - Permitir que um estudante com status ativo na modalidade presencial se matricule em uma disciplina de acordo com a oferta do curso de \"História\".");
            System.out.println("4 - Listar todas as disciplinas em que um estudante está devidamente matriculado.");
            System.out.println("5 - Remover uma disciplina da matrícula do aluno.");
            System.out.println("6 - Permitir que um estudante com status ativo possa reservar um livro.");
            System.out.println("7 - Listar todos os livros reservados pelo estudante.");
            System.out.println("8 - Cancelar a reserva de um livro selecionado.");
            System.out.println("9 - Opção 9");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // Lê a opção do usuário

            // Processa a opção
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1");
                    //visao.getVisaoEstudante().iniciarProcuraCurso("História");
                    controladorMenu.getVisaoEstudante().iniciarProcuraCurso("História");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2");
                    //visao.getVisaoEstudante().iniciarProcuraId();
                    controladorMenu.getVisaoEstudante().iniciarProcuraId();
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3");
                    //Escolher a disciplina ofertada... História Medieval/História do Brasil Colônia/Geomorfologia
                    //visao.getVisaoMatricula().matricular();
                    controladorMenu.getVisaoMatricula().matricular();
                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4");
                    //visao.getVisaoMatricula().listarDisciplinas();
                    controladorMenu.getVisaoMatricula().listarDisciplinas();
                    break;
                case 5:
                    System.out.println("Você escolheu a Opção 5");
                    //visao.getVisaoMatricula().removerDisciplina();
                    controladorMenu.getVisaoMatricula().removerDisciplina();
                    break;
                case 6:
                    System.out.println("Você escolheu a Opção 6");
                    //visao.getVisaoBiblioteca().reservarLivro();
                    controladorMenu.getVisaoBiblioteca().reservarLivro();
                    break;
                case 7:
                    System.out.println("Você escolheu a Opção 7");
                    //visao.getVisaoBiblioteca().listarLivros();
                    controladorMenu.getVisaoBiblioteca().listarLivros();
                    break;
                case 8:
                    System.out.println("Você escolheu a Opção 8");
                    //visao.getVisaoBiblioteca().cancerlarReserva();
                    controladorMenu.getVisaoBiblioteca().cancerlarReserva();
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
