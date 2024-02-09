/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author Asus
 */
public class ConnectrionProvider {
    static Connection con = null;
    public static Connection getConnnection(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysqul://localhost:3306/NurceryManagement?useSSL=false","root","@sha#184del!$&_f");
    return con;
    }
    catch(Exception e){
    return null;
    }
    }
    
}
