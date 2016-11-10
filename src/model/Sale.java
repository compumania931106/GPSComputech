/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author VictorManuel
 */
public class Sale {
    private int saleid;
    private String date;
    private Double amount;
    private int userid;
    private int clientid;

    public Sale() {
    }

    public Sale(int saleid, String date, Double amount, int userid, int clientid) {
        this.saleid = saleid;
        this.date = date;
        this.amount = amount;
        this.userid = userid;
        this.clientid = clientid;
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }
    
    
}
