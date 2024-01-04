/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pelanggan;
import model.User;
import view.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Barry
 */
public class userController {
    private Login login;
    
    public userController(Login login){
        this.login = login;
    }
    
   
    public void login(){
        try {
        DBConn db = new DBConn();
        db.connect();
        String Username = login.getusernameField().getText();
        String Password = login.getpasswordField().getText();
        
        if(Username.isEmpty()){
            login.getusernameField().setText("*");
            return;
        }
        
        if(Password.isEmpty()){
            login.getpasswordField().setText("*");
            return;
        }
        
        String sql = "SELECT * FROM db_tubes.pelanggan WHERE username='"+Username+"' AND `password`='"+Password+"';";
        db.view(sql);
        int id = 0;
        while(db.rs.next()){
            id = db.rs.getInt(1);
        }
        
        if(id==0){
            System.out.println("GADA");
        } else {
            System.out.println("ADAA");
        }
        
        } catch (SQLException ex){
            System.out.println("Gaada");
        }
    }
    
    public void registrasi(){
        //Ambil semua data yang diperlukan
        DBConn db = new DBConn();
        db.connect();
        String Username = login.getusernameField().getText();
        String Password = login.getpasswordField().getText();
        String Email = login.getemailField().getText();
        String Telepon = login.getteleponField().getText();
        
        if(Email.isEmpty()){
            return;
        }
        
        
        System.out.println(Username);
        System.out.println(Password);
        
        //Masukkan ke database
        String sql = "INSERT INTO pelanggan (username,password,email,noTelepon) VALUES ('"+Username+"','"+Password+"','"+Email+"','"+Telepon+"')";
        db.Query(sql);
        
//        JOptionPane.showMessageDialog(null, "Akun Berhasil dibuat, Silakan coba login!");
//        Email.setVisible(false);
//        teleponField.setVisible(false);
//        jLabel3.setVisible(false);
//        jLabel5.setVisible(false);
//        usernameField.setText("");
//        passwordField.setText("");
        db.disconnect();
    }
    
}
