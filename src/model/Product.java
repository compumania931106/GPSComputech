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
public class Product {
    private int productid;
    private String code;
    private String productname;
    private String brand;
    private Double purchprice;
    private int stock;
    private Double salepricemin;
    private int reorderpoint;
    private int categoryid;
    private Double salepricemay;

    public Product() {
    }

    public Product(int productid, String code, String productname, String brand, Double purchprice, int stock, Double salepricemin, int reorderpoint, int categoryid, Double salepricemay) {
        this.productid = productid;
        this.code = code;
        this.productname = productname;
        this.brand = brand;
        this.purchprice = purchprice;
        this.stock = stock;
        this.salepricemin = salepricemin;
        this.reorderpoint = reorderpoint;
        this.categoryid = categoryid;
        this.salepricemay = salepricemay;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPurchprice() {
        return purchprice;
    }

    public void setPurchprice(Double purchprice) {
        this.purchprice = purchprice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getSalepricemin() {
        return salepricemin;
    }

    public void setSalepricemin(Double salepricemin) {
        this.salepricemin = salepricemin;
    }

    public int getReorderpoint() {
        return reorderpoint;
    }

    public void setReorderpoint(int reorderpoint) {
        this.reorderpoint = reorderpoint;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public Double getSalepricemay() {
        return salepricemay;
    }

    public void setSalepricemay(Double salepricemay) {
        this.salepricemay = salepricemay;
    }
    
    
}
