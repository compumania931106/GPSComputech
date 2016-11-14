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
 * @author AlainEmmanuel
 */
public class ClientDAO extends Client {

    ConexionDB con;

    public ClientDAO() {
        this.con = new ConexionDB();
    }

    public boolean newClient() {
        String sql = "INSERT INTO public.client(clientname,phone,neigborhood,zipcode,city,state,street,email,streetnumber,rfc,cellphone,gender)VALUES ('" + getClientname()+ "','" + getPhone() + "','" + getNeigborhood() + "','" + getZipcode() + "','" + getCity() + "','" + getState() + "','" + getStreet() + "','" + getEmail() + "','" + getStreetnumber() + "','" + getRfc() + "','" + getCellphone() + "','" + getGender() + "');";
        if (con.Create(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean updateClient(){
        String sql = "UPDATE public.client SET clientname = '"+ getClientname() + "',phone ='" + getPhone() + "',neigborhood ='" + getNeigborhood() + "',zipcode ='" + getZipcode() + "',city ='" + getCity() + "',state ='" + getState() + "',street ='" + getStreet() + "',email ='" + getEmail() + "',streetnumber ='" + getStreetnumber() + "',rfc ='" + getRfc() + "',cellphone ='" + getCellphone() + "',gender ='" + getGender() + "' WHERE clientid = "+ getClientid() +";";
        if(con.Update(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deleteClient(){
        String sql = "DELETE FROM public.client WHERE clientid = " + getClientid() + ";";
        if(con.Delete(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public ResultSet getClients(){
        String sql = "SELECT * FROM public.client;";
        return con.Read(sql);
    }
    
    public ResultSet getClientByID(){
        String sql = "SELECT * FROM public.client WHERE clientid = " + getClientid() + ";";
        return con.Read(sql);
    }
    
    public ResultSet getClientByName(){
        String sql = "SELECT * FROM public.client WHERE clientname LIKE '"+ getClientname() +"%'";
        return con.Read(sql);
    }

}
