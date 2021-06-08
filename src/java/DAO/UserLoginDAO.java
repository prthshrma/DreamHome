package DAO;

/**
 *
 * @author HP
 */
import DB.DBConnector;
import DTO.DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserLoginDAO 
{
    public String getPassword(DTO user)
    {
        String tablepassword=null;
        try
        {
            Connection con=DBConnector.getConnection();
            
            String username=user.getUsername();
            String password=user.getPassword();
            
            Statement st=DBConnector.getStatement();
            String query="select password from registration where username='"+username.trim()+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
               tablepassword=rs.getString(1);
            }
            
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return tablepassword;
    }
}
