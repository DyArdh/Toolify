package com.kj.toolify;

import com.kj.toolify.controller.baseController;
import com.kj.toolify.models.databaseModel;
import com.kj.toolify.views.loginMenu;

public class Main {
    public static void main(String[] args) {
        loginMenu login = new loginMenu();
        login.setVisible(true);
        
        try {
            baseController control = new databaseModel();
            control.enumRoles();
            control.enumKondisi();
            control.enumStatus();
            control.createTabelPeminjaman();
            control.createUserLogin();
            control.createUserData();
            control.createTabelAlat();
            
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan\n" + e.getMessage());
        }
    }
    
}
