
package a3st;
import javax.swing.SwingUtilities;
import java.awt.Dimension;


public class a3f extends javax.swing.JFrame {

    public a3f() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paciente = new javax.swing.JButton();
        Instituição = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(776, 580));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        Paciente.setBackground(new java.awt.Color(170, 191, 184));
        Paciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Paciente.setText("Paciente");
        Paciente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });
        getContentPane().add(Paciente);
        Paciente.setBounds(150, 330, 150, 40);

        Instituição.setBackground(new java.awt.Color(127, 162, 251));
        Instituição.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Instituição.setText("Instituição");
        Instituição.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Instituição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstituiçãoActionPerformed(evt);
            }
        });
        getContentPane().add(Instituição);
        Instituição.setBounds(150, 410, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\danil\\OneDrive\\Documentos\\Faculdade\\imgA3\\tELAi.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 777, 547);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteActionPerformed
      A31 frame = new A31();
         frame.setVisible(true);
    }//GEN-LAST:event_PacienteActionPerformed

    private void InstituiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstituiçãoActionPerformed
       A3instituição inst = new A3instituição();
       inst.setVisible(true);
    }//GEN-LAST:event_InstituiçãoActionPerformed

    public void getFrame()
    {
        setVisible(true);
        //setBounds(400,100,500,500);
        setSize(1278,720);
        //setLocation(52,300);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a3f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a3f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a3f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a3f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a3f().setVisible(true);

            }
        });    
        
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instituição;
    private javax.swing.JButton Paciente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
