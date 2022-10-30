/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Hospital_UserInterface;

import HospitalMngmt.City;
import HospitalMngmt.Community;
import HospitalMngmt.Hospital;
import HospitalMngmt.House;
import HospitalMngmt.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityaillur
 */
public class CommunityAddHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientSearchNearbyHospital
     */
    public CommunityAddHousePanel() {
        initComponents();
        fillTable();
        fillTable2();
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
        txtHouseNumber = new javax.swing.JTextField();
        lblHouseNumber = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCity = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCommunity = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHouse = new javax.swing.JTable();

        btnAddCommunity.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        btnAddCommunity.setText("Add Community");
        btnAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityActionPerformed(evt);
            }
        });

        txtHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseNumberActionPerformed(evt);
            }
        });

        lblHouseNumber.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblHouseNumber.setText("House Number");

        lblTitle.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add House");

        tblCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "City obj"
            }
        ));
        tblCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCity);

        tblCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community Name", "City", "Community obj"
            }
        ));
        jScrollPane2.setViewportView(tblCommunity);

        tblHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "House Name", "Community Name", "House obj"
            }
        ));
        jScrollPane3.setViewportView(tblHouse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHouseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddCommunity)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseNumber))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAddCommunity)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityActionPerformed
        // TODO add your handling code here:
        if(tblCommunity.getSelectedRow()>-1) {
          City c = (City)tblCommunity.getValueAt(tblCommunity.getSelectedRow(),1);
          Community b = (Community)tblCommunity.getValueAt(tblCommunity.getSelectedRow(),2);
         House a= new House(Integer.parseInt((txtHouseNumber.getText())),b);
         SystemAdmin.houseList.add(a);
         fillTable2();
        }
        else{
             JOptionPane.showMessageDialog(null, "Please Select City");
        }
    }//GEN-LAST:event_btnAddCommunityActionPerformed

    private void tblCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCityMouseClicked
        // TODO add your handling code here:
        if(tblCity.getSelectedRow()>-1){
            City c = (City)tblCommunity.getValueAt(tblCommunity.getSelectedRow(), 1);
            fillTable1(c);
        }
    }//GEN-LAST:event_tblCityMouseClicked

    private void txtHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommunity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCity;
    private javax.swing.JTable tblCommunity;
    private javax.swing.JTable tblHouse;
    private javax.swing.JTextField txtHouseNumber;
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

private void fillTable1(City c) {
       DefaultTableModel model = (DefaultTableModel)tblCommunity.getModel();
       model.setRowCount(0);
       for(Community  p : SystemAdmin.communityList ){
           if(p.getCity()==c){
            Object[] row = new Object[2];
            row[0]= p.getName();
            row[1]= p;




            model.addRow(row);
           }
       }}

private void fillTable2() {
       DefaultTableModel model = (DefaultTableModel)tblHouse.getModel();
       model.setRowCount(0);
       for(House  p : SystemAdmin.houseList ){
           
           Object[] row = new Object[2];
           row[0]= p.getHouseNumber();
           row[1]= p;
           
           
           
           model.addRow(row);
       }}
}