/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject.oop;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;



public class MyprojectOOP {
    
    public static Connection conn(){
      try{
          String url = "jdbc:mysql://localhost:3306/MyLoginDatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
          String user = "admin";
          String password = "admin";
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection(url, user, password);
          return conn;
          
      }catch(SQLException|ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, e);
      }
       return null;
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login LoginFrame = new Login();
        LoginFrame.setVisible (true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
    
}
