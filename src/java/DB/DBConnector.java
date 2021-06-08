package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnector 
{
    static Connection con=null;
    static PreparedStatement pst=null;
    static Statement st=null;
    static ResultSet rs=null;
    private DBConnector()
    {
    }
    
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreamhome", "root", "root");
            System.out.println("Connected");
            
            st=con.createStatement();
            
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public static Connection getConnection()
    { return con;
    }
    public static Statement getStatement()
    { return st;
    }    
    
}
