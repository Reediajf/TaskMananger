package Tarefas.Menus;
import Tarefas.Banco.TarefaDAO;
import java.util.Scanner;

public class MenuCriar {
    public static void Criar(){
        Scanner sc = new Scanner(System.in);
        Tarefas.Banco.TarefaDAO tarefaDAO = new TarefaDAO();
        System.out.println ("Digite o titulo da tarefa");
        String titulo = sc.nextLine ();
        System.out.println ("Digite a descrição da tarefa");
        String descricao = sc.nextLine ();
        System.out.println ("Digite o Status da tarefa(Pendente/Concluida)");
        String status = sc.nextLine();
        tarefaDAO.adicionarTarefa (titulo, descricao, status);
    }
}
