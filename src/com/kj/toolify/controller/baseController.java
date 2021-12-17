package com.kj.toolify.controller;

import java.sql.SQLException;

public interface baseController {
    public void enumRoles() throws SQLException;
    public void enumKondisi() throws SQLException;
    public void enumStatus() throws SQLException;
    public void createUserLogin() throws SQLException;
    public void createUserData() throws SQLException;
    public void createTabelPeminjaman() throws SQLException;
    public void createTabelAlat() throws SQLException;
}
