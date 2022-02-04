/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.dao.DBManager;
import com.models.UserModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mutaher Affan
 */
public class Admin_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Frame
     */
    public Admin_Frame() {
        initComponents();
        
        //SETTING UP SCREEN
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setTitle("Admin Management");
        setIcon();
        
        //SETTING UP JTABLE HEADERS LOOK
        
        show_user_data_Table.setRowHeight(30);
        show_user_data_Table.getTableHeader().setForeground(Color.DARK_GRAY);
        show_user_data_Table.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
        showUserData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        logo_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        minimize_panel = new javax.swing.JPanel();
        minimize_label = new javax.swing.JLabel();
        exit_panel = new javax.swing.JPanel();
        exit_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_user_data_Table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_input = new javax.swing.JTextField();
        username_input = new javax.swing.JTextField();
        delete_button = new keeptoo.KButton();
        update_button = new keeptoo.KButton();
        add_button = new keeptoo.KButton();
        jLabel7 = new javax.swing.JLabel();
        password_input = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        back_button_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 80));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 107, 190), 3, true));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        logo_label.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        logo_label.setForeground(new java.awt.Color(255, 255, 255));
        logo_label.setText("ADMIN MANAGEMENT");
        logo_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logo_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logo_labelMouseExited(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(54, 33, 80));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(255, 255, 255)));

        minimize_panel.setBackground(new java.awt.Color(54, 33, 80));

        minimize_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"))); // NOI18N
        minimize_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimize_panelLayout = new javax.swing.GroupLayout(minimize_panel);
        minimize_panel.setLayout(minimize_panelLayout);
        minimize_panelLayout.setHorizontalGroup(
            minimize_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimize_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize_label))
        );
        minimize_panelLayout.setVerticalGroup(
            minimize_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimize_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize_label))
        );

        jPanel3.add(minimize_panel);

        exit_panel.setBackground(new java.awt.Color(54, 33, 80));
        exit_panel.setLayout(new javax.swing.BoxLayout(exit_panel, javax.swing.BoxLayout.LINE_AXIS));

        exit_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_multiply_filled_25px.png"))); // NOI18N
        exit_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_labelMouseExited(evt);
            }
        });
        exit_panel.add(exit_label);

        jPanel3.add(exit_panel);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_Admin_Settings_Male_70px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(54, 33, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Admin Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        show_user_data_Table = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex , int colIndex)
            {
                return false;
            }
        };
        show_user_data_Table.setBackground(new java.awt.Color(54, 33, 80));
        show_user_data_Table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        show_user_data_Table.setForeground(new java.awt.Color(255, 255, 255));
        show_user_data_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER ID", "NAME", "USER NAME", "PASSWORD"
            }
        ));
        show_user_data_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_user_data_Table.setGridColor(new java.awt.Color(255, 255, 255));
        show_user_data_Table.setRowHeight(20);
        show_user_data_Table.setSelectionBackground(new java.awt.Color(102, 102, 255));
        show_user_data_Table.getTableHeader().setReorderingAllowed(false);
        show_user_data_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_user_data_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(show_user_data_Table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(54, 33, 80));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USER NAME :-");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD :-");

        name_input.setBackground(new java.awt.Color(54, 33, 80));
        name_input.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        name_input.setForeground(new java.awt.Color(255, 255, 255));
        name_input.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        name_input.setCaretColor(new java.awt.Color(255, 255, 255));
        name_input.setOpaque(false);

        username_input.setBackground(new java.awt.Color(54, 33, 80));
        username_input.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        username_input.setForeground(new java.awt.Color(255, 255, 255));
        username_input.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        username_input.setCaretColor(new java.awt.Color(255, 255, 255));
        username_input.setOpaque(false);

        delete_button.setText("DELETE");
        delete_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_buttonMouseClicked(evt);
            }
        });

        update_button.setForeground(new java.awt.Color(51, 51, 51));
        update_button.setText("UPDATE");
        update_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_buttonMouseClicked(evt);
            }
        });

        add_button.setText("ADD");
        add_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_buttonMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAME :-");

        password_input.setBackground(new java.awt.Color(54, 33, 80));
        password_input.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        password_input.setForeground(new java.awt.Color(255, 255, 255));
        password_input.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        password_input.setCaretColor(new java.awt.Color(255, 255, 255));
        password_input.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        back_button_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_circled_left_2_filled_50px.png"))); // NOI18N
        back_button_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_button_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_button_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_button_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(back_button_label)
                .addGap(257, 257, 257)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(logo_label)
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(logo_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button_label)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logo_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo_labelMouseEntered
        // TODO add your handling code here:
        setColor(logo_label);
    }//GEN-LAST:event_logo_labelMouseEntered

    private void logo_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo_labelMouseExited
        // TODO add your handling code here:
        resetColor(logo_label);
    }//GEN-LAST:event_logo_labelMouseExited

    private void minimize_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_labelMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_labelMouseClicked

    private void minimize_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_labelMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_minus_25px.png"));
        this.minimize_label.setIcon(icon);
    }//GEN-LAST:event_minimize_labelMouseEntered

    private void minimize_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_labelMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"));
        this.minimize_label.setIcon(icon);
    }//GEN-LAST:event_minimize_labelMouseExited

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_labelMouseClicked

    private void exit_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/close.png"));
        this.exit_label.setIcon(icon);
    }//GEN-LAST:event_exit_labelMouseEntered

    private void exit_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_multiply_filled_25px.png"));
        this.exit_label.setIcon(icon);
    }//GEN-LAST:event_exit_labelMouseExited

    private void delete_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_buttonMouseClicked
        // TODO add your handling code here:
        deleteUser();
        EmptyFields();
    }//GEN-LAST:event_delete_buttonMouseClicked

    private void update_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseClicked
        // TODO add your handling code here:
        updateUser();
        EmptyFields();
    }//GEN-LAST:event_update_buttonMouseClicked

    private void add_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_buttonMouseClicked
        // TODO add your handling code here:
        if(name_input.getText().isEmpty() || username_input.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Please Fill Fields");
        }
        else
        {
            addUser();     
            EmptyFields();
        }
    }//GEN-LAST:event_add_buttonMouseClicked

    private void show_user_data_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_user_data_TableMouseClicked
        // TODO add your handling code here:
        name_input.setText( (String) show_user_data_Table.getValueAt(show_user_data_Table.getSelectedRow(), 1));
        username_input.setText( (String) show_user_data_Table.getValueAt(show_user_data_Table.getSelectedRow(), 2));
        password_input.setText( (String) show_user_data_Table.getValueAt(show_user_data_Table.getSelectedRow(), 3));
    }//GEN-LAST:event_show_user_data_TableMouseClicked

    private void back_button_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_labelMouseClicked
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_back_button_labelMouseClicked

    private void back_button_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_labelMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_circled_left_2_filled_50px_1.png"));
        this.back_button_label.setIcon(icon);
    }//GEN-LAST:event_back_button_labelMouseEntered

    private void back_button_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_labelMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_circled_left_2_filled_50px.png"));
        this.back_button_label.setIcon(icon);
    }//GEN-LAST:event_back_button_labelMouseExited

     public void setColor(JLabel label) 
    {
        label.setForeground(new java.awt.Color(231, 33, 99));
    }
    
    public void resetColor(JLabel label) 
    {
        label.setForeground(new java.awt.Color(255,255,255));
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Admin_Frame().setVisible(true);
//            }
//        });
//    }
    
                 //     ********------USER---MANAGEMENT---METHODS------********

    //SHOWING USER DATA             
     private void showUserData(){
         List<UserModel> userModels = DBManager.getAllUsers();
         DefaultTableModel model = (DefaultTableModel)show_user_data_Table.getModel();
        
         Object[] row = new Object[4];
         for(int i = 0;i<userModels.size();i++){
             
            row[0] = userModels.get(i).getUser_id();
            row[1] = userModels.get(i).getName();
            row[2] = userModels.get(i).getUsername();
            row[3] = userModels.get(i).getPassword();
            model.addRow(row);
         }
    }
     
     //ADDING USER DATA
      private void addUser(){
        UserModel userModel = new UserModel();
        String name = new String(name_input.getText()).toUpperCase();
        userModel.setName(name);
        String username = new String(username_input.getText());
        userModel.setUsername(username);
        String password = new String(password_input.getText());
        userModel.setPassword(password);
        
        int row = DBManager.addUser(userModel);
        if (row > 0)
        {
                JOptionPane.showMessageDialog(null, "RECORD ADDED SUCCESSFULLY");
                DefaultTableModel model = (DefaultTableModel) show_user_data_Table.getModel();
                model.setRowCount(0);
                showUserData();
        }
            else
        {
                JOptionPane.showMessageDialog(null, "RECORD NOT ADDED");
        }
    }
  
      //DELETING USER DATA
       private void deleteUser(){
        String user_id = (String) Integer.toString((int) show_user_data_Table.getValueAt(show_user_data_Table.getSelectedRow(), 0));
        int row = DBManager.deleteUser(user_id);
        if (row > 0) {
                JOptionPane.showMessageDialog(null, "RECORD DELETED SUCCESSFULLY");
                DefaultTableModel model = (DefaultTableModel) show_user_data_Table.getModel();
                model.setRowCount(0);
                showUserData();
            }
        else {
                JOptionPane.showMessageDialog(null, "RECORD NOT DELETED");
            }
    }
       
     //UPDATING USER DATA
       private void updateUser(){
        UserModel userModel = new UserModel();
        String user_id = (String) Integer.toString((int) show_user_data_Table.getValueAt(show_user_data_Table.getSelectedRow(), 0));
        String name = new String(name_input.getText()).toUpperCase();
        userModel.setName(name);
        String username = new String(username_input.getText());
        userModel.setUsername(username);
        String password = new String(password_input.getText());
        userModel.setPassword(password);
        
        int row = DBManager.updateUser(userModel,user_id);
        if (row > 0)
        {
               JOptionPane.showMessageDialog(null, "RECORD UPDATED SUCCESSFULLY");
               DefaultTableModel model = (DefaultTableModel) show_user_data_Table.getModel();
               model.setRowCount(0);
               showUserData();
        }
            else
        {
               JOptionPane.showMessageDialog(null, "RECORD NOT UPDATED");
        }
    }   
       
       //EMPTY FIELDS
       
       private void EmptyFields()
       {
            name_input.setText("");
            username_input.setText("");
            password_input.setText("");
       }

        // SETTING UP WINDOWS ICON
        
       private void setIcon() 
        {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/images/application_logo.png")));
        }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton add_button;
    private javax.swing.JLabel back_button_label;
    private keeptoo.KButton delete_button;
    private javax.swing.JLabel exit_label;
    private javax.swing.JPanel exit_panel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel minimize_label;
    private javax.swing.JPanel minimize_panel;
    private javax.swing.JTextField name_input;
    private javax.swing.JTextField password_input;
    private javax.swing.JTable show_user_data_Table;
    private keeptoo.KButton update_button;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
