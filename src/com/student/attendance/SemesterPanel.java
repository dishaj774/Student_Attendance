/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.attendance;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author abc
 */
public class SemesterPanel extends javax.swing.JPanel {

    /**
     * Creates new form SemesterPanel
     */
    public SemesterPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Select Semester");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 220, 30));

        jB1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB1.setForeground(new java.awt.Color(0, 153, 153));
        jB1.setText("I");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        add(jB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 75, 35));

        jB2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB2.setForeground(new java.awt.Color(0, 153, 153));
        jB2.setText("II");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        add(jB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 75, 35));

        jB3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB3.setForeground(new java.awt.Color(0, 153, 153));
        jB3.setText("III");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        add(jB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 75, 35));

        jB4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB4.setForeground(new java.awt.Color(0, 153, 153));
        jB4.setText("IV");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        add(jB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 75, 35));

        jB6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB6.setForeground(new java.awt.Color(0, 153, 153));
        jB6.setText("VI");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        add(jB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 75, 35));

        jB7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB7.setForeground(new java.awt.Color(0, 153, 153));
        jB7.setText("VII");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        add(jB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 75, 35));

        jB8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB8.setForeground(new java.awt.Color(0, 153, 153));
        jB8.setText("VIII");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        add(jB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, 75, 35));

        jB5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB5.setForeground(new java.awt.Color(0, 153, 153));
        jB5.setText("V");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        add(jB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 75, 35));
        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 1230, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
         JInternalFrame internalFrame = new JInternalFrame("Semester:1 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(1));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(1));
      // TODO add your handling code here:
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        JInternalFrame internalFrame = new JInternalFrame("Semester:2 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5,1200, 700);
        internalFrame.setContentPane(new TotalStudentData(2));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(2));
// TODO add your handling code here:
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        JInternalFrame internalFrame = new JInternalFrame("Semester:3 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(3));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(3)); 
    // TODO add your handling code here:
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
         JInternalFrame internalFrame = new JInternalFrame("Semester:4 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(4));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(4));
       // TODO add your handling code here:
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        JInternalFrame internalFrame = new JInternalFrame("Semester:5 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(5));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(5));
        // TODO add your handling code here:
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        JInternalFrame internalFrame = new JInternalFrame("Semester:6 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(6));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(6));
        // TODO add your handling code here:
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        JInternalFrame internalFrame = new JInternalFrame("Semester:7 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(7));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(7));
        // TODO add your handling code here:
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        JInternalFrame internalFrame = new JInternalFrame("Semester:8 Students List", true, true, true, true);
        internalFrame.setBounds(5, 5, 1200, 700);
        internalFrame.setContentPane(new TotalStudentData(8));
        internalFrame.setVisible(true);
        jDesktopPane1.add(internalFrame, new Integer(8));
        // TODO add your handling code here:
    }//GEN-LAST:event_jB8ActionPerformed

     public static void main(String[] args) {
        JFrame fr = new JFrame("Check Attendance");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setContentPane(new SemesterPanel());
        fr.setBounds(20, 10, 1350,650);
        fr.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
