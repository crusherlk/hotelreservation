/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Crusher
 */
public class dbconnect 
{
    public static Connection connect()
    {
        Connection con=null;
        try{
            String dbpath="jdbc:mysql://localhost/javafinal";
            con=(Connection) DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
