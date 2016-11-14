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
public class RoleDAO extends Role {

    ConexionDB con;

    public RoleDAO() {
        this.con = new ConexionDB();
    }

    public boolean newRole() {
        String sql = "INSERT INTO public.role(rolename)VALUES ('" + getRolename() + "');";
        if (con.Create(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateRole() {
        String sql = "UPDATE public.role SET rolename = '" + getRolename() + "' WHERE roleid = " + getRoleid() + ";";
        if (con.Update(sql) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteRole() {
        String sql = "DELETE FROM public.role WHERE roleid = " + getRoleid() + ";";
        if (con.Delete(sql) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet getRoles() {
        String sql = "SELECT * FROM public.role;";
        return con.Read(sql);
    }

    public ResultSet getRoleByID() {
        String sql = "SELECT * FROM public.role WHERE roleid = " + getRoleid() + ";";
        return con.Read(sql);
    }

    public ResultSet getRoleByName() {
        String sql = "SELECT * FROM public.role WHERE rolename LIKE '" + getRolename() + "%'";
        return con.Read(sql);
    }

}
