package com.kj.toolify.models;

import java.sql.*;
import javax.swing.JOptionPane;

public class baseModel {
    public Connection con;
    public Statement stm;
    
    public void config(){
        try {
            String dbUrl = "jdbc:postgresql://localhost/Toolify";
            String dbUser = "postgres";
            String dbPassword = "1234";
            
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword); 
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal ");
        }
    }
}
