package test;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMysqlJDBC {

    public static void main(String[] args) {
        //ip del servidor que se esta usando
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            // Class.forName("com.mysqk.cj.jdbc.Driver"); Ya no se usa pero en aplicaciones WEB si puede ser utilizada
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";    
            Statement instruccion = conexion.createStatement();
            
            ResultSet resultado = instruccion.executeQuery(sql);
            
            while(resultado.next()){
                System.out.print("Id persona: " + resultado.getInt(" id_persona"));
                System.out.print("Nombre: " + resultado.getString(" nombre"));
                System.out.println("Apellido: " + resultado.getString(" apellido"));
                System.out.println("Email: " + resultado.getString(" email"));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
