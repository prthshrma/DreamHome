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
public class ProfileUpdateDAO 
{
    public int updateProfileData(DTO profileupdateDTO)
    {
        int i=0;
        try
        {
            String phone=profileupdateDTO.getPhone();
            String houseno=profileupdateDTO.getHouseno();
            String colony=profileupdateDTO.getColony();
            String landmark=profileupdateDTO.getLandmark();
            String city=profileupdateDTO.getCity();
            String state=profileupdateDTO.getState();
            String pin=profileupdateDTO.getPin();
            String username=profileupdateDTO.getUsername();
            
            Connection con=DBConnector.getConnection();
            PreparedStatement pst=con.prepareStatement("update registration set phone='"+phone+"',houseno='"+houseno+"',colony='"+colony+"',landmark='"+landmark+"',"
                    + "city='"+city+"',state='"+state+"',pin='"+pin+"' where username='"+username+"'");
            
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