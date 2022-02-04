/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author Mutaher Affan
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash_Screen screen = new Splash_Screen();
        screen.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) 
            {
             Thread.sleep(15);
             screen.Progress_Count_label.setText(" "+Integer.toString(i)+"%");
             screen.progress_bar.setValue(i);
             if (i == 100) 
             {
                 screen.setVisible(false);
                 Login login = new Login();
                 login.setVisible(true);
             }
            }
        } catch (Exception e) 
        {
            
        }
    }
    
}
