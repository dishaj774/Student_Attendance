/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.attendance;

import javax.swing.JFrame;

/**
 *
 * @author abc
 */
public class AttendancePanel extends javax.swing.JPanel {
    static double ttotal=0,tattended=0,tpercentage=0,ptotal=0,pattended=0,ppercentage=0,aspecial=0,afinal=0;
    /**
     * Creates new form StudentUpdatePanel
     */
    public AttendancePanel() {
        initComponents();
        StudentBean s=new StudentBean();
        jBAdd.setEnabled(false);
//jtf1.setEditable(false);
jFirstN.setEditable(false);
jLastN.setEditable(false);
jFatherN.setEditable(false);
jMob.setEditable(false);
jId.setEditable(false);
jAdd.setEditable(false);
jCBranch.setEnabled(false);
jCSem.setEnabled(false);
jAdd.setEditable(false);
jEnroll.setEditable(false);
        jTPer.setEditable(false);
        jPPer.setEditable(false);
       jFinal.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jEnrollS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAdd = new javax.swing.JTextArea();
        jEnroll = new javax.swing.JTextField();
        jFirstN = new javax.swing.JTextField();
        jFatherN = new javax.swing.JTextField();
        jMob = new javax.swing.JTextField();
        jLastN = new javax.swing.JTextField();
        jId = new javax.swing.JTextField();
        jBSearch = new javax.swing.JButton();
        jCBranch = new javax.swing.JComboBox<>();
        jCSem = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTTotal = new javax.swing.JTextField();
        jTAttend = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTPer = new javax.swing.JTextField();
        jSpecial = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPTotal = new javax.swing.JTextField();
        jPAttend = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPPer = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jFinal = new javax.swing.JTextField();
        jSave = new javax.swing.JButton();
        jBAdd = new javax.swing.JButton();
        jRefresh = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Attendance Update Form");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 310, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enrollment No");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, 30));

        jEnrollS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jEnrollS, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enrollment No.");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("First Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Father Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mobile No.");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Branch");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Last Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Semester");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Email-ID");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Address");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 90, 30));

        jAdd.setColumns(20);
        jAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jAdd.setRows(5);
        jScrollPane1.setViewportView(jAdd);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 210, 60));

        jEnroll.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jEnroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 110, 200, 30));

        jFirstN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jFirstN, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 150, 200, 30));

        jFatherN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jFatherN, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 190, 200, 30));

        jMob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 230, 200, 30));

        jLastN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jLastN, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 200, 30));

        jId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 200, 30));

        jBSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBSearch.setForeground(new java.awt.Color(0, 153, 153));
        jBSearch.setText("Search");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));

        jCBranch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "CSE", "EC", "ME", "EX", "CE", "EE", "IP" }));
        jCBranch.setName(""); // NOI18N
        add(jCBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 65, 30));

        jCSem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        add(jCSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 50, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 102));
        jLabel12.setText("Theory Attendance");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 200, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 102));
        jLabel13.setText("Practical Attendance");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 1220, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Total Classes");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Total Attended");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, 30));

        jTTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jTTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 60, 30));

        jTAttend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jTAttend, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 60, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("% of Theory Attendance");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Special Attendance");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 160, 30));

        jTPer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jTPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 60, 30));

        jSpecial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jSpecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 60, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 0, 160));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, -1, 70));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Total Lab");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Total Attended");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 140, 30));

        jPTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jPTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 60, 30));

        jPAttend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jPAttend, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 60, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("% of Lab Attendance");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 210, 30));

        jPPer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jPPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 420, 60, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 0));
        jLabel21.setText("Final Attendance");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 160, 30));

        jFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFinal.setForeground(new java.awt.Color(0, 102, 0));
        add(jFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 470, 60, 30));

        jSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSave.setForeground(new java.awt.Color(0, 153, 153));
        jSave.setText("Save");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });
        add(jSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, 35));

        jBAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAdd.setForeground(new java.awt.Color(0, 153, 153));
        jBAdd.setText("Add");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });
        add(jBAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, 35));

        jRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRefresh.setForeground(new java.awt.Color(0, 153, 153));
        jRefresh.setText("Refresh");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });
        add(jRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 100, 35));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 280, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
         String enroll=jEnrollS.getText();
        StudentBean s=new StudentBean();
        AttendanceBean1 ab=new AttendanceBean1();
        s.getRecord(enroll);
        ab.getRecord(enroll);
      //  AttendanceInsertionform1 af1=new AttendanceInsertionform1();
        //af1.setVisible(true);

         jEnroll.setText(s.getsenrollno());
        jFirstN.setText(s.getSfirstname());
        jLastN.setText(s.getSlastname());
        jFatherN.setText(s.getSfname());
        jMob.setText(s.getSmobile());
        jId.setText(s.getSemail());
        jAdd.setText(s.getSaddress());
        jCBranch.setSelectedItem(s.getSbranch());
       String sem=Integer.toString(s.getSsem());
        jCSem.setSelectedItem(sem);
        System.out.println(ab.getAttotal());
         String attotal=Integer.toString(ab.getAttotal());
        jTTotal.setText(attotal);
        jTAttend.setText(Integer.toString(ab.getAtattended()));
        jTPer.setText(Double.toString(ab.getAtpercentage()));
        jPTotal.setText(Integer.toString(ab.getAptotal()));
        jPAttend.setText(Integer.toString(ab.getApattended()));
        jPPer.setText(Double.toString(ab.getAppercentage()));
        jSpecial.setText(Integer.toString(ab.getAspecial()));
        jFinal.setText(Double.toString(ab.getAfinal()));
                jRefresh.setEnabled(true);

    }//GEN-LAST:event_jBSearchActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
    ttotal=Double.parseDouble(jTTotal.getText());
        tattended=Double.parseDouble(jTAttend.getText());

        tpercentage=(tattended/ttotal)*100;
       // System.out.print(tpercentage);
        ptotal=Double.parseDouble(jPTotal.getText());
        pattended=Double.parseDouble(jPAttend.getText());
        ppercentage=(pattended/ptotal)*100;
        aspecial=Double.parseDouble(jSpecial.getText());
        afinal=((tattended+aspecial)/ttotal)*100;

        jTPer.setText(Double.toString(tpercentage));
        jPPer.setText(Double.toString(ppercentage));
        jFinal.setText(Double.toString(afinal));
        jSave.setEnabled(false);
        jBAdd.setEnabled(true);
        jRefresh.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jSaveActionPerformed

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        s.setsenrollno(jEnroll.getText());
        s.setSfirstname(jFirstN.getText());
        s.setSlastname(jLastN.getText());
        s.setSfname(jFatherN.getText());
        s.setSbranch(jCBranch.getSelectedItem().toString());

        s.setSsem(Integer.parseInt(jCSem.getSelectedItem().toString()));
        s.setSmobile(jMob.getText());
        s.setSemail(jId.getText());
        s.setSaddress(jAdd.getText());

ab.setSenrollno(jEnroll.getText());
ab.setAttotal(Integer.parseInt(jTTotal.getText()));
ab.setAtattended(Integer.parseInt(jTAttend.getText()));
ab.setAtpercentage(Double.parseDouble(jTPer.getText()));
ab.setAptotal(Integer.parseInt(jPTotal.getText()));
ab.setApattended(Integer.parseInt(jPAttend.getText()));

ab.setAppercentage(Double.parseDouble(jPPer.getText()));
ab.setAspecial(Integer.parseInt(jSpecial.getText()));
ab.setAfinal(Double.parseDouble(jFinal.getText()));
boolean b=ab.update();
boolean b1=s.update();
if(b&&b1){
    jLabel22.setText("Data Insertion Successfully!");
    jBAdd.setEnabled(false);
}
 else {
    jLabel22.setText("Data Insertion Failure!");
}        // TODO add your handling code here:
    }//GEN-LAST:event_jBAddActionPerformed

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshActionPerformed
     jEnroll.setText("");
           jEnrollS.setText("");
        jFirstN.setText("");
        jLastN.setText("");
        jFatherN.setText("");
        jMob.setText("");
        jId.setText("");
        jAdd.setText("");
           jTTotal.setText("");
        jTAttend.setText("");
        jTPer.setText("");
        jSpecial.setText("");
        jPTotal.setText("");
        jPAttend.setText("");
        jPPer.setText("");
        jFinal.setText("");
        jLabel22.setText("");
jSave.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jRefreshActionPerformed


     public static void main(String[] args) {
        JFrame fr = new JFrame("Attendance Update");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setContentPane(new AttendancePanel());
        fr.setBounds(20,00, 1350,650);
        fr.setVisible(true);
    }
        AttendanceBean1 ab=new AttendanceBean1();
 StudentBean s=new StudentBean();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAdd;
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBSearch;
    private javax.swing.JComboBox<String> jCBranch;
    private javax.swing.JComboBox<String> jCSem;
    private javax.swing.JTextField jEnroll;
    private javax.swing.JTextField jEnrollS;
    private javax.swing.JTextField jFatherN;
    private javax.swing.JTextField jFinal;
    private javax.swing.JTextField jFirstN;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLastN;
    private javax.swing.JTextField jMob;
    private javax.swing.JTextField jPAttend;
    private javax.swing.JTextField jPPer;
    private javax.swing.JTextField jPTotal;
    private javax.swing.JButton jRefresh;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jSpecial;
    private javax.swing.JTextField jTAttend;
    private javax.swing.JTextField jTPer;
    private javax.swing.JTextField jTTotal;
    // End of variables declaration//GEN-END:variables
}
