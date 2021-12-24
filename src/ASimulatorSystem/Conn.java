package ASimulatorSystem;

import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
           // c =DriverManager.getConnection("jdbc:mysql:///project2","root","");
          c =DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?useSSL=false","root","");
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  