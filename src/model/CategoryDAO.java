/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ConexionDB;

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
        return con.Create(sql) == null;
    }
}
