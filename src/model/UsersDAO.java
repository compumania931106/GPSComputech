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
 * @author victor
 */
public class UsersDAO extends Users{
    ConexionDB con;
    
    public UsersDAO() {
        this.con = new ConexionDB();
    }
    
    public ResultSet getLogin(){
        String sql = "SELECT * FROM public.users WHERE username = '"+ getUsername() +"' AND password = '"+ getPassword() +"';";
        return con.Read(sql);
    }
    
}
