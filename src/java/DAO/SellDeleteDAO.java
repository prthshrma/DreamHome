package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class SellDeleteDAO 
{
        public int deleteSellData(DTO selldelDTO)
        {
        int i=0;
        try
        {
            String registry=selldelDTO.getRegistry();
            
            Statement st=DBConnector.getStatement();
            
            String query="delete from sellregistration where registry='"+registry+"'";
            
            i=st.executeUpdate(query);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return i;
        }
}
