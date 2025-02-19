package Tarefas.Banco;

import java.sql.*;

public class ConexaoDB {

    private static String mysql_host = ""; //Host do banco de dados.
    private  static String mysql_username = ""; //Usuario do banco de dados.
    private static String mysql_password = ""; //Senha do banco de dados.

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(mysql_host, mysql_username, mysql_password);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }

}
