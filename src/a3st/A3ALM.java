/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a3st;

/**
 *
 * @author tiago
 */
public class A3ALM extends javax.swing.JFrame {

    /**
     * Creates new form A3ALM
     */
    public A3ALM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Seta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 782));
        getContentPane().setLayout(null);

        jTextField1.setText("Nome do Medicamento");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 270, 320, 22);

        jButton1.setText("Adicionar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 340, 90, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(610, 280, 330, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(610, 350, 330, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(610, 420, 330, 22);

        jLabel1.setText("Medicamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(610, 260, 90, 16);

        jLabel3.setText("Medicamento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 330, 90, 16);

        jLabel4.setText("Medicamento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 400, 80, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(610, 490, 330, 22);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(610, 560, 330, 22);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(610, 640, 330, 22);

        jLabel5.setText("Medicamento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(610, 470, 90, 16);

        jLabel6.setText("Medicamento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(610, 540, 80, 16);

        jLabel7.setText("Medicamento");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 620, 80, 16);

        Seta.setBackground(new java.awt.Color(170, 191, 184));
        Seta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaActionPerformed(evt);
            }
        });
        getContentPane().add(Seta);
        Seta.setBounds(0, 0, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Tiago\\faculdade\\imgA3\\11ALM.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1070, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaActionPerformed
        A3Dados alergia = new A3Dados();
        alergia.setVisible(true);
    }//GEN-LAST:event_SetaActionPerformed

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
            java.util.logging.Logger.getLogger(A3ALM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A3ALM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A3ALM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A3ALM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A3ALM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Seta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
