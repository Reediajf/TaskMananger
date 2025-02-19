package Tarefas.Menus;

import Tarefas.Banco.TarefaDAO;

import java.util.Scanner;

public class MenuExcluir {
    public static void ExcluirTarefa () {
        Tarefas.Banco.TarefaDAO tarefaDAO = new TarefaDAO ();
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite o id da tarefa a ser exluido");
        int idex = sc.nextInt ();
        tarefaDAO.excluirTarefa (idex);
    }
}
