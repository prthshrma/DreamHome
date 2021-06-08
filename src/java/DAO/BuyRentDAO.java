package DAO;

import DB.DBConnector;
import java.util.ArrayList;
import DTO.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author HP
 */
public class BuyRentDAO 
{    
    public ArrayList<DTO> getBuyData(String type,String max,String city)
    {
        DTO dto=null;
        ArrayList<DTO> buylist=new ArrayList<DTO>();
        try
        {
            Statement st=DBConnector.getStatement();
            int maximum=Integer.parseInt(max);
           
            
            String query="Select registry,owner,houseno,colony,landmark,city,state,price from sellregistration where city='"+city+"' and type='"+type+"' and price<="+maximum;
            
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
             dto=new DTO();
                
            dto.setRegistry(rs.getString(1));
            dto.setOwner(rs.getString(2));
            dto.setHouseno(rs.getString(3));
            dto.setColony(rs.getString(4));
            dto.setLandmark(rs.getString(5));
            dto.setCity(rs.getString(6));
            dto.setState(rs.getString(7));
            dto.setPrice(rs.getString(8));
            
            buylist.add(dto); 
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return buylist;
    }
    
    public ArrayList<DTO> getOnrentData(String type,String max,String city)
    {
        DTO dto=null;
        ArrayList<DTO> onrentlist=new ArrayList<DTO>();
        try
        {
            Statement st=DBConnector.getStatement();
            int maximum=Integer.parseInt(max);
           
            
            String query="Select registry,owner,houseno,colony,landmark,city,state,rent from toletregistration where city='"+city+"' and type='"+type+"' and rent<="+maximum;
            
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
             dto=new DTO();
                
            dto.setRegistry(rs.getString(1));
            dto.setOwner(rs.getString(2));
            dto.setHouseno(rs.getString(3));
            dto.setColony(rs.getString(4));
            dto.setLandmark(rs.getString(5));
            dto.setCity(rs.getString(6));
            dto.setState(rs.getString(7));
            dto.setRent(rs.getString(8));
            
            onrentlist.add(dto); 
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return onrentlist;
    }
}
