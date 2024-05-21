package com.example;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vivek
 */

 import java.awt.*;
 import javax.swing.border.Border;
 import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;

import com.mysql.cj.jdbc.exceptions.SQLError;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
 
 
 public class UserHomePage extends javax.swing.JFrame {
 
     /**
      * Creates new form homepage
      */
    private int CustomerID;
    public UserHomePage(int CustomerID) {

        this.CustomerID = CustomerID;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Home Page");
        // checkPersonalDetails(CustomerID);
     }
 
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {
 
         submitButton = new javax.swing.JButton();
         topPanel = new javax.swing.JPanel();
         Companyname_label = new javax.swing.JLabel();
         viewpolicy_label = new javax.swing.JLabel();
         fileclaim_label = new javax.swing.JLabel();
         userprofile_pic_label = new javax.swing.JLabel();
         addvehicle_label = new javax.swing.JLabel();
         jPanel1 = new javax.swing.JPanel();
         price_pic_label = new javax.swing.JLabel();
         affordable_premium_label = new javax.swing.JLabel();
         hassle_free_claims = new javax.swing.JLabel();
         affordable_premium_label1 = new javax.swing.JLabel();
         most_trusted_label = new javax.swing.JLabel();
         trusted_policy_label = new javax.swing.JLabel();
         india_policy_label = new javax.swing.JLabel();
         jPanel2 = new javax.swing.JPanel();
         view_vehicle_label = new javax.swing.JLabel();
         claim_status_label1 = new javax.swing.JLabel();
 
         submitButton.setBackground(new java.awt.Color(0, 0, 0));
         submitButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
         submitButton.setForeground(new java.awt.Color(255, 255, 255));
         submitButton.setText("Submit");
         submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         submitButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 submitButtonActionPerformed(evt);
             }
         });
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setLocation(new java.awt.Point(200, 200));
         setResizable(false);
 
         Companyname_label.setFont(new java.awt.Font("Optima", 1, 48)); // NOI18N
         Companyname_label.setForeground(new java.awt.Color(24, 116, 227));
         Companyname_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
         Companyname_label.setText("BMV Bazaar");
         //Companyname_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
 
         viewpolicy_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
         viewpolicy_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         viewpolicy_label.setText("View Policies");
         viewpolicy_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         viewpolicy_label.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                Border originalBorder = viewpolicy_label.getBorder();
                 Border underlineBorder = BorderFactory.createCompoundBorder(
                         originalBorder,
                         BorderFactory.createMatteBorder(0, 0, 1, 0, newColor) // Underline border
                 );
                 viewpolicy_label.setBorder(underlineBorder);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
                Border originalBorder = viewpolicy_label.getBorder();
                if (originalBorder instanceof CompoundBorder) {
                    viewpolicy_label.setBorder(((CompoundBorder) originalBorder).getOutsideBorder());
                }
             }
             public void mouseClicked(java.awt.event.MouseEvent evt){
                viewpolicy_labelClicked(evt);
             }
         });
 
         fileclaim_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
         fileclaim_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         fileclaim_label.setText("File Claim");
         fileclaim_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         fileclaim_label.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                Border originalBorder = fileclaim_label.getBorder();
                 Border underlineBorder = BorderFactory.createCompoundBorder(
                         originalBorder,
                         BorderFactory.createMatteBorder(0, 0, 1, 0, newColor) // Underline border
                 );
                 fileclaim_label.setBorder(underlineBorder);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
                Border originalBorder = fileclaim_label.getBorder();
                if (originalBorder instanceof CompoundBorder) {
                    fileclaim_label.setBorder(((CompoundBorder) originalBorder).getOutsideBorder());
                }
             }
             public void mouseClicked(java.awt.event.MouseEvent evt){
                new ClaimPolicy().setVisible(true);
             }
         });
 
         userprofile_pic_label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
         userprofile_pic_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profileuser.png"))); // NOI18N
         userprofile_pic_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userprofile_pic_labelMouseClicked(evt);
            }
        });
         addvehicle_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
         addvehicle_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         addvehicle_label.setText("Add Vehicle");
         addvehicle_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         addvehicle_label.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                 addvehicle_labelMouseEntered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
                 addvehicle_labelMouseExited(evt);
             }
             public void mouseClicked(java.awt.event.MouseEvent evt){
                addvehicle_labelMouseClicked(evt);                
             }
         });
 
         javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
         topPanel.setLayout(topPanelLayout);
         topPanelLayout.setHorizontalGroup(
             topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(topPanelLayout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(Companyname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addComponent(fileclaim_label, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(35, 35, 35)
                 .addComponent(viewpolicy_label, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(55, 55, 55)
                 .addComponent(addvehicle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                 .addComponent(userprofile_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(22, 22, 22))
         );
         topPanelLayout.setVerticalGroup(
             topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(topPanelLayout.createSequentialGroup()
                 .addContainerGap()
                 .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(Companyname_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(fileclaim_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(viewpolicy_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(addvehicle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addContainerGap())
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(userprofile_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
         );
 
         price_pic_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         price_pic_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/best-motor-insurer.png"))); // NOI18N
         price_pic_label.setToolTipText("");
 
         affordable_premium_label.setBackground(new java.awt.Color(0, 0, 0));
         affordable_premium_label.setFont(new java.awt.Font("Gill Sans", 3, 18)); // NOI18N
         affordable_premium_label.setForeground(new java.awt.Color(173, 34, 33));
         affordable_premium_label.setText("Smooth Insurance Experience!!");
 
         hassle_free_claims.setFont(new java.awt.Font("Gill Sans", 3, 18)); // NOI18N
         hassle_free_claims.setForeground(new java.awt.Color(173, 34, 33));
         hassle_free_claims.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         hassle_free_claims.setText("Hassle Free Claims!");
 
         affordable_premium_label1.setBackground(new java.awt.Color(0, 0, 0));
         affordable_premium_label1.setFont(new java.awt.Font("Gill Sans", 3, 18)); // NOI18N
         affordable_premium_label1.setForeground(new java.awt.Color(173, 34, 33));
         affordable_premium_label1.setText("Affordable Premiums!");
 
         most_trusted_label.setFont(new java.awt.Font("Baskerville", 3, 36)); // NOI18N
         most_trusted_label.setText("The  Most  Trusted");
 
         trusted_policy_label.setFont(new java.awt.Font("Baskerville", 3, 36)); // NOI18N
         trusted_policy_label.setText("Policy  Brand  in ");
 
         india_policy_label.setFont(new java.awt.Font("Baskerville", 3, 36)); // NOI18N
         india_policy_label.setText("INDIA");
 
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(19, 19, 19)
                 .addComponent(price_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(most_trusted_label)
                     .addComponent(trusted_policy_label)
                     .addComponent(india_policy_label))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addComponent(affordable_premium_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(hassle_free_claims, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGap(16, 16, 16))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                         .addComponent(affordable_premium_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(38, 38, 38))))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(50, 50, 50)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addComponent(affordable_premium_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(hassle_free_claims, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(affordable_premium_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(price_pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(16, 16, 16)
                         .addComponent(most_trusted_label)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(trusted_policy_label)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(india_policy_label)))
                 .addContainerGap(66, Short.MAX_VALUE))
         );
 
         view_vehicle_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
         view_vehicle_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         view_vehicle_label.setText("View Vehicles");
         view_vehicle_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         view_vehicle_label.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                Border originalBorder = view_vehicle_label.getBorder();
                 Border underlineBorder = BorderFactory.createCompoundBorder(
                         originalBorder,
                         BorderFactory.createMatteBorder(0, 0, 1, 0, newColor) // Underline border
                 );
                 view_vehicle_label.setBorder(underlineBorder);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
                Border originalBorder = view_vehicle_label.getBorder();
                if (originalBorder instanceof CompoundBorder) {
                    view_vehicle_label.setBorder(((CompoundBorder) originalBorder).getOutsideBorder());
                }
             }
             public void mouseClicked(java.awt.event.MouseEvent evt){
                    view_vehicle_labelMouseClicked(evt);
             }
         });
 
         claim_status_label1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
         claim_status_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         claim_status_label1.setText("Claim Status");
         claim_status_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         claim_status_label1.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseEntered(java.awt.event.MouseEvent evt) {
                Border originalBorder = claim_status_label1.getBorder();
                 Border underlineBorder = BorderFactory.createCompoundBorder(
                         originalBorder,
                         BorderFactory.createMatteBorder(0, 0, 1, 0, newColor) // Underline border
                 );
                 claim_status_label1.setBorder(underlineBorder);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
                Border originalBorder = claim_status_label1.getBorder();
                if (originalBorder instanceof CompoundBorder) {
                    claim_status_label1.setBorder(((CompoundBorder) originalBorder).getOutsideBorder());
                }
             }
         });
 
         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
         jPanel2.setLayout(jPanel2Layout);
         jPanel2Layout.setHorizontalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(claim_status_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                 .addComponent(view_vehicle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(42, 42, 42))
         );
         jPanel2Layout.setVerticalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addContainerGap()
                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(view_vehicle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(claim_status_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addContainerGap(16, Short.MAX_VALUE))
         );
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
             .addGroup(layout.createSequentialGroup()
                 .addGap(26, 26, 26)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(0, 0, Short.MAX_VALUE))
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(148, 148, 148))
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(14, 14, 14))
         );
 
         pack();
     }// </editor-fold>                        
    
     
     protected void viewpolicy_labelClicked(MouseEvent evt) {
        new vehicleSelectionPolicy(CustomerID).setVisible(true);
        this.setVisible(false);
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
         // TODO add your handling code here:
     }                                            
     Color newColor = new Color(24, 116, 227);
     private void addvehicle_labelMouseEntered(java.awt.event.MouseEvent evt) {                                              
         Border originalBorder = addvehicle_label.getBorder();
                Border underlineBorder = BorderFactory.createCompoundBorder(
                        originalBorder,
                        BorderFactory.createMatteBorder(0, 0, 1, 0, newColor) // Underline border
                );
                addvehicle_label.setBorder(underlineBorder);
     }                                             
 
     private void addvehicle_labelMouseExited(java.awt.event.MouseEvent evt) {                                             
         // Restore the original border when mouse exits
                Border originalBorder = addvehicle_label.getBorder();
                if (originalBorder instanceof CompoundBorder) {
                    addvehicle_label.setBorder(((CompoundBorder) originalBorder).getOutsideBorder());
                }
     }                                            
     private void addvehicle_labelMouseClicked(java.awt.event.MouseEvent evt){
        this.setVisible(false);
        new addVehicle(CustomerID).setVisible(true);
     }
     private void userprofile_pic_labelMouseClicked(java.awt.event.MouseEvent evt) {                                                   
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            new Main().setVisible(true);
            this.setVisible(false);
        }
        
    }
    private void view_vehicle_labelMouseClicked(java.awt.event.MouseEvent evt){
        new UserViewVehicle_Select(CustomerID).setVisible(true);;
        this.dispose();
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
             java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
 
         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new UserHomePage(0).setVisible(true);
             }
         });
     }
 
     // Variables declaration - do not modify                     
     private javax.swing.JLabel Companyname_label;
     private javax.swing.JLabel addvehicle_label;
     private javax.swing.JLabel affordable_premium_label;
     private javax.swing.JLabel affordable_premium_label1;
     private javax.swing.JLabel claim_status_label1;
     private javax.swing.JLabel fileclaim_label;
     private javax.swing.JLabel hassle_free_claims;
     private javax.swing.JLabel india_policy_label;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JLabel most_trusted_label;
     private javax.swing.JLabel price_pic_label;
     private javax.swing.JButton submitButton;
     private javax.swing.JPanel topPanel;
     private javax.swing.JLabel trusted_policy_label;
     private javax.swing.JLabel userprofile_pic_label;
     private javax.swing.JLabel view_vehicle_label;
     private javax.swing.JLabel viewpolicy_label;
     // End of variables declaration                   
 }