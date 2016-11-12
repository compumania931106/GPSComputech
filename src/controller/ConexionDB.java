/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VictorManuel
 */
public class ConexionDB {
    java.sql.Connection con;  //Driver
    java.sql.Statement st;  //Conecta
    java.sql.ResultSet rs;   //Procesa las consultas

    public ConexionDB() {
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Se cargo el driver");
        }catch(ClassNotFoundException e){
            System.out.println("No se pudo cargar el driver: " + e.toString());
        }
        
        try{
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gpscomputech","postgres", "postgres");
            System.out.println("Se establecion la conexion");
        }catch(SQLException e){
            System.out.println("No se pudo realizar la conexión: " + e.toString());
        }
    }
    
    public SQLException Create(String sql){
        System.out.println(sql);
        try{
            st = getCon().createStatement();
            st.execute(sql); //Procesa el query
            System.out.println("Se ejecutó el query");
            st.close();
            return null;
        }catch(SQLException e){
            return e;
        }
    }
    
    public ResultSet Read(String sql){
        try{
            st = getCon().createStatement();
            this.rs = st.executeQuery(sql);
        }catch(SQLException e){
            System.out.println("Entro al catch de Read: " + e.toString());
            return null;
        }
        return rs;
    }
    
    public int Update(String sql){
        int resultado = 0;
        try{
            st = getCon().createStatement();
            resultado = st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Error en la actualizacion");
        }
        return resultado;
    }
    
    public int Delete(String sql){
        int resultado = 0;
        try{
            st = getCon().createStatement();
            resultado = st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Error en la eliminacion" + e.toString());
        }
        return resultado;
    }
    
    

    public Connection getCon() {
        return con;
    }
    
    
    
    
}
