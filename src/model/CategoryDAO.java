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
 * @author VictorManuel
 */
public class CategoryDAO extends Category{
    ConexionDB con;

    public CategoryDAO() {
        this.con = new ConexionDB();
    }
    
    public boolean newCategory(){
        String sql = "INSERT INTO public.category(categoryname)VALUES ('"+ getCategoryname() +"');";
        if(con.Create(sql) == null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean updateCategory(){
        String sql = "UPDATE public.category SET categoryname = '"+ getCategoryname() +"' WHERE categoryid = "+ getCategoryid() +";";
        if(con.Update(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deleteCategory(){
        String sql = "DELETE FROM public.category WHERE categoryid = " + getCategoryid() + ";";
        if(con.Delete(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    public ResultSet getCategorys(){
        String sql = "SELECT * FROM public.category;";
        return con.Read(sql);
    }
    
    public ResultSet getCategoryByID(){
        String sql = "SELECT * FROM public.category WHERE categoryid = " + getCategoryid() + ";";
        return con.Read(sql);
    }
    
    public ResultSet getCategoryByName(){
        String sql = "SELECT * FROM public.category WHERE categoryname LIKE '"+ getCategoryname() +"%'";
        return con.Read(sql);
    }
    
    
}
