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
public class SellRegistrationDAO 
{
    public int registersellProperty(DTO property)
    {
        int i=0;
        try
        {
            Connection con=DBConnector.getConnection();
            
            String regisrty=property.getRegistry();
            String owner=property.getOwner();
            String configuration=property.getConfiguration();
            String type=property.getType();
            String builtuparea=property.getBuiltuparea();
            String propertyage=property.getPropertyage();
            String houseno=property.getHouseno();
            String colony=property.getColony();
            String landmark=property.getLandmark();
            String city=property.getCity();
            String state=property.getState();
            String pin=property.getPin();
            String description=property.getDescription();
            int price=Integer.parseInt(property.getPrice());
            double latitude=Double.parseDouble(property.getLatitude());
            double longitude=Double.parseDouble(property.getLongitude());
            String image=property.getImage();
            String username=property.getUsername();
            String status=property.getStatus();
            
            
            PreparedStatement pst=con.prepareStatement("insert into sellregistration values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, username);
            pst.setString(2, regisrty);
            pst.setString(3, owner);
            pst.setString(4, type);
            pst.setString(5, configuration);
            pst.setString(6, builtuparea);
            pst.setString(7, propertyage);
            pst.setString(8, houseno);
            pst.setString(9, colony);
            pst.setString(10, landmark);
            pst.setString(11, city);
            pst.setString(12, state);
            pst.setString(13, pin);
            pst.setInt(14, price);
            pst.setString(15, description);
            pst.setString(16, status);
            pst.setDouble(17, latitude);
            pst.setDouble(18, longitude);
            
            i=pst.executeUpdate();

        }
        catch(SQLException e)
        { System.out.println(e);
        }
        
        return i;
    }
}
