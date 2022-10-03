/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author adityaillur
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory history;
    private String imageFilePath;
    
    public CreateJPanel(EmployeeHistory history) {
        initComponents();
        this.history=history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblage = new javax.swing.JLabel();
        lblstDt = new javax.swing.JLabel();
        lblteamInfo = new javax.swing.JLabel();
        lblposTitl = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtempID = new javax.swing.JTextField();
        lbllvl = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtlvl = new javax.swing.JTextField();
        txtstDt = new javax.swing.JTextField();
        txtteamInfo = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtposTitl = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblempID = new javax.swing.JLabel();
        lblgen = new javax.swing.JLabel();
        txtgen = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();
        btnPic = new javax.swing.JButton();
        lblimg = new javax.swing.JLabel();
        txtimg = new javax.swing.JTextField();

        lblage.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblage.setText("Age");

        lblstDt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblstDt.setText("Start Date");

        lblteamInfo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblteamInfo.setText("Team Information");

        lblposTitl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblposTitl.setText("Position Title");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblemail.setText("Email ID");

        lbllvl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbllvl.setText("Level");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblempID.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblempID.setText("Employee ID");

        lblgen.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblgen.setText("Gender");

        txtgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPic.setText("Upload Photo");
        btnPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPicActionPerformed(evt);
            }
        });

        lblimg.setText("Image Path");

        txtimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblempID)
                                    .addComponent(lblage)
                                    .addComponent(lblstDt)
                                    .addComponent(lblgen)
                                    .addComponent(lblName))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(txtgen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtempID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstDt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllvl)
                                    .addComponent(lblteamInfo)
                                    .addComponent(lblposTitl)
                                    .addComponent(lblemail)
                                    .addComponent(lblimg))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtposTitl, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtteamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtlvl)
                                        .addComponent(txtimg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnPic))
                            .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtempID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblempID))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblgen)))
                    .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblage)
                    .addComponent(btnPic))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstDt))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllvl))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtteamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblteamInfo))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtposTitl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblposTitl))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimg))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtemail, txtlvl, txtposTitl, txtstDt, txtteamInfo});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        String empID = txtempID.getText();
        String age = txtage.getText();
        String stDt = txtstDt.getText();
        String lvl = txtlvl.getText();
        String teamInfo = txtteamInfo.getText();
        String posTitl = txtposTitl.getText();
        String email = txtemail.getText();
        String gen = txtgen.getText();
        String pic = txtimg.getText();
        
        if(!Pattern.compile("[a-zA-Z ]+").matcher(name).matches()){
            JOptionPane.showMessageDialog(this, "Please enter valid name");
            return;
//            ([a-z].[0-9])|([0-9].[a-z])
//           
        }
        
        if(!Pattern.compile("[a-zA-Z ]+").matcher(lvl).matches()){
            JOptionPane.showMessageDialog(this, "Please enter valid Level");
            return;
        
            
        }if(!Pattern.compile("[0-9]*$").matcher(age).matches()){
            JOptionPane.showMessageDialog(this, "Please enter valid Age");
            return;
        }if(!Pattern.compile("[0-9]*$").matcher(stDt).matches()){
            JOptionPane.showMessageDialog(this, "please enter valid start date");
            return;
        
        }if(!Pattern.compile("[a-zA-Z ]+").matcher(posTitl).matches()){
            JOptionPane.showMessageDialog(this, "please enter valid Position Title");
            return;
        //}if(!Pattern.compile("[0-9]*$").matcher(mobileNo).matches()){
           // JOptionPane.showMessageDialog(this, "6");
            //return;
        }if(!Pattern.compile("^(.+)@(.+)$").matcher(email).matches()){
            JOptionPane.showMessageDialog(this, "please enter valid Email");
            return;
        }
        
        Employee eh = history.addNewEmployee();
        
        eh.setName(name);
        eh.setempID(empID);
        eh.setage(age);
        eh.setstDt(stDt);
        eh.setlvl(lvl);
        eh.setteamInfo(teamInfo);
        eh.setposTitl(posTitl);
        eh.setemail(email);
        eh.setgen(gen);
        eh.setPic(pic);
       
        JOptionPane.showMessageDialog(this, "New Employee added.");
        
        txtName.setText("");
        txtempID.setText("");
        txtage.setText("");
        txtstDt.setText("");
        txtlvl.setText("");
        txtteamInfo.setText("");
        txtposTitl.setText("");
        txtemail.setText("");
        txtgen.setText("");
        txtimg.setText("");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPicActionPerformed
        JFileChooser choose = new JFileChooser ();
        choose.showOpenDialog(null);
        File f = choose.getSelectedFile ();
        System.out.println(f.getAbsolutePath());        
        ImageIcon image = new ImageIcon(f.getAbsolutePath());
        image = new ImageIcon(image.getImage() . getScaledInstance (120, 120, Image.SCALE_SMOOTH)) ;
        lblPic.setIcon(image);
        this.imageFilePath = f.getAbsolutePath();
        
        txtimg.setText(f.getAbsolutePath());
    }//GEN-LAST:event_btnPicActionPerformed

    private void txtimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimgActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
    String regexString = "";
    Pattern pattern = Pattern.compile(regexString);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      
    } else {
        
      System.out.println("Match not found");
    }
    }//GEN-LAST:event_txtNameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPic;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblempID;
    private javax.swing.JLabel lblgen;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lbllvl;
    private javax.swing.JLabel lblposTitl;
    private javax.swing.JLabel lblstDt;
    private javax.swing.JLabel lblteamInfo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempID;
    private javax.swing.JTextField txtgen;
    private javax.swing.JTextField txtimg;
    private javax.swing.JTextField txtlvl;
    private javax.swing.JTextField txtposTitl;
    private javax.swing.JTextField txtstDt;
    private javax.swing.JTextField txtteamInfo;
    // End of variables declaration//GEN-END:variables
}
