package Tarefas.Menus;
import Tarefas.Banco.TarefaDAO;

import java.util.Scanner;

public class Menu {
    public static void init() {
        Scanner sc = new Scanner(System.in);
        TarefaDAO tarefaDAO = new TarefaDAO();
        System.out.println ("Seja bem vindo ao gerenciador de tarefas.");
        boolean continua = true;
        while (continua){
            System.out.println("\n Gerenciador de Tarefas");
            System.out.println("1 - Adicionar Tarefas");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Atualizar Tarefas");
            System.out.println("4 - Excluir Tarefas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    MenuCriar.Criar ();
                    break;
                case 2:
                    MenuListar.Listar ();
                    break;
                case 3:
                    MenuAtualizar.Atualizar ();
                    break;
                case 4:
                    MenuExcluir.ExcluirTarefa ();
                    break;
                case 5:
                    System.out.println ("Obrigado por utilizar");
                    continua = false;
                    sc.close();
                    break;

                    default:
                        System.out.println ("opção invalida");
            }
        }
    }
}
