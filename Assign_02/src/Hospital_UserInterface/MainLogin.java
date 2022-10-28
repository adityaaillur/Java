/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hospital_UserInterface;

/**
 *
 * @author adityaillur
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    public MainLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        jbtn_sysad = new javax.swing.JButton();
        jbtn_comad = new javax.swing.JButton();
        jbtn_doc = new javax.swing.JButton();
        jbtn_pat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login.setBackground(new java.awt.Color(51, 204, 255));
        lbl_login.setFont(new java.awt.Font("Phosphate", 1, 48)); // NOI18N
        lbl_login.setText("LOGIN AS");
        lbl_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 70));

        jbtn_sysad.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_sysad.setFont(new java.awt.Font("Telugu MN", 1, 18)); // NOI18N
        jbtn_sysad.setText("System Admin");
        jbtn_sysad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_sysad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_sysadActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_sysad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 60));

        jbtn_comad.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_comad.setFont(new java.awt.Font("Telugu MN", 1, 18)); // NOI18N
        jbtn_comad.setText("Community Admin");
        jbtn_comad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtn_comad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, 60));

        jbtn_doc.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_doc.setFont(new java.awt.Font("Telugu MN", 1, 18)); // NOI18N
        jbtn_doc.setText("Doctor");
        jbtn_doc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtn_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 110, 60));

        jbtn_pat.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_pat.setFont(new java.awt.Font("Telugu MN", 1, 18)); // NOI18N
        jbtn_pat.setText("Patient");
        jbtn_pat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtn_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, 60));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("October Devanagari", 1, 18)); // NOI18N
        jButton1.setText("Hospital Admin");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 170, 60));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital_UserInterface/Hospital Mnagement.jpg"))); // NOI18N
        lblBack.setText("jLabel1");
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_sysadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_sysadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbtn_sysadActionPerformed

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_comad;
    private javax.swing.JButton jbtn_doc;
    private javax.swing.JButton jbtn_pat;
    private javax.swing.JButton jbtn_sysad;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lbl_login;
    // End of variables declaration//GEN-END:variables
}