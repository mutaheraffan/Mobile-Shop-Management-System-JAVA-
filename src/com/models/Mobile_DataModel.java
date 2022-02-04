/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import java.util.Date;

/**
 *
 * @author Mutaher Affan
 */
public class Mobile_DataModel {
    private int Stock_id;
    private String Model_no;
    private String Brand;
    private String Cost_price;
    private String Sale_price;
    private String condition;
    private Date date;
    private String Imei_no;
    private String color;
    private String modified_by;
    private int active;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public String getImei_no() {
        return Imei_no;
    }

    public void setImei_no(String Imei_no) {
        this.Imei_no = Imei_no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getStock_id() {
        return Stock_id;
    }

    public void setStock_id(int Stock_id) {
        this.Stock_id = Stock_id;
    }

    public String getModel_no() {
        return Model_no;
    }

    public void setModel_no(String Model_no) {
        this.Model_no = Model_no;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getCost_price() {
        return Cost_price;
    }

    public void setCost_price(String Cost_price) {
        this.Cost_price = Cost_price;
    }

    public String getSale_price() {
        return Sale_price;
    }

    public void setSale_price(String Sale_price) {
        this.Sale_price = Sale_price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
