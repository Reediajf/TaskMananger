package Tarefas.Banco;

import java.sql.*;

public class ConexaoDB {

    private static String mysql_host = "jdbc:mysql://127.0.0.1:3306/tarefasdb"; //Host do banco de dados.
    private  static String mysql_username = "root"; //Usuario do banco de dados.
    private static String mysql_password = "admin"; //Senha do banco de dados.

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(mysql_host, mysql_username, mysql_password);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }

}
