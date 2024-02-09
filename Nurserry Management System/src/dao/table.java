/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class table {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(11),adress varchar(200),password varchar(200),securotyQuiestion varchar(200),answer varchar(200),status varcar(200),UNIQUE (email))";
            DbOperation.setDataOrDelete(userTable, "User Table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
}
