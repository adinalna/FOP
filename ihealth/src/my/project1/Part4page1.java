/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.project1;

/**
 *
 * @author adina
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
public class Part4page1 extends javax.swing.JFrame {

    /**
     * Creates new form Part4GUI
     */
    public Part4page1() {
        initComponents();
    }
    protected String part4IC,part4name,part4age,part4phoneNum,part4date,part4time,part4doctor;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Appointment Checking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Patient IC Number:");

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("+ iHealth +");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Back To Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(164, 164, 164))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String InputIC; 
        InputIC = jTextField1.getText();
        boolean FoundPatient=false,FoundAppointment=false;
        
        try {
            //Scan through PatientInfo.txt file to find out the number of patients
            Scanner CountPatientInput = new Scanner(new FileInputStream("C:\\Users\\adina\\Dropbox\\Maven Project Data\\PatientInfo.txt"));
            int patientnum=0;
            while (CountPatientInput.hasNextLine()){
                 CountPatientInput.nextLine();
                 patientnum++;
            }
            CountPatientInput.close();
            
            //Scan through PatientInfo.txt file to put patients in array
            Scanner PatientInput = new Scanner(new FileInputStream("C:\\Users\\adina\\Dropbox\\Maven Project Data\\PatientInfo.txt"));
            String[][]PatientArray = new String [patientnum][];
            
            for (int i = 0; i < patientnum; i++){
                PatientArray[i]=PatientInput.nextLine().split(",");  
            }
            //Find the patient infomation from PatientArray
            for (int j = 0; j < patientnum; j++){
                if( PatientArray[j][0].equals(InputIC)){
                    FoundPatient=true;
                    part4IC=PatientArray[j][0];
                    part4name=PatientArray[j][1];
                    part4age=PatientArray[j][2];
                    part4phoneNum=PatientArray[j][3];
                    
                } 
            }
            if(FoundPatient==false){
                JOptionPane.showMessageDialog(null,"No patient information found");
            }
            
            PatientInput.close();
            
            
            //Scan through Appointment.txt file to find out the number of appointments
            if(FoundPatient==true){
                Scanner CountAppointmentInput = new Scanner(new FileInputStream("C:\\Users\\adina\\Dropbox\\Maven Project Data\\Appointment.txt"));
                int appointmentnum=0;
                while (CountAppointmentInput.hasNextLine()){
                    CountAppointmentInput.nextLine();
                    appointmentnum++;
                }
                CountPatientInput.close();
            
            //Scan through Appointment.txt file to put appointments in an array
                Scanner AppointmentInput = new Scanner(new FileInputStream("C:\\Users\\adina\\Dropbox\\Maven Project Data\\Appointment.txt"));
                String[][]AppointmentArray = new String [appointmentnum][];
                for (int i = 0; i < appointmentnum; i++){
                    AppointmentArray[i]=AppointmentInput.nextLine().split(",");  
                }
            //Find the appointment from AppointmentArray
                for (int j = 0; j < appointmentnum; j++){
                    if( AppointmentArray[j][0].equals(InputIC)){
                        FoundAppointment=true;
                        part4date=AppointmentArray[j][1];
                        part4time=AppointmentArray[j][2];
                        part4doctor=AppointmentArray[j][3];
                    }
                }
                    
            }
            
            } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
            }    
            
            //Display if there is appointment for patient
            if(FoundPatient==true&&FoundAppointment==true){
                this.dispose();
                Part4page2 p4pg2 = new Part4page2();  
                p4pg2.setVisible(true);
                p4pg2.p4pg2name.setText("Name : "+part4name);
                p4pg2.p4pg2ic.setText("IC Number : "+part4IC);
                p4pg2.p4pg2age.setText("Age : "+part4age);
                p4pg2.p4pg2phoneNum.setText("Phone Number : "+part4phoneNum);
                p4pg2.p4pg2date.setText("Date : "+part4date);
                p4pg2.p4pg2time.setText("Time : "+part4time);
                p4pg2.p4pg2doctor.setText("Doctor : "+part4doctor);
            }
            else if(FoundPatient==true&&FoundAppointment==false){
                this.dispose();
                Part4page3 p4pg3 = new Part4page3();
                p4pg3.setVisible(true);
                p4pg3.p4pg3name.setText("Name : "+part4name);
                p4pg3.p4pg3ic.setText("IC Number : "+part4IC);
                p4pg3.p4pg3age.setText("Age : "+part4age);
                p4pg3.p4pg3phoneNum.setText("Phone Number : "+part4phoneNum);
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frame4 frame4 = new Frame4();
        frame4.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Part4page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Part4page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Part4page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Part4page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Part4page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}