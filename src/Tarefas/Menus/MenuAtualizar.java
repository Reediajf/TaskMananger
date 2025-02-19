package Tarefas.Menus;

import Tarefas.Banco.TarefaDAO;
import java.util.Scanner;

public class MenuAtualizar {
    public static void Atualizar () {
        Tarefas.Banco.TarefaDAO tarefaDAO = new TarefaDAO();
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite o id da tarefa");
        int id = sc.nextInt ();
        System.out.println ("Digite o status da tarefa(Pendente/Concluida)");
        String novoStatus = sc.next();
        tarefaDAO.atualizarTarefa ( id, novoStatus );
        tarefaDAO.ListarTarefas();
    }
}
