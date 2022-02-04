/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.dao.connection.DBConnection;
import com.models.MasterModel;
import com.models.Mobile_DataModel;
import com.models.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.test.Home;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutaher Affan
 */
public class DBManager {
    private static Connection conn = DBConnection.getConnection();
    public static String Username;
 
                 //     ********------MOBILE DATA---MANAGEMENT---METHODS------********
    
                                  //  GET ALL UNSOLD MOBILE DATA
    
 public static List<Mobile_DataModel> getAllData(){
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from mobile_data where active = 1 and availibility = 'UNSOLD'");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
    }
 
                                        //ADDING MOBILE DATA
     
     public static Integer addMobile(Mobile_DataModel mobile_DataModel){
        
         Integer num = 0;
        
         try {
            java.sql.Date j = new java.sql.Date(mobile_DataModel.getDate().getTime());
            Statement statement = conn.createStatement();
            num = statement.executeUpdate("INSERT INTO mobile_data (model_no , brand , cost_price , sale_price , cond , dat , imei_no , color , modified_by) values ('"+mobile_DataModel.getModel_no()+"',"
                    +"'"+mobile_DataModel.getBrand()+"',"+"'"+mobile_DataModel.getCost_price()+"',"+"'"+mobile_DataModel.getSale_price()+"',"+"'"+mobile_DataModel.getCondition()+"',"+"'"+j+"','"+mobile_DataModel.getImei_no()+"','"+mobile_DataModel.getColor()+"','"+Username+"')");
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
     
                                     //DELETING ONE SOLD MOBILE DATA
     
     public static Integer deleteMobile(String imei_no){
       
         Integer num = 0;
    
         try {
            Statement statement = conn.createStatement();
            num = statement.executeUpdate("update mobile_data set active = 0,modified_by = '"+Username+"'"
                    + " where imei_no = '"+imei_no+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
     
     
                                      //DELETING ALL SOLD MOBILES DATA
 
     public static Integer deleteAllSoldMobiles(List imei_no)
     {
       
         Integer num = 0;
    
         try {
            Statement statement = conn.createStatement();
            int i = 0;
            while(i < imei_no.size())
            {
            num = statement.executeUpdate("update mobile_data set active = 0,modified_by = '"+Username+"'"
                    + " where imei_no = '"+imei_no.get(i)+"'");
            i++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }

     
                                     //UPDATING UNSOLD MOBILE DATA
    
     public static Integer updateMobile(Mobile_DataModel mobile_DataModel,String imei_no){
        Integer rs = 0;
        try {
            java.sql.Date j = new java.sql.Date(mobile_DataModel.getDate().getTime());
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("update mobile_data set model_no = '"+mobile_DataModel.getModel_no()+"',brand = '"+mobile_DataModel.getBrand()+"',imei_no = '"+mobile_DataModel.getImei_no()+"',cost_price = '"+mobile_DataModel.getCost_price()+"',sale_price = '"+mobile_DataModel.getSale_price()+"',cond = '"+mobile_DataModel.getCondition()+"',dat = '"+j+"',color = '"+mobile_DataModel.getColor()+"',modified_by = '"+Username+"' where imei_no = '"+imei_no+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    } 
 
                                            //SELLING MOBILE 
    
     public static Integer sellMobile(Mobile_DataModel mobile_DataModel,LocalDateTime now){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("update mobile_data set dat = '"+now+"' , availibility = 'SOLD' , modified_by = '"+Username+"' where imei_no = '"+mobile_DataModel.getImei_no()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
     
                                    //  GETTING ALL SOLD MOBILE DATA
 
     public static List<Mobile_DataModel> getAllSoldMobiles(){
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from mobile_data where active = 1 and availibility = 'SOLD'");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
    }
     
                               //  GETTING ALL UNSOLD MOBILE DATA BY MODEL NO
     
    public static List<Mobile_DataModel> getAllMobilesByModel(String model_no,String brand)
    {
      
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM mobile_data WHERE model_no = '"+model_no+"' AND brand = '"+brand+"' and availibility = 'UNSOLD' ");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
   
    }
    
                  //  GETTING ALL SOLD AND UNSOLD MOBILE DATA BY IMEI NO FOR FINDING IMEI IS ALREADY IN DB OR NOT
    
    public static List<Mobile_DataModel> getAllMobilesByIMEI(String imei)
    {
      
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM mobile_data WHERE imei_no = '"+imei+"' and active = 1");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
   
    }
    
                               //  GETTING ALL UNSOLD MOBILE DATA BY IMEI NO
    
    public static List<Mobile_DataModel> getAllUnSoldMobilesByIMEI(String imei)
    {
      
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM mobile_data WHERE imei_no = '"+imei+"' and availibility = 'UNSOLD'");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
   
    }
    
                                //  GETTING ALL SOLD MOBILE DATA BY IMEI NO
    
    public static List<Mobile_DataModel> getAllSoldMobilesByIMEI(String imei)
    {
      
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM mobile_data WHERE imei_no = '"+imei+"' and availibility = 'SOLD'");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
   
    }
    
                                //GETTING SOLD MOBILES RECORDS WITH PROFIT
    
    public static List<Mobile_DataModel> getAllSoldMobilesRecordByDateWithProfit(java.sql.Date date,java.sql.Date d){
        List<Mobile_DataModel> mobile_DataModels = new ArrayList<>();
        Mobile_DataModel mobile_DataModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from mobile_data where active = 1 AND availibility = 'SOLD' AND dat BETWEEN '"+date+"' AND '"+d+"' ");
            while(rs.next()){
                mobile_DataModel = new Mobile_DataModel();
                mobile_DataModel.setStock_id(rs.getInt("stock_id"));
                mobile_DataModel.setModel_no(rs.getString("model_no"));
                mobile_DataModel.setBrand(rs.getString("brand"));
                mobile_DataModel.setCost_price(rs.getString("cost_price"));
                mobile_DataModel.setSale_price(rs.getString("sale_price"));
                mobile_DataModel.setCondition(rs.getString("cond"));
                mobile_DataModel.setDate(rs.getDate("dat"));
                mobile_DataModel.setImei_no(rs.getString("imei_no"));
                mobile_DataModel.setColor(rs.getString("color"));
                mobile_DataModel.setModified_by(rs.getString("modified_by"));
                mobile_DataModels.add(mobile_DataModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return mobile_DataModels;
    }
 
    
    /* 
 
        //ADDING MOBILE DATA
 
     public static Integer addMobile_Data(Mobile_DataModel mobile_DataModel){
        int row = 0;
        try {
            PreparedStatement preparedStatement;
            preparedStatement = conn.prepareStatement("insert into mobile_data (model_no,brand,cost_price,sale_price,condition,date,imei) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, mobile_DataModel.getModel_no());
            preparedStatement.setString(2, mobile_DataModel.getBrand());
            preparedStatement.setString(3, mobile_DataModel.getCost_price());
            preparedStatement.setString(4, mobile_DataModel.getSale_price());
            preparedStatement.setString(5, mobile_DataModel.getCondition());
            java.sql.Date j = new java.sql.Date(mobile_DataModel.getDate().getTime());
            preparedStatement.setDate(6, j);
            preparedStatement.setString(7, mobile_DataModel.getImei_no());
            row = preparedStatement.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return row;   
    }
 
    */
     
     
    /*    
    
     //UPDATING MOBILE DATA USING PREPARED STATEMENT
     public static Integer updateMobile2(Mobile_DataModel mobile_DataModel,String i) {
        int row = 0;
        try {
            PreparedStatement preparedStatement;
            preparedStatement = conn.prepareStatement("update mobile_data set model_no = ?,brand = ?,cost_price = ?,"
                    + "sale_price = ?,condition = ?,date = ? where imei_no = '"+i+"'");
            preparedStatement.setString(1, mobile_DataModel.getModel_no());
            preparedStatement.setString(2, mobile_DataModel.getBrand());
            preparedStatement.setString(3, mobile_DataModel.getCost_price());
            preparedStatement.setString(4, mobile_DataModel.getSale_price());
            preparedStatement.setString(5, mobile_DataModel.getCondition());
            java.sql.Date j = new java.sql.Date(mobile_DataModel.getDate().getTime());
            preparedStatement.setDate(6, j);
            row = preparedStatement.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return row;
    }
     
    */
     
 
    
        //     ********------USER---MANAGEMENT---METHODS------********   
    
                            //GETTING ALL USERS
    
    public static List<UserModel> getAllUsers() {
        
        List<UserModel> userModels = new ArrayList<>();
        UserModel userModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                userModel = new UserModel();
                userModel.setUser_id(rs.getInt("user_id"));
                userModel.setName(rs.getString("name"));
                userModel.setUsername(rs.getString("username"));
                userModel.setPassword(rs.getString("password"));
                
                userModels.add(userModel);      
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userModels;
    }
    
                               //ADDING USERS 
    
    public static Integer addUser(UserModel userModel)
    {
        Integer num = 0;
       
        try { 
            Statement statement = conn.createStatement();
            num = statement.executeUpdate("INSERT INTO user (name , username , password) values ('"+userModel.getName()+"','"+userModel.getUsername()+"','"+userModel.getPassword()+"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
    
                               //DELETING USERS
    
    public static Integer deleteUser(String user_id) {
        
        Integer num = 0;
        
        try {
            Statement statement = conn.createStatement();
            num = statement.executeUpdate("DELETE FROM user where user_id = '"+user_id+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
    
                                //UPDATING USERS
    
    public static Integer updateUser(UserModel userModel,String user_id) {
        
        Integer rs = 0;
        
        try {    
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("UPDATE user set name = '"+userModel.getName()+"' , username = '"+userModel.getUsername()+"' , password = '"+userModel.getPassword()+"' where user_id = '"+user_id+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
                       //GETTING ONLY SINGLE MASTER USER 
    
                 /* MORE THAN ONE ROW FROM DATA BASE WILL NOT BE ACCESSIBLE */
     
     public static MasterModel getUsername_and_Password() {
        MasterModel masterModel = null;
         
         try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM master_key");
            while(rs.next()) {
                masterModel = new MasterModel();
                masterModel.setUsername(rs.getString("name"));
                masterModel.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return masterModel;
     }
    
} //END OF THE DB MANAGER CLASS DE_LIMITER