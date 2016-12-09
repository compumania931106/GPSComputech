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
public class SaleDAO extends Sale {

    ConexionDB con;

    public SaleDAO() {
        this.con = new ConexionDB();
    }

    public boolean newSale() {
        String sql = "INSERT INTO public.sale(date,amount,userid,clientid)VALUES ('" + getDate() + "','" + getAmount() + "','" + getUserid() + "','" + getClientid() + "');";
        if (con.Create(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateSale() {
        String sql = "UPDATE public.sale SET date = '" + getDate() + "',amount ='" + getAmount() + "',userid ='" + getUserid() + "',clientid ='" + getClientid() + "' WHERE saleid = " + getSaleid() + ";";
        if (con.Update(sql) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteSale() {
        String sql = "DELETE FROM public.sale WHERE saleid = " + getSaleid() + ";";
        if (con.Delete(sql) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet getSales() {
        String sql = "SELECT * FROM public.sale;";
        return con.Read(sql);
    }

    public ResultSet getSaleByID() {
        String sql = "SELECT * FROM public.sale WHERE saleid = " + getSaleid() + ";";
        return con.Read(sql);
    }

    public ResultSet getSaleByDate() {
        String sql = "SELECT * FROM public.sale WHERE date = '" + getDate() + "';";
        return con.Read(sql);
    }

    public ResultSet getMaxid() {
        String sql = "select max(saleid) as saleid from public.Sale";
        return con.Read(sql);
    }
}
