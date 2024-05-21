package com.example;

//package com.project1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 import javax.swing.JOptionPane;

 /**
  *
  * @author vivek
  */
 public class AdminHomePage extends javax.swing.JFrame {
 
     /**
      * Creates new form admindashboard
      */
     public AdminHomePage() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        // this.setLocation(500, 300);
     }
 
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {
 
         admin_dashboard_label = new javax.swing.JLabel();
         jPanel1 = new javax.swing.JPanel();
         Add_Policy_Button = new javax.swing.JButton();
         View_Claims_Button = new javax.swing.JButton();
         adminprofile_pic_label = new javax.swing.JLabel();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
         admin_dashboard_label.setFont(new java.awt.Font("Optima", 1, 40)); // NOI18N
         admin_dashboard_label.setForeground(new java.awt.Color(192, 47, 82));
         admin_dashboard_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         admin_dashboard_label.setText("ADMIN Dashboard");
 
         Add_Policy_Button.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
         Add_Policy_Button.setText("Add Policy");
         Add_Policy_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         Add_Policy_Button.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 Add_Policy_ButtonActionPerformed(evt);
             }
         });
 
         View_Claims_Button.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
         View_Claims_Button.setText("View Claims");
         View_Claims_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         View_Claims_Button.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 View_Claims_ButtonActionPerformed(evt);
             }
         });
 
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(39, 39, 39)
                 .addComponent(Add_Policy_Button)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                 .addComponent(View_Claims_Button)
                 .addGap(86, 86, 86))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(53, 53, 53)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(Add_Policy_Button)
                     .addComponent(View_Claims_Button))
                 .addContainerGap(187, Short.MAX_VALUE))
         );
 
         adminprofile_pic_label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
         adminprofile_pic_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profileuser.png"))); // NOI18N
         adminprofile_pic_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         adminprofile_pic_label.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 adminprofile_pic_labelMouseClicked(evt);
             }
         });
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(admin_dashboard_label, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(146, 146, 146)
                 .addComponent(adminprofile_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(28, 28, 28))
             .addGroup(layout.createSequentialGroup()
                 .addGap(45, 45, 45)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(54, Short.MAX_VALUE))
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                         .addGap(16, 16, 16)
                         .addComponent(admin_dashboard_label, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                         .addGap(28, 28, 28)
                         .addComponent(adminprofile_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addGap(18, 18, 18)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(67, Short.MAX_VALUE))
         );
 
         pack();
     }// </editor-fold>                        
 
     private void Add_Policy_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        this.setVisible(false);
        new AdminAddPolicy().setVisible(true);
     }                                                 
 
     private void View_Claims_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new AdminViewClaims().setVisible(true);                                                   
     }                                                  
 
     private void adminprofile_pic_labelMouseClicked(java.awt.event.MouseEvent evt) {                                 
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            new Main().setVisible(true);
            this.setVisible(false);
     }
     }                                                   
 
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
             java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
 
         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new AdminHomePage().setVisible(true);
             }
         });
     }
 
     // Variables declaration - do not modify                     
     private javax.swing.JButton Add_Policy_Button;
     private javax.swing.JButton View_Claims_Button;
     private javax.swing.JLabel admin_dashboard_label;
     private javax.swing.JLabel adminprofile_pic_label;
     private javax.swing.JPanel jPanel1;
     // End of variables declaration                   
 }
