package Main;


import IniciarSistema.InciadorMenu;
import IniciarSistema.InciadorVisao;
import IniciarSistema.IniciadorApi;


public class Main {
    public static void main(String[] args) {
        IniciadorApi iniciadorApi = new IniciadorApi();
        InciadorVisao visao = new InciadorVisao(iniciadorApi.getIniciaAluno(),iniciadorApi.getIniciaDisciplina(),iniciadorApi.getIniciaLivro());
        InciadorMenu menu = new InciadorMenu(visao);
        menu.inicioMenu();

    }
}

