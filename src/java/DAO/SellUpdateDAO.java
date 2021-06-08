package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class SellUpdateDAO 
{
    public int updateSellData(DTO sellupdateDTO)
    {
        int i=0;
        try
        {
            String registry=sellupdateDTO.getRegistry();
            
            String propertyage=sellupdateDTO.getPropertyage();
            String description=sellupdateDTO.getDescription();
            String price=sellupdateDTO.getPrice();
            
            Connection con=DBConnector.getConnection();
            PreparedStatement pst=con.prepareStatement("update sellregistration set propertyage='"+propertyage+"',description='"+description+"',price='"+price+"' where registry='"+registry+"'");
            
            i=pst.executeUpdate();
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        return i;
    }
}
