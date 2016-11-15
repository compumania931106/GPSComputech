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
public class SaleslineDAO extends Salesline {
    ConexionDB con;
    
    public SaleslineDAO() {
        this.con = new ConexionDB();
    }
    public boolean newSalesline(){
        String sql = "INSERT INTO public.salesline(quantity,saleprice,purchprice,saleid)VALUES ('"+ getQuantity() +"','"+ getSaleprice() +"','"+ getPurchprice() +"','"+ getSaleid() +"',);";
        if(con.Create(sql) == null){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateSalesline(){
        String sql = "UPDATE public.salesline SET  quantity = '"+ getQuantity() +"',saleprice = '"+ getSaleprice() +"', purchprice = '"+ getPurchprice() +"', saleid = '"+ getSaleid() +"'  WHERE saleslineid = "+ getSaleslineid() +";";
        if(con.Update(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    public boolean deleteSalesline(){
        String sql = "DELETE FROM public.salesline WHERE saleslineid = " + getSaleslineid() + ";";
        if(con.Delete(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public ResultSet getSaleslines(){
        String sql = "SELECT * FROM public.salesline;";
        return con.Read(sql);
    }
    
    public ResultSet getSaleslineByID(){
        String sql = "SELECT * FROM public.salesline WHERE saleslineid = " + getSaleslineid() + ";";
        return con.Read(sql);
    }
    
    public ResultSet getSaleslineByQuantity(){
        String sql = "SELECT * FROM public.salesline WHERE quantity LIKE '"+ getQuantity() +"%'";
        return con.Read(sql);
    }
    
}
