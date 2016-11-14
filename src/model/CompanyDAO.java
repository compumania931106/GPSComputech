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
public class CompanyDAO extends Company{
    ConexionDB con;

    public CompanyDAO() {
        this.con = new ConexionDB();
    }
    
    public boolean newCompany(){
        String sql = "INSERT INTO public.company(companyname, neighborhood, zipcode, city, state, region, street, streetnumber, phone, rfc) VALUES ('"+ getCompanyname() +"', '"+ getNeighborhood() +"', '"+ getZipcode() +"', '"+ getCity() +"', '"+ getState() +"', '"+ getRegion() +"', '"+ getStreet() +"', '"+ getStreetnumber() +"', '"+ getPhone() +"', '"+ getRfc() +"');";
        if(con.Create(sql) == null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean updateCompany(){
        String sql = "UPDATE public.company SET companyname='"+ getCompanyname() +"', neighborhood='"+ getNeighborhood() +"', zipcode='"+ getZipcode() +"', city='"+ getCity() +"', state='"+ getState() +"', region='"+ getRegion() +"', street='"+ getStreet() +"', streetnumber='"+ getStreetnumber() +"', phone='"+ getPhone() +"', rfc='"+ getRfc() +"' WHERE companyid"+ getCompanyid() +";";
        if(con.Update(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deleteCompany(){
        String sql = "DELETE FROM public.company WHERE companyid = " + getCompanyid()+ ";";
        if(con.Delete(sql) == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public ResultSet getCompanys(){
        String sql = "SELECT * FROM public.company;";
        return con.Read(sql);
    }
    
    public ResultSet getCompanyByID(){
        String sql = "SELECT * FROM public.company WHERE companyid = " + getCompanyid()+ ";";
        return con.Read(sql);
    }
    
    public ResultSet getCompanyByName(){
        String sql = "SELECT * FROM public.company WHERE companyname LIKE '"+ getCompanyname()+"%'";
        return con.Read(sql);
    }
    
    
}
