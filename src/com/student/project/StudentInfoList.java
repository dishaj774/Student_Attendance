/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StudentInfoList.java
 *
 * Created on 12 May, 2016, 9:12:28 AM
 */

package com.student.project;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YASH KUMAR
 */
public class StudentInfoList extends javax.swing.JPanel {
    int tot = 0, cur = 0;
static int ssem=0;
   DefaultTableModel model;


    /** Creates new form StudentInfoList */
    public StudentInfoList() {

        initComponents();
    }
    public StudentInfoList(int sem){

         ssem=sem;


    /** Creates new form EmployePanel */
            s = new StudentBean();
        int num = s.getTotal(sem);
       if (num >= 1) {
            cur = 1;
            tot = num;
         //   s = s.getRecord(1);
            //show(e);
        }


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EnrollNO.", "FirstName", "LastName", "FatherName", "Branch", "Sem", "Mobile", "EmailId", "Address", "TheoryTotal", "TheoryAtteneded", "Theory%", "LabTotal", "LabAttended", "Lab%", "SpecialAttendence", "Final%"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                int i=1;
for(i=1;i<=tot;i++){
 Vector q=new Vector();
s.getRecord(i,ssem);
s.getSid();


q.addElement(s.getsenrollno());
q.addElement(s.getSfirstname());
q.addElement(s.getSlastname());
q.addElement(s.getSfname());
q.addElement(s.getSbranch());
q.addElement(s.getSsem());
q.addElement(s.getSmobile());
q.addElement(s.getSemail());
q.addElement(s.getSaddress());


Vector rows = new Vector();

              rows.addElement(q);
           DefaultTableModel model=(DefaultTableModel) jTable1.getModel();

        model.addRow(q);

// TODO add your handling code here:


        }

    }//GEN-LAST:event_jButton1ActionPerformed

 public static void main(String ar[]){
        JFrame f=new JFrame("student information List");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new StudentInfoList());

        f.setBounds(10, 10, 700, 700);
        f.setVisible(true);
    }
StudentBean s=new StudentBean();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
