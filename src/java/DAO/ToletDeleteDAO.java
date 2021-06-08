package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author HP
 */
public class ToletDeleteDAO 
{
    public int deleteToletData(DTO toletdelDTO)
    {
        int i=0;
        try
        {
            String registry=toletdelDTO.getRegistry();
            
            Statement st=DBConnector.getStatement();
            
            String query="delete from toletregistration where registry='"+registry+"'";
            
            i=st.executeUpdate(query);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return i;
    }
}
