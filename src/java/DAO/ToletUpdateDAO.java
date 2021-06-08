package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class ToletUpdateDAO 
{
    public int updateToletData(DTO toletupdateDTO)
    {
        int i=0;
        try
        {
            String registry=toletupdateDTO.getRegistry();
            
            String propertyage=toletupdateDTO.getPropertyage();
            String description=toletupdateDTO.getDescription();
            String preference=toletupdateDTO.getPreference();
            String rent=toletupdateDTO.getRent();
            
            Connection con=DBConnector.getConnection();
            PreparedStatement pst=con.prepareStatement("update toletregistration set propertyage='"+propertyage+"',description='"+description+"',preference='"+preference+"',rent='"+rent+"' where registry='"+registry+"'");
            
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
