package com.kj.toolify.models;

import com.kj.toolify.controller.baseController;
import java.sql.*;

public class databaseModel implements baseController{

    @Override
    public void createUserLogin() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "CREATE TABLE IF NOT EXISTS user_login("+ 
                    "id_user SMALLSERIAL PRIMARY KEY," +
                    "username VARCHAR (30) NOT NULL," +
                    "password VARCHAR (20) NOT NULL," +
                    "roles roles NOT NULL" +
                    ")";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void createUserData() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "INSERT INTO user_login(username, password, roles)" +
                    "VALUES ('admin','admin','Admin')," + "('siswa', 'siswa', 'Siswa')";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
           System.out.println(e);
        } 
    }

    @Override
    public void createTabelPeminjaman() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "CREATE TABLE IF NOT EXISTS peminjaman("+ 
                    "id_peminjaman SMALLSERIAL PRIMARY KEY," +
                    "nama_siswa VARCHAR (30) NOT NULL," +
                    "kelas VARCHAR (20) NOT NULL," +
                    "nama_alat VARCHAR (30) NOT NULL," +
                    "jumlah INT NOT NULL," +
                    "kondisi_awal kondisi," +
                    "kondisi_akhir kondisi," +
                    "status_peminjaman status," +
                    "deskripsi TEXT" +
                    ")";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void createTabelAlat() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "CREATE TABLE IF NOT EXISTS alat("+ 
                    "id_alat SMALLSERIAL PRIMARY KEY," +
                    "nama_alat VARCHAR (30) NOT NULL," +
                    "merk VARCHAR (30) NOT NULL," +
                    "jumlah INT NOT NULL," +
                    "kondisi_alat kondisi NOT NULL"+")";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void enumRoles() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "CREATE TYPE roles AS ENUM('Admin', 'Siswa')";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void enumKondisi() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "CREATE TYPE kondisi AS ENUM('Baik', 'Rusak')";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void enumStatus() throws SQLException {
        baseModel DB = new baseModel();
        DB.config();
        Connection con = DB.con;
        Statement stat = DB.stm;
        
        try {
            String sql = "CREATE TYPE status AS ENUM('Sudah Dikembalikan', 'Belum Dikembalikan')";
            stat = con.createStatement();
            stat.execute(sql);
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
