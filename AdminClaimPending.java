package com.example;

import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class AdminClaimPending extends javax.swing.JFrame {

    /**
     * Creates new form claim_pending
     */
    public AdminClaimPending() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CLAIMS_l = new javax.swing.JLabel();
        Incident_details_l = new javax.swing.JLabel();
        Date_and_time_l = new javax.swing.JLabel();
        Description_i_label = new javax.swing.JLabel();
        Location_l = new javax.swing.JLabel();
        CLAIM_DETAILS_L = new javax.swing.JLabel();
        Type_of_calim_l = new javax.swing.JLabel();
        Description_c_l = new javax.swing.JLabel();
        Additionnal_comments_l = new javax.swing.JLabel();
        REJECT = new java.awt.Button();
        ACCEPT = new java.awt.Button();
        FIR_number_l = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        date_time = new javax.swing.JTextField();
        type_of_claim = new javax.swing.JTextField();
        fir_number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_i_text = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        decription_c_text = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        additional_comments_text = new javax.swing.JTextArea();
        previous_button = new javax.swing.JButton();
        next_button = new javax.swing.JButton();
        CUSTOMER_DETAILS_Label = new javax.swing.JLabel();
        customer_name_label = new javax.swing.JLabel();
        vehicle_number_label = new javax.swing.JLabel();
        policy_number_label = new javax.swing.JLabel();
        vehicle_number_text = new javax.swing.JTextField();
        customer_name_text = new javax.swing.JTextField();
        policy_number_text = new javax.swing.JTextField();
        back_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CLAIMS_l.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CLAIMS_l.setForeground(new java.awt.Color(0, 51, 255));
        CLAIMS_l.setText("  CLAIMS PENDING");

        Incident_details_l.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Incident_details_l.setText("INCIDENT DETAILS:");

        Date_and_time_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Date_and_time_l.setText("Date & Time                          :  ");

        Description_i_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Description_i_label.setText("Description                            :");

        Location_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Location_l.setText("Location                                :");

        CLAIM_DETAILS_L.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CLAIM_DETAILS_L.setText("CLAIM DETAILS:");

        Type_of_calim_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Type_of_calim_l.setText("Type of claim                        :");

        Description_c_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Description_c_l.setText("Description                            :");

        Additionnal_comments_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Additionnal_comments_l.setText("Additional comments         :");

        REJECT.setActionCommand("CANCEL");
        REJECT.setBackground(new java.awt.Color(0, 0, 0));
        REJECT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REJECT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        REJECT.setForeground(new java.awt.Color(255, 255, 255));
        REJECT.setLabel("REJECT");
        REJECT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REJECTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REJECTMouseExited(evt);
            }
        });
        REJECT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REJECTActionPerformed(evt);
            }
        });

        ACCEPT.setBackground(new java.awt.Color(0, 0, 0));
        ACCEPT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACCEPT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ACCEPT.setForeground(new java.awt.Color(255, 255, 255));
        ACCEPT.setLabel("ACCEPT");
        ACCEPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ACCEPTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ACCEPTMouseExited(evt);
            }
        });
        ACCEPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCEPTActionPerformed(evt);
            }
        });

        FIR_number_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FIR_number_l.setText("FIR number                          :");

        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        description_i_text.setColumns(20);
        description_i_text.setRows(5);
        jScrollPane1.setViewportView(description_i_text);

        decription_c_text.setColumns(20);
        decription_c_text.setRows(5);
        jScrollPane3.setViewportView(decription_c_text);

        additional_comments_text.setColumns(20);
        additional_comments_text.setRows(5);
        jScrollPane6.setViewportView(additional_comments_text);

        previous_button.setBackground(new java.awt.Color(51, 51, 51));
        previous_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        previous_button.setForeground(new java.awt.Color(255, 255, 255));
        previous_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        previous_button.setText("Previous");
        previous_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        next_button.setBackground(new java.awt.Color(51, 51, 51));
        next_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        next_button.setForeground(new java.awt.Color(255, 255, 255));
        next_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/next.png"))); // NOI18N
        next_button.setHorizontalTextPosition(SwingConstants.LEFT);
        next_button.setIconTextGap(10);
        next_button.setText("Next");
        next_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        CUSTOMER_DETAILS_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CUSTOMER_DETAILS_Label.setText("CUSTOMER DETAILS:");

        customer_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customer_name_label.setText("Customer name                    :  ");

        vehicle_number_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vehicle_number_label.setText("Vehicle number                    :  ");

        policy_number_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        policy_number_label.setText("Policy number                      :  ");

        vehicle_number_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_number_textActionPerformed(evt);
            }
        });

        customer_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_name_textActionPerformed(evt);
            }
        });

        policy_number_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policy_number_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(REJECT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customer_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(vehicle_number_label, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(CUSTOMER_DETAILS_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(policy_number_label, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(Date_and_time_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Description_i_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Location_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(location)
                                            .addComponent(date_time)
                                            .addComponent(jScrollPane1)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(vehicle_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customer_name_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(policy_number_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Incident_details_l, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previous_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(next_button))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Additionnal_comments_l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Description_c_l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Type_of_calim_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CLAIM_DETAILS_L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FIR_number_l, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fir_number)
                                    .addComponent(jScrollPane6)
                                    .addComponent(type_of_claim)
                                    .addComponent(jScrollPane3))))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ACCEPT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(CLAIMS_l, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 454, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CLAIMS_l, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(Description_c_l, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FIR_number_l, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fir_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Incident_details_l, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Additionnal_comments_l, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(REJECT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ACCEPT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Date_and_time_l, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Location_l, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Description_i_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previous_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CLAIM_DETAILS_L, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CUSTOMER_DETAILS_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Type_of_calim_l, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type_of_claim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(customer_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customer_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vehicle_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicle_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(policy_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(policy_number_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previouspage.png"))); // NOI18N
        back_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(back_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(back_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void vehicle_number_textActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void ACCEPTActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void ACCEPTMouseExited(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        ACCEPT.setBackground(new java.awt.Color(0, 0, 0));
        ACCEPT.setForeground(new java.awt.Color(255, 255, 255));
    }                                  

    private void ACCEPTMouseEntered(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        ACCEPT.setBackground(new java.awt.Color(0, 204, 0));
        ACCEPT.setForeground(new java.awt.Color(0, 0, 0));
    }                                   

    private void REJECTActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void REJECTMouseExited(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        REJECT.setBackground(new java.awt.Color(0, 0, 0));
        REJECT.setForeground(new java.awt.Color(255, 255, 255));
    }                                  

    private void REJECTMouseEntered(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        REJECT.setBackground(new java.awt.Color(255, 0, 0));
        REJECT.setForeground(new java.awt.Color(0, 0, 0));
    }                                   

    private void customer_name_textActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void policy_number_textActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }    
    private void back_ButtonActionPerformed(java.awt.event.MouseEvent evt){
        this.dispose();
        new AdminViewClaims().setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminClaimPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminClaimPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminClaimPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminClaimPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminClaimPending().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Button ACCEPT;
    private javax.swing.JLabel Additionnal_comments_l;
    private javax.swing.JLabel CLAIMS_l;
    private javax.swing.JLabel CLAIM_DETAILS_L;
    private javax.swing.JLabel CUSTOMER_DETAILS_Label;
    private javax.swing.JLabel Date_and_time_l;
    private javax.swing.JLabel Description_c_l;
    private javax.swing.JLabel Description_i_label;
    private javax.swing.JLabel FIR_number_l;
    private javax.swing.JLabel Incident_details_l;
    private javax.swing.JLabel Location_l;
    private java.awt.Button REJECT;
    private javax.swing.JLabel Type_of_calim_l;
    private javax.swing.JTextArea additional_comments_text;
    private javax.swing.JLabel back_label;
    private javax.swing.JLabel customer_name_label;
    private javax.swing.JTextField customer_name_text;
    private javax.swing.JTextField date_time;
    private javax.swing.JTextArea decription_c_text;
    private javax.swing.JTextArea description_i_text;
    private javax.swing.JTextField fir_number;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField location;
    private javax.swing.JButton next_button;
    private javax.swing.JLabel policy_number_label;
    private javax.swing.JTextField policy_number_text;
    private javax.swing.JButton previous_button;
    private javax.swing.JTextField type_of_claim;
    private javax.swing.JLabel vehicle_number_label;
    private javax.swing.JTextField vehicle_number_text;
    // End of variables declaration                   
}