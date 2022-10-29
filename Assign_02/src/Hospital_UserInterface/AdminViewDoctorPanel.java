/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Hospital_UserInterface;

import javax.swing.table.DefaultTableModel;
import HospitalMngmt.Doctor;
import HospitalMngmt.Hospital;
import HospitalMngmt.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author adityaillur
 */
public class AdminViewDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewDoctorPanel
     */
    
    private TableRowSorter<TableModel> sorter; 
    
    public AdminViewDoctorPanel() {
        initComponents();
        fillTable();
        sorter = new TableRowSorter<>(tblViewDoc.getModel());
        tblViewDoc.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHospital = new javax.swing.JTextField();
        btnName = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblgen = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtSpecialisation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewDoc = new javax.swing.JTable();
        btnGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        lblstDt1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();

        btnName.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        btnName.setText("Name");

        lblHospital.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblHospital.setText("Hospital");

        lblName.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblName.setText("Doctor ID");

        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });
        txtDoctorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDoctorIDKeyReleased(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblgen.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblgen.setText("Specialisation");

        lblTitle.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Doctor Details");

        txtSpecialisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialisationActionPerformed(evt);
            }
        });

        tblViewDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Specialisation", "Hospital", "Username", "Password", "DoctorObject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblViewDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewDocMouseClicked(evt);
            }
        });
        tblViewDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblViewDocKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblViewDoc);

        btnGender.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        btnGender.setText("Gender");

        btnDelete.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblSearch.setText("Search");

        lblstDt1.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblstDt1.setText("Password");

        lblUsername.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblUsername.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addGap(122, 122, 122)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHospital)
                            .addComponent(lblgen)
                            .addComponent(lblstDt1)
                            .addComponent(lblUsername))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospital)
                            .addComponent(txtSpecialisation)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(101, 101, 101)
                        .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnName)
                            .addComponent(btnGender))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospital))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstDt1)
                    .addComponent(btnUpdate))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void txtDoctorIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorIDKeyReleased
//        // TODO add your handling code here:
//        String regexString = "";
//        Pattern pattern = Pattern.compile(regexString);
//        Matcher matcher = pattern.matcher("Visit W3Schools!");
//        boolean matchFound = matcher.find();
//        if(matchFound) {
//
//        } else {
//
//            System.out.println("Match not found");
//        }
    }//GEN-LAST:event_txtDoctorIDKeyReleased

    private void txtSpecialisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialisationActionPerformed

    private void tblViewDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewDocMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblViewDoc.getModel();
        Doctor p = (Doctor)model.getValueAt(tblViewDoc.getSelectedRow(), 7);
        txtDoctorID.setText(String.valueOf(p.docId));
        txtName.setText(p.name);
        txtGender.setText(p.gender);
        txtHospital.setText(p.hospital.getHospitalName());
        txtSpecialisation.setText(p.specialisation);
        txtUsername.setText(p.username);
        txtPassword.setText(p.password);
    }//GEN-LAST:event_tblViewDocMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblViewDoc.getModel();
        Doctor p = (Doctor)model.getValueAt(tblViewDoc.getSelectedRow(), 7);
        if(p!= null){
            SystemAdmin.doctorList.remove(p);
            fillTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblViewDoc.getModel();
        int selectedRowIndex = tblViewDoc.getSelectedRow();
       
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a Row to Update");
            return;
        }
       
        if(tblViewDoc.getSelectedRowCount() == 1){
          Doctor p = (Doctor)model.getValueAt(tblViewDoc.getSelectedRow(), 7);
         
          p.docId=Integer.parseInt( txtDoctorID.getText());
//          p.city=city.getText();
//          p.community= community.getText();
          p.specialisation=txtSpecialisation.getText();
          p.gender=txtGender.getText();
          p.name=txtName.getText();
          p.username=txtUsername.getText();
          p.password=txtPassword.getText();
//          p.hospital = (Hospital)txtHospital.getText();
//          
            //if single row is selected then update
         fillTable();
            JOptionPane.showMessageDialog(this, "Update Successful !!!");
        }
        else{
           
            if(tblViewDoc.getRowCount () == 0){
                //if table is empty
                JOptionPane.showMessageDialog(this, "Table is empty !!!");
            }
            else{
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select single row for update !!!");

            }
        }        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblViewDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblViewDocKeyReleased
        // TODO add your handling code here:
//        String textBoxString = txtSearch.getText();
//        sorter.setRowFilter(RowFilter.regexFilter(textBoxString));
    }//GEN-LAST:event_tblViewDocKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String textBoxString = txtSearch.getText();
        sorter.setRowFilter(RowFilter.regexFilter(textBoxString));
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnGender;
    private javax.swing.JLabel btnName;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblgen;
    private javax.swing.JLabel lblstDt1;
    private javax.swing.JTable tblViewDoc;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpecialisation;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

private void fillTable() {
       DefaultTableModel model = (DefaultTableModel) tblViewDoc.getModel();
       model.setRowCount(0);
       for(Doctor  p : SystemAdmin.doctorList ){
           
           Object[] row = new Object[8];
           row[0]= p.docId;
           row[1]= p.name;
           row[2]= p.gender;
           row[3]= p.specialisation;
           row[4]= p.hospital.getHospitalName();
//           row[5]= p.community;
           row[5]= p.username;
           row[6]= p.password;
           row[7]= p;

           model.addRow(row);
       }}
}
