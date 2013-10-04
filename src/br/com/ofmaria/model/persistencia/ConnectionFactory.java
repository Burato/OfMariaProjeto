package br.com.ofmaria.model.persistencia;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

    //String de conexão do mySQL
    private static final String STR_CONEXAO = "jdbc:mysql://localhost:3306/";
    //Nome da base de dados criada no MYSQL
    private static final String DATABASE = "OfMaria";
    //Usuário e senha do mySQL
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //Método que pega a conexão
    public static Connection getConnection()
            throws SQLException {
        try {
            return DriverManager.getConnection(STR_CONEXAO + DATABASE, USER, PASSWORD);
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }

    }

    //Método que fecha a conexão
    public static void closeConnection(Connection con)
            throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    //Método que fecha o Statement
    public static void closeConnection(Connection con, Statement stmt)
            throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        closeConnection(con);
    }

    //Método fecha ResultSet
    public static void closeConnection(Connection con, Statement stmt, ResultSet rs)
            throws SQLException {
        if (rs != null) {
            rs.close();
        }
        closeConnection(con, stmt);
    }
}
