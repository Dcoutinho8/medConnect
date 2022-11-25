
package a3st;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


//colocar o CPF TAMBEM!   
public class DAO {
    public boolean existe(Usuario usuario) throws Exception{
    String sql = "SELECT * FROM medConnect WHERE cpfPaciente = ? AND senhaPaciente = ?"; 
        ConnectionFactory factory = new ConnectionFactory();
            try(Connection conn = factory.conexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
                    ps.setString(1,usuario.getCpfPaciente());
                    ps.setString(2,usuario.getSenhaPaciente());
                    try(ResultSet rs = ps.executeQuery()){
                        return rs.next();
                    }
                
            }
    }
}
