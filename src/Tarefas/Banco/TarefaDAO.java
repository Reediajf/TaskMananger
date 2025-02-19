package Tarefas.Banco;
import Tarefas.Tarefa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {
    public static List<Tarefa> tarefas;

    public static List<Tarefa> ListarTarefas () {
        List<Tarefa> tarefas = new ArrayList<> ();
        String sql = "SELECT * FROM tarefas";
        try (Connection conn = ConexaoDB.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next ()) {
                    Tarefa tarefa = new Tarefa (
                            rs.getInt ( "id" ),
                            rs.getString ( "titulo" ),
                            rs.getString ( "descricao" ),
                            rs.getString ( "status" )
                    );
                    tarefas.add ( tarefa );
                }
            } catch (SQLException e) {
            e.printStackTrace ();
        }
        if (tarefas.isEmpty ()) {
            System.out.println ("nenhuma tarefa encontrada");
        }
        return tarefas;
    }

    public void adicionarTarefa (String titulo, String descricao, String status){

            String sql = "INSERT INTO tarefas (titulo, descricao, status) VALUES (?, ?, ?)";

             try (Connection connection = ConexaoDB.getConexao ();
                 PreparedStatement stmt = connection.prepareStatement ( sql )) {

                stmt.setString ( 1, titulo );
                stmt.setString ( 2, descricao );
                stmt.setString ( 3, status );
                stmt.executeUpdate ();
                Tarefa tarefa = new Tarefa ( titulo, descricao, status );


                System.out.println ( "Tarefa adicionada com sucesso!" );
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

    public void atualizarTarefa(int id, String novoStatus) {
        String sql = "UPDATE tarefas SET status = ? WHERE id = ?";

        try (Connection connection = ConexaoDB.getConexao();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, novoStatus);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void excluirTarefa (int id) {
        String sql = "DELETE FROM tarefas WHERE id = ?";
        try (Connection connection = ConexaoDB.getConexao ();
        PreparedStatement stmt = connection.prepareStatement(sql)) {
         stmt.setInt(1, id);
         stmt.executeUpdate ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

}

