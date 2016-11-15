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
    
    public boolean newUsers(){
        String sql = "INSERT INTO public.users(username,password,phone,neigborhood,zipcode,city,state,street,email,streetnumber,cellphone,gender)VALUES ('"+ getUsername() +"','"+ getPassword() +"','"+ getPhone() +"',"
                + "'"+ getNeigborhood() +"','"+ getZipcode() +"','"+ getCity() +"','"+ getState() +"','"+ getStreet() +"',"
                + "'"+ getEmail() +"','"+ getStreetnumber() +"','"+ getCellphone() +"','"+ getGender() +"');";
        if(con.Create(sql) == null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean updateCategory(){
        String sql = "UPDATE public.users SET username = '"+ getUsername() +"', password = '"+ getPassword() +"', phone = '"+ getPhone() +"', neigborhood = '"+ getNeigborhood() +"',"
                + " zipcode = '"+ getZipcode() +"', city = '"+ getCity() +"', state = '"+ getState() +"', street = '"+ getStreet() +"', email = '"+ getEmail() +"',"
                + " streetnumber = '"+ getStreetnumber() +"', cellphone = '"+ getCellphone() +"', gender = '"+ getGender() +"' WHERE userid = "+ getUserid() +";";
        if(con.Update(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deleteCategory(){
        String sql = "DELETE FROM public.users WHERE userid = " + getUserid() + ";";
        if(con.Delete(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    
    public ResultSet getUsers(){
        String sql = "SELECT * FROM public.users;";
        return con.Read(sql);
    }
    
    public ResultSet getUsersByID(){
        String sql = "SELECT * FROM public.users WHERE userid = " + getUserid() + ";";
        return con.Read(sql);
    }
    
    public ResultSet getCategoryByName(){
        String sql = "SELECT * FROM public.users WHERE username LIKE '"+ getUsername() +"%'";
        return con.Read(sql);
    }
    
    public ResultSet getLogin(){
        String sql = "SELECT * FROM public.users WHERE username = '"+ getUsername() +"' AND password = '"+ getPassword() +"';";
        return con.Read(sql);
    }
    
}
