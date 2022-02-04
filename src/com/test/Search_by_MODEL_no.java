/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.dao.DBManager;
import com.models.Mobile_DataModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mutaher Affan
 */
public class Search_by_MODEL_no extends javax.swing.JFrame {

    /**
     * Creates new form Search_by_MODEL_no
     */
    public Search_by_MODEL_no() {
        initComponents();
        
        //SETTING UP DISPLAY
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setTitle("Search By Model NO");
        setIcon();
        
        //SETTING UP JTABLE HEADERS LOOK
        
        show_mobile_data_Table.setRowHeight(30);
        show_mobile_data_Table.getTableHeader().setForeground(Color.DARK_GRAY);
        show_mobile_data_Table.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_panel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_mobile_data_Table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        logo_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        model_input = new javax.swing.JTextField();
        search_button = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        brand_input = new javax.swing.JTextField();
        total_no_of_mobile_label = new javax.swing.JLabel();
        mobile_count_label = new javax.swing.JLabel();
        sold_button = new keeptoo.KButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        minimize_panel = new javax.swing.JPanel();
        minimize_label = new javax.swing.JLabel();
        exit_panel = new javax.swing.JPanel();
        exit_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back_button_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_panel1.setBackground(new java.awt.Color(54, 33, 80));
        bg_panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 107, 190), 3, true));
        bg_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 33, 80));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Mobile Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        show_mobile_data_Table = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex , int colIndex)
            {
                return false;
            }
        };
        show_mobile_data_Table.setBackground(new java.awt.Color(54, 33, 80));
        show_mobile_data_Table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        show_mobile_data_Table.setForeground(new java.awt.Color(255, 255, 255));
        show_mobile_data_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STOCK ID", "MODEL NO", "BRAND", "IMEI NO", "COST PRICE", "SALE PRICE", "CONDITION", "DATE", "COLOR", "MODIFIED BY"
            }
        ));
        show_mobile_data_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_mobile_data_Table.setGridColor(new java.awt.Color(255, 255, 255));
        show_mobile_data_Table.setRowHeight(20);
        show_mobile_data_Table.setSelectionBackground(new java.awt.Color(102, 102, 255));
        show_mobile_data_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(show_mobile_data_Table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        bg_panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 570, 600));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bg_panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 118, 1130, 10));

        logo_label.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        logo_label.setForeground(new java.awt.Color(255, 255, 255));
        logo_label.setText("SEARCH BY MODEL NO");
        logo_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logo_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logo_labelMouseExited(evt);
            }
        });
        bg_panel1.add(logo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(54, 33, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Mobile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        model_input.setBackground(new java.awt.Color(54, 33, 80));
        model_input.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        model_input.setForeground(new java.awt.Color(255, 255, 255));
        model_input.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        model_input.setCaretColor(new java.awt.Color(255, 255, 255));
        model_input.setOpaque(false);
        model_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                model_inputKeyPressed(evt);
            }
        });

        search_button.setForeground(new java.awt.Color(51, 51, 51));
        search_button.setText("SEARCH");
        search_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MODEL NO :-");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BRAND :-");

        brand_input.setBackground(new java.awt.Color(54, 33, 80));
        brand_input.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        brand_input.setForeground(new java.awt.Color(255, 255, 255));
        brand_input.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        brand_input.setCaretColor(new java.awt.Color(255, 255, 255));
        brand_input.setOpaque(false);
        brand_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                brand_inputKeyPressed(evt);
            }
        });

        total_no_of_mobile_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total_no_of_mobile_label.setForeground(new java.awt.Color(255, 255, 255));

        mobile_count_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobile_count_label.setForeground(new java.awt.Color(255, 51, 102));

        sold_button.setForeground(new java.awt.Color(51, 51, 51));
        sold_button.setText("SOLD");
        sold_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sold_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sold_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(model_input, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand_input, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(sold_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(total_no_of_mobile_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobile_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(model_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total_no_of_mobile_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobile_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sold_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        bg_panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 490, 290));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        bg_panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 13, 600));

        jPanel4.setBackground(new java.awt.Color(54, 33, 80));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(255, 255, 255)));

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

        jPanel4.add(minimize_panel);

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

        jPanel4.add(exit_panel);

        bg_panel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_search_more_70px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg_panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

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
        bg_panel1.add(back_button_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
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

    private void search_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)show_mobile_data_Table.getModel();
        model.setRowCount(0);
        showMobileData_by_model();
        EmptyFields();
        jPanel1.requestFocus();
    }//GEN-LAST:event_search_buttonMouseClicked

    private void minimize_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_labelMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_labelMouseClicked

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_labelMouseClicked

    private void back_button_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_labelMouseClicked
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_back_button_labelMouseClicked

    private void model_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_model_inputKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (model_input.getText().isEmpty() || brand_input.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Fields");
            }
            else 
            {
                showMobileData_by_model();
                EmptyFields();
                jPanel1.requestFocus();
            }
        }
    }//GEN-LAST:event_model_inputKeyPressed

    private void brand_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brand_inputKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (model_input.getText().isEmpty() || brand_input.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Fields");
            }
            else 
            {
                showMobileData_by_model();
                EmptyFields();
                jPanel1.requestFocus();
            }
        }
    }//GEN-LAST:event_brand_inputKeyPressed

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

    private void sold_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sold_buttonMouseClicked
        // TODO add your handling code here:
        if(show_mobile_data_Table.getSelectionModel().isSelectionEmpty())
        {
           JOptionPane.showMessageDialog(rootPane, "Select any one row from Table"); 
        }
        else 
        {
            SellMobile();   
            EmptyFields();
            jPanel1.requestFocus();
        }
        
    }//GEN-LAST:event_sold_buttonMouseClicked

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
//            java.util.logging.Logger.getLogger(Search_by_MODEL_no.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Search_by_MODEL_no.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Search_by_MODEL_no.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Search_by_MODEL_no.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Search_by_MODEL_no().setVisible(true);
//            }
//        });
//    }
    
    //     ********------UNSOLD MOBILE DATA BY MODEL NO---MANAGEMENT---METHOD------********
   
    
    //GETTING ALL UNSOLD MOBILE DATA BY MODEL NO
    private void showMobileData_by_model(){
         String models = model_input.getText().toUpperCase();
         String brand = brand_input.getText().toUpperCase();
         List<Mobile_DataModel> mobile_DataModels = DBManager.getAllMobilesByModel(models, brand);
         
         int count = mobile_DataModels.size();
         
         if(count > 0)
         {
             total_no_of_mobile_label.setText("Total Number Of Mobiles :-");
             Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
             mobile_count_label.setBorder(border);
             mobile_count_label.setText(" "+Integer.toString(count));
         }
         
         else
         {
            total_no_of_mobile_label.setText("");
            mobile_count_label.setText("");
            mobile_count_label.setBorder(null);
           JOptionPane.showMessageDialog(rootPane, "You have no mobile,which you have recently searched");  
         }
         
         
         DefaultTableModel model = (DefaultTableModel)show_mobile_data_Table.getModel();
         Object[] row = new Object[10];
         for(int i = 0;i<mobile_DataModels.size();i++){
             
            row[0] = mobile_DataModels.get(i).getStock_id();
            row[1] = mobile_DataModels.get(i).getModel_no();
            row[2] = mobile_DataModels.get(i).getBrand();
            row[3] = mobile_DataModels.get(i).getImei_no();
            row[4] = mobile_DataModels.get(i).getCost_price();
            row[5] = mobile_DataModels.get(i).getSale_price();
            row[6] = mobile_DataModels.get(i).getCondition();
            row[7] = mobile_DataModels.get(i).getDate();
            row[8] = mobile_DataModels.get(i).getColor();
            row[9] = mobile_DataModels.get(i).getModified_by();
            model.addRow(row);
         }
    }
    
    
          //SELLING MOBILE 
       private void SellMobile(){
        Mobile_DataModel mobile_DataModel = new Mobile_DataModel();
        String imei_no = ((String)  show_mobile_data_Table.getValueAt(show_mobile_data_Table.getSelectedRow(), 3));
        mobile_DataModel.setImei_no(imei_no);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        
        int row = DBManager.sellMobile(mobile_DataModel, now);
        if (row > 0)
        {
               JOptionPane.showMessageDialog(null, "RECORD UPDATED SUCCESSFULLY");
               DefaultTableModel model = (DefaultTableModel) show_mobile_data_Table.getModel();
               model.setRowCount(0);
               total_no_of_mobile_label.setText("");
               mobile_count_label.setText("");
               mobile_count_label.setBorder(null);
               //showMobileData_by_model();
        }
            else
        {
               JOptionPane.showMessageDialog(null, "RECORD NOT UPDATED");
        } 
    } 
       
       //EMPTY FIELDS
       
       private void EmptyFields()
       {
            model_input.setText("");
            brand_input.setText("");
       }
       
        // SETTING UP WINDOWS ICON
        
       private void setIcon() 
        {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/images/application_logo.png")));
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_button_label;
    private javax.swing.JPanel bg_panel1;
    private javax.swing.JTextField brand_input;
    private javax.swing.JLabel exit_label;
    private javax.swing.JPanel exit_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel minimize_label;
    private javax.swing.JPanel minimize_panel;
    private javax.swing.JLabel mobile_count_label;
    private javax.swing.JTextField model_input;
    private keeptoo.KButton search_button;
    private javax.swing.JTable show_mobile_data_Table;
    private keeptoo.KButton sold_button;
    private javax.swing.JLabel total_no_of_mobile_label;
    // End of variables declaration//GEN-END:variables
}