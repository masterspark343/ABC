package datos;
// ESTA CLASE SOLO SE ENCARGA DE CONCTAR LA BD Y DE CERRAR LS MISMOSS

import java.sql.*;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    //Metodo para obtener la conexion a la BD
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    //METODOS PARA CERRAR LAS CONEXIONES
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement stmt) throws SQLException {
        stmt.close();
    }
    
    
    public static void close(Connection conn) throws SQLException{
    conn.close();
    }
}
