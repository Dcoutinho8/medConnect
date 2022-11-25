
package a3st;
import javax.swing.JOptionPane;

public class A31 extends javax.swing.JFrame {

  
    public A31() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntrarL = new javax.swing.JButton();
        Cadastrese = new javax.swing.JButton();
        Senha = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        TeocarUser = new javax.swing.JButton();
        Rsenha = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(776, 590));
        getContentPane().setLayout(null);

        EntrarL.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        EntrarL.setText("Entrar");
        EntrarL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EntrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarLActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarL);
        EntrarL.setBounds(120, 370, 100, 40);

        Cadastrese.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Cadastrese.setText("Cadastre-se");
        Cadastrese.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Cadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastreseActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrese);
        Cadastrese.setBounds(520, 320, 100, 22);

        Senha.setText("Senha");
        Senha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Senha);
        Senha.setBounds(30, 290, 300, 22);

        Email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Email.setText("Email ou CPF");
        Email.setToolTipText("Email ou CPF");
        Email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Email.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email);
        Email.setBounds(30, 230, 300, 22);
        Email.getAccessibleContext().setAccessibleName("Email ou CPF");

        TeocarUser.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TeocarUser.setText("Trocar User");
        TeocarUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(TeocarUser);
        TeocarUser.setBounds(645, 520, 100, 22);

        Rsenha.setText("Recuperar a senha");
        Rsenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Rsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Rsenha);
        Rsenha.setBounds(360, 520, 120, 18);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 520, 75, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\danil\\OneDrive\\Documentos\\Faculdade\\imgA3\\login.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 777, 551);

        jPanel1.setMinimumSize(new java.awt.Dimension(756, 552));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarLActionPerformed
        if(Email.getText().equals("teste")&& Senha.getText().equals("1234")){
            JOptionPane.showMessageDialog(null, "Acesso permetido");
            A3Dados A3 = new A3Dados();
               A3.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado!");
        }
       
        
    }//GEN-LAST:event_EntrarLActionPerformed

    private void RsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsenhaActionPerformed
        A3Rsenha Rsenha = new A3Rsenha();
        Rsenha.setVisible(true);
    }//GEN-LAST:event_RsenhaActionPerformed

    private void CadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastreseActionPerformed
        A3Cadstro cadastro = new A3Cadstro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_CadastreseActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrese;
    private javax.swing.JTextField Email;
    private javax.swing.JButton EntrarL;
    private javax.swing.JButton Rsenha;
    private javax.swing.JTextField Senha;
    private javax.swing.JButton TeocarUser;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
