/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Hospital_UserInterface;

import HospitalMngmt.City;
import HospitalMngmt.Doctor;
import HospitalMngmt.SystemAdmin;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import HospitalMngmt.Hospital;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityaillur
 */
public class AdminAddDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminAddDoctorPanel
     */
    public AdminAddDoctorPanel() {
        initComponents();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDocID = new javax.swing.JLabel();
        txtDocID = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblSpecialisation = new javax.swing.JLabel();
        txtSpecialisation = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        lblTitle.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Doctor Details");

        lblName.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblName.setText("Name");

        lblDocID.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblDocID.setText("Doctor ID");

        txtDocID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIDActionPerformed(evt);
            }
        });
        txtDocID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocIDKeyReleased(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblGender.setText("Gender");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblSpecialisation.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblSpecialisation.setText("Specialisation");

        txtSpecialisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialisationActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblPassword.setText("Password");

        btnSave.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblUsername.setText("Username");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital Name", "Hospital obj"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(135, 135, 135)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDocID)
                        .addGap(101, 101, 101)
                        .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(lblPassword)
                            .addComponent(lblSpecialisation)
                            .addComponent(lblUsername))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSpecialisation, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(903, 903, 903))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDocID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSpecialisation))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(33, 33, 33)
                        .addComponent(btnSave))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIDActionPerformed

    private void txtDocIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIDKeyReleased

    private void txtSpecialisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialisationActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    // TODO add your handling code here:
    if(jTable1.getSelectedRow()>-1){
        int id = Integer.parseInt(txtDocID.getText());
//        int age = Integer.parseInt(txtAge.getText());
        String name = txtName.getText();
        Hospital hospital1 = (Hospital)jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        Doctor doctor = new Doctor(id, name, txtSpecialisation.getText(), txtUsername.getText(), (Hospital)jTable1.getValueAt(jTable1.getSelectedRow(), 1), txtPassword.getText(), txtGender.getText());
        SystemAdmin.doctorList.add(doctor);
        JOptionPane.showMessageDialog(null, "New Doctor Successfully Created.");
    }else{
        JOptionPane.showMessageDialog(null, "Select hospital.");
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDocID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSpecialisation;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSpecialisation;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
       for(Hospital  p : SystemAdmin.hospitalList ){
           
           Object[] row = new Object[2];
           row[0]= p.getHospitalName();
           row[1]= p;
           
           
           
           model.addRow(row);
       }}

}
