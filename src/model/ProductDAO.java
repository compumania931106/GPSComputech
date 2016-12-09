/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ConexionDB;
import java.sql.ResultSet;

/**
 *
 * @author Francisco Gallegos
 */
public class ProductDAO extends Product {
    ConexionDB con;

    public ProductDAO() {
        this.con = new ConexionDB();
    }
    
    
    public boolean newProduct(){
        String sql = "INSERT INTO public.product(code,productname,brand,purchprice,stock,salepricemin,reorderpoint,categoryid,salepricemay)VALUES ('"+ getCode() +"','"+ getProductname() +"','"+ getBrand() +"','"+ getPurchprice() +"','"+ getStock() +"','"+ getSalepricemin() +"','"+ getReorderpoint() +"','"+ getCategoryid() +"','"+ getSalepricemay() +"');";
        if(con.Create(sql) == null){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateProduct(){
        String sql = "UPDATE public.product SET code = '"+ getCode() +"',productname = '"+ getProductname() +"',brand = '"+ getBrand() +"', purchprice = '"+ getPurchprice() +"', stock = '"+ getStock() +"',salepricemin = '"+ getSalepricemin() +"',"
                + "reorderpoint = '"+ getReorderpoint() +"', categoryid = '"+ getCategoryid() +"', salepricemay = '"+ getSalepricemay() +"' WHERE productid = "+ getProductid() +";";
        if(con.Update(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    public boolean deleteProduct(){
        String sql = "DELETE FROM public.product WHERE productid = " + getProductid() + ";";
        if(con.Delete(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public ResultSet getProducts(){
        String sql = "SELECT * FROM public.product;";
        return con.Read(sql);
    }
    public ResultSet getProductByID(){
        String sql = "SELECT * FROM public.product WHERE productid = " + getProductid() + ";";
        return con.Read(sql);
    }
    
    public ResultSet getProductByName(){
        String sql = "SELECT * FROM public.product WHERE productname LIKE '"+ getProductname() +"%'";
        return con.Read(sql);
    }
}
