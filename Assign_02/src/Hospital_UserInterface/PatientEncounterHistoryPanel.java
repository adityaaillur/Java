/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Hospital_UserInterface;

import HospitalMngmt.Encounter;
import HospitalMngmt.Patient;
import HospitalMngmt.SystemAdmin;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityaillur
 */
public class PatientEncounterHistoryPanel extends javax.swing.JPanel {
    public Patient pa;
    /**
     * Creates new form PatientEncounterHistoryPanel
     */
    
    public PatientEncounterHistoryPanel(Patient pa) {
        initComponents();
        this.pa=pa;
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterHistory = new javax.swing.JTable();

        tblEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "City", "Gender", "Community", "Vitals", "Encounter Obj"
            }
        ));
        jScrollPane1.setViewportView(tblEncounterHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounterHistory;
    // End of variables declaration//GEN-END:variables

private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)tblEncounterHistory.getModel();
       model.setRowCount(0);
       for(Encounter  p : SystemAdmin.encounterList ){
           if(p.patient==this.pa){        
           Object[] row = new Object[7];
           row[0]= p.patient.patientID;
           row[1]= p.patient.name;
           row[2]= p.patient.city;
           row[3]= p.patient.gender;
//           row[4]= p.city;
//           row[5]= p.community;
           row[4]= p.patient.community;
           row[5]= p.vitalSigns;
           row[6]= p;
           
           
           model.addRow(row);
       }}
}

}
