
package a3st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public String usuario ="root";
    public String URL = "jdbc:mysql://localhost:3306/medConnect?useTimezone=true&serverTimezone=UTC";
    public String senha ="coutti0803";
    
    public Connection conexao(){
        try {
            Connection con = DriverManager.getConnection(URL,usuario,senha);
          
            System.out.println(con);
            return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  null;
        }
    }
}
