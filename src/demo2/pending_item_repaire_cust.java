/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Happy
 */
public class pending_item_repaire_cust extends javax.swing.JFrame {

    /**
     * Creates new form pending_item
     */
    public pending_item_repaire_cust() {
        
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents();
//        new JScrollPane(jTable1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         Toolkit tk = Toolkit.getDefaultToolkit();
        
            int xsize = (int)tk.getScreenSize().getWidth();
            int ysize = (int)tk.getScreenSize().getHeight();
            this.setSize(xsize,ysize);
           
        try {
               
                    Class.forName("com.mysql.jdbc.Driver");
                     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/list_info?zeroDateTimeBehavior=convertToNull","root","");     
                    st = conn.createStatement();
                  //  JOptionPane.showMessageDialog(null,"Connected");
    // MySQL database connection
                } 
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Not Connected");
                }
                 try
                 {
                     String sql1="select * from customer WHERE (Out_Date is NULL and Remark='pending') or (Argent='Y' and Out_Date is NULL and Remark='pending')";
                     JOptionPane.showMessageDialog(null,sql1);
                     ResultSet rs=st.executeQuery(sql1);
                                          //JOptionPane.showMessageDialog(null,"++");

                     Vector data = new Vector();
                     DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                     jTable2 = new JTable(model);
                     while(rs.next())
                      {
                            int d1=Integer.parseInt(rs.getString("Serial_No"));
                            int d=Integer.parseInt(rs.getString("cust_Id"));
                            String s1=rs.getString("In_Date");
                            String s3=rs.getString("Cust_Name");
                            String s5=rs.getString("Device");
                            String s7=rs.getString("Model");
                            String s9=rs.getString("Status");
                            String s10=rs.getString("Argent");
                            model.addRow(new Object[]{d1,d,s3,s1,s5,s7,s9,s10});
                             //cnt++;
                      }
         
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Error in selecting query or inserting into table");
                }
       
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
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jokButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial_Id", "Cust_Id", "Cust_Name", "In_Date", "Device", "Model", "status", "Priority"
            }
        ));
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(1).setMinWidth(85);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(85);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(85);
            jTable2.getColumnModel().getColumn(2).setMinWidth(200);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable2.getColumnModel().getColumn(3).setMinWidth(120);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(120);
            jTable2.getColumnModel().getColumn(4).setMinWidth(130);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(130);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(130);
            jTable2.getColumnModel().getColumn(5).setMinWidth(150);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(150);
            jTable2.getColumnModel().getColumn(6).setMinWidth(500);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(500);
            jTable2.getColumnModel().getColumn(6).setMaxWidth(500);
            jTable2.getColumnModel().getColumn(7).setMinWidth(50);
            jTable2.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(7).setMaxWidth(50);
        }

        jokButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jokButton1.setText(" OK");
        jokButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokButton1ActionPerformed(evt);
            }
        });
        jokButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jokButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jokButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jokButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 921, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jokButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokButton1ActionPerformed
        try
        {
        this.setVisible(false);
        new page_one().setVisible(true);
        }
        catch(Exception e){}        // TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_jokButton1ActionPerformed

    private void jokButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jokButton1KeyPressed

         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
            {
            this.setVisible(false);
            new page_one().setVisible(true);
            }
            catch(Exception e){} 
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jokButton1KeyPressed

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
            java.util.logging.Logger.getLogger(pending_item_repaire_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pending_item_repaire_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pending_item_repaire_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pending_item_repaire_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pending_item_repaire_cust().setVisible(true);
            }
        });
    }
Statement st;
Connection conn ;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jokButton1;
    // End of variables declaration//GEN-END:variables
}
