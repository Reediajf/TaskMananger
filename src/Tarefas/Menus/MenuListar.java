package Tarefas.Menus;

import java.util.List;
import Tarefas.Banco.TarefaDAO;
import Tarefas.Tarefa;

public class MenuListar {
    public static void Listar () {
        Tarefas.Banco.TarefaDAO tarefaDAO = new TarefaDAO();
        List<Tarefa> tarefas = tarefaDAO.ListarTarefas();
        for (Tarefa tarefa : tarefas){
            System.out.println ("id: " + tarefa.getId () + "|"  + "Titulo: " + tarefa.getTitulo () + "|" + "Descrição: " + tarefa.getDescricao () + "|" + "Status: " + tarefa.getStatus ());
        }
    }
}
