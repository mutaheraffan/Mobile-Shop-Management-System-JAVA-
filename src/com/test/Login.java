/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.dao.DBManager;
import com.models.UserModel;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mutaher Affan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        //SETTING UP SCREEN
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setTitle("Login Window");
        setIcon();
        jPanel1.requestFocus();
        
        //SETTING UP PLACE HOLDERS
        this.Password.setEchoChar((char)0);
        PlaceHolders();
        
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
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        minimize_Label = new javax.swing.JLabel();
        exit_Label5 = new javax.swing.JLabel();
        wrong_username_or_password_label = new javax.swing.JLabel();
        show_password_check_box = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 80));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 107, 190), 3, true));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRATION LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        Username.setBackground(new java.awt.Color(54, 33, 80));
        Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Username.setCaretColor(new java.awt.Color(255, 255, 255));
        Username.setOpaque(false);
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameKeyPressed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 40));

        Password.setBackground(new java.awt.Color(54, 33, 80));
        Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.setOpaque(false);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 240, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_user_filled_35px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_key_2_filled_35px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        login_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_login_rounded_right_filled_35px_1.png"))); // NOI18N
        login_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_labelMouseExited(evt);
            }
        });
        jPanel1.add(login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_working_with_a_laptop_127px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(54, 33, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        minimize_Label.setForeground(new java.awt.Color(255, 255, 255));
        minimize_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"))); // NOI18N
        minimize_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_LabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimize_LabelMousePressed(evt);
            }
        });
        jPanel2.add(minimize_Label);

        exit_Label5.setForeground(new java.awt.Color(255, 255, 255));
        exit_Label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_multiply_filled_25px.png"))); // NOI18N
        exit_Label5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_Label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_Label5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_Label5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit_Label5MousePressed(evt);
            }
        });
        jPanel2.add(exit_Label5);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 30));

        wrong_username_or_password_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wrong_username_or_password_label.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(wrong_username_or_password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 270, 20));

        show_password_check_box.setBackground(new java.awt.Color(54, 33, 80));
        show_password_check_box.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        show_password_check_box.setForeground(new java.awt.Color(255, 255, 255));
        show_password_check_box.setText("Show Password");
        show_password_check_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password_check_boxActionPerformed(evt);
            }
        });
        jPanel1.add(show_password_check_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(Username.getText().equals("") || this.Password.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Fields");
            }
            else 
            {
            login();
            }
        }
    }//GEN-LAST:event_PasswordKeyPressed

    private void exit_Label5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label5MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_Label5MousePressed

    private void minimize_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_LabelMousePressed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_LabelMousePressed

    private void login_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_labelMouseClicked
        // TODO add your handling code here:
        if(Username.getText().equals("") || this.Password.getText().equals("") || Username.getText().equals("Enter Username") || this.Password.getText().equals("Enter Password"))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Fields");
            }
            else 
            {
            login();
            }
    }//GEN-LAST:event_login_labelMouseClicked

    private void exit_Label5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label5MouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/close.png"));
        this.exit_Label5.setIcon(icon);
    }//GEN-LAST:event_exit_Label5MouseEntered

    private void exit_Label5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label5MouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_multiply_filled_25px.png"));
        this.exit_Label5.setIcon(icon);
    }//GEN-LAST:event_exit_Label5MouseExited

    private void minimize_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_LabelMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_minus_25px.png"));
        this.minimize_Label.setIcon(icon);
    }//GEN-LAST:event_minimize_LabelMouseEntered

    private void minimize_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_LabelMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"));
        this.minimize_Label.setIcon(icon);
    }//GEN-LAST:event_minimize_LabelMouseExited

    private void login_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_labelMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_login_rounded_right_filled_35px_2.png"));
        this.login_label.setIcon(icon);
    }//GEN-LAST:event_login_labelMouseEntered

    private void login_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_labelMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/com/images/icons8_login_rounded_right_filled_35px_1.png"));
        this.login_label.setIcon(icon);
    }//GEN-LAST:event_login_labelMouseExited

    private void show_password_check_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password_check_boxActionPerformed
        // TODO add your handling code here:
        if(show_password_check_box.isSelected())
        {
            this.Password.setEchoChar((char)0);
        }
        else 
        {
            this.Password.setEchoChar('*');
        }
    }//GEN-LAST:event_show_password_check_boxActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        if (this.Password.getText().equals(""))
        {
        this.Password.setEchoChar((char)0);
        PlaceHolders();
        jPanel1.requestFocus();
        }
        else if (Username.getText().equals(""))
        {
            PlaceHolders();
            jPanel1.requestFocus();
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(Username.getText().equals("") || this.Password.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Fields");
            }
            else 
            {
            login();
            }
        }
    }//GEN-LAST:event_UsernameKeyPressed

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        // TODO add your handling code here:
        this.Password.setEchoChar('*');
    }//GEN-LAST:event_PasswordMouseClicked

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        // TODO add your handling code here:
        this.Password.setEchoChar('*');
    }//GEN-LAST:event_PasswordKeyTyped

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
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }
    
             //     ********------LOGGING IN MULTIPLE SIMPLE USERS---MANAGEMENT---METHOD------********
    
   private void login() {
        List<UserModel> userModel =  DBManager.getAllUsers();
        String username = new String(Username.getText());
        String password = new String(this.Password.getPassword());
  
         for(int i = 0;i<userModel.size();i++)
         {    
            if(userModel.get(i).getUsername().equals(username) && userModel.get(i).getPassword().equals(password)) 
            {
            DBManager.Username = userModel.get(i).getName();
            MainMenu mainMenu = new MainMenu();
            mainMenu.setVisible(true);
            setVisible(false);
            break;
            }
            else if (i == userModel.size()-1)
            {
            wrong_username_or_password_label.setText("Please enter a Valid Username and Password.");
            Username.setText("");
            this.Password.setText("");
            break;
            }
         }
        
    }
   
    // SETTING UP WINDOWS ICON
        
       private void setIcon() 
        {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/images/application_logo.png")));
        }
       
    // SETTING UP PLACE HOLDERS METHODS
       private void PlaceHolders()
       {
           PlaceHolder holder = new PlaceHolder(Username, "Enter Username");
           PlaceHolder holder2 = new PlaceHolder(Password, "Enter Password");
           holder.setColorSimple(Color.WHITE);
           holder.setFont("Verdana");
           holder2.setColorSimple(Color.WHITE);
           holder2.setFont("Verdana");
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel exit_Label5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel minimize_Label;
    private javax.swing.JCheckBox show_password_check_box;
    private javax.swing.JLabel wrong_username_or_password_label;
    // End of variables declaration//GEN-END:variables
}
