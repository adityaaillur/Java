/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Hospital_UserInterface;

import HospitalMngmt.City;
import HospitalMngmt.Community;
import HospitalMngmt.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityaillur
 */
public class CommunityAddCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientSearchNearbyHospital
     */
    public CommunityAddCommunityPanel() {
        initComponents();
        fillTable();
        fillTable1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddCommunity = new javax.swing.JButton();
        txtCommunityName = new javax.swing.JTextField();
        lblCommunityName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCity = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCommunity = new javax.swing.JTable();

        btnAddCommunity.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        btnAddCommunity.setText("Add Community");
        btnAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityActionPerformed(evt);
            }
        });

        lblCommunityName.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblCommunityName.setText("Community Name");

        lblTitle.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Community");

        tblCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "City"
            }
        ));
        jScrollPane1.setViewportView(tblCity);

        tblCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community Name", "Community"
            }
        ));
        jScrollPane2.setViewportView(tblCommunity);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunityName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(btnAddCommunity))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunityName)
                    .addComponent(btnAddCommunity))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityActionPerformed
        // TODO add your handling code here:
        if(tblCity.getSelectedRow()>-1) {
         City c = (City)tblCity.getValueAt(tblCity.getSelectedRow(),1);
         Community b = new Community(txtCommunityName.getText(),c);
         SystemAdmin.communityList.add(b);
         fillTable1();
        }
        else{
             JOptionPane.showMessageDialog(null, "Please Select City");
        }
    }//GEN-LAST:event_btnAddCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommunity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCity;
    private javax.swing.JTable tblCommunity;
    private javax.swing.JTextField txtCommunityName;
    // End of variables declaration//GEN-END:variables
private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)tblCity.getModel();
       model.setRowCount(0);
       for(City  p : SystemAdmin.cityList ){
           
           Object[] row = new Object[2];
           row[0]= p.getName();
           row[1]= p;
           
           
           
           model.addRow(row);
       }}

private void fillTable1() {
       DefaultTableModel model = (DefaultTableModel)tblCommunity.getModel();
       model.setRowCount(0);
       for(Community  p : SystemAdmin.communityList ){
           
           Object[] row = new Object[2];
           row[0]= p.getName();
           row[1]= p;
 
           model.addRow(row);
       }}

} 

