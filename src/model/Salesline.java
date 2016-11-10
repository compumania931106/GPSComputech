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
public class Salesline {
    private int saleslineid;
    private int quantity;
    private Double saleprice;
    private Double purchprice;
    private int saleid;
    private int productid;

    public Salesline() {
    }

    public Salesline(int saleslineid, int quantity, Double saleprice, Double purchprice, int saleid, int productid) {
        this.saleslineid = saleslineid;
        this.quantity = quantity;
        this.saleprice = saleprice;
        this.purchprice = purchprice;
        this.saleid = saleid;
        this.productid = productid;
    }

    public int getSaleslineid() {
        return saleslineid;
    }

    public void setSaleslineid(int saleslineid) {
        this.saleslineid = saleslineid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Double saleprice) {
        this.saleprice = saleprice;
    }

    public Double getPurchprice() {
        return purchprice;
    }

    public void setPurchprice(Double purchprice) {
        this.purchprice = purchprice;
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
    
    
}
