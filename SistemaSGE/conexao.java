package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    private static String URL = "jdbc:mysql://localhost:3306/projeto_PI";
    private static String USUARIO = "root";
    private static String SENHA = "root";  
    public static Connection conectar(){
        try{
            Connection conn = DriverManager.getConnection(URL,USUARIO,SENHA);
            System.out.println("Conectado!");
            return conn;
        } catch(SQLException e){
            System.out.println("Erro na Conexão!");
            e.printStackTrace();
            return null;
        }
    }
}
