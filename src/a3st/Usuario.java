
package a3st;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Usuario {
    

   private int codigo;
    private String nomePaciente;
    private String cpfPaciente;
    private String DataNascPaciente;
    private String emailPaciente;
    private String cepPaciente;
    private String ComplementoPaciente;
    private String numeroPaciente;
    private String senhaPaciente;
    private String parentesco;
    private String confirmSenha;

    public Usuario( String senhaPaciente, String cpfPaciente ) {       
        this.senhaPaciente = senhaPaciente;
        this.cpfPaciente = cpfPaciente; 
        
    }
    public void inserir(){
        String sql = "INSERT INTO Paciente (nomePaciente,cpfPaciente,dataNascPaciente,emailPaciente,cepPaciente,complementoPaciente,numeroPaciente,senhaPaciente) VALUES (?,?,?,?,?,?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();  
        try(Connection c = factory.conexao()){
            PreparedStatement ps = c.prepareStatement (sql);
            ps.setString(1, getNomePaciente());
            ps.setString(2,getCpfPaciente());
            ps.setString(3, getDataNascPaciente());
            ps.setString(4, getEmailPaciente());        
            ps.setString(5, getCepPaciente());
            ps.setString(6, getComplementoPaciente());  
            ps.setString(7, getNumeroPaciente());  
            ps.setString(8, getSenhaPaciente());
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getDataNascPaciente() {
        return DataNascPaciente;
    }

    public void setDataNascPaciente(String DataNascPaciente) {
        this.DataNascPaciente = DataNascPaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }


    public String getComplementoPaciente() {
        return ComplementoPaciente;
    }

    public void setComplementoPaciente(String ComplementoPaciente) {
        this.ComplementoPaciente = ComplementoPaciente;
    }

    public String getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(String numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getSenhaPaciente() {
        return senhaPaciente;
    }

    public void setSenhaPaciente(String senhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getConfirmSenha() {
        return confirmSenha;
    }

    public void setConfirmSenha(String confirmSenha) {
        this.confirmSenha = confirmSenha;
    }

    public String getCepPaciente() {
        return cepPaciente;
    }

    public void setCepPaciente(String cepPaciente) {
        this.cepPaciente = cepPaciente;
    }
    

}


