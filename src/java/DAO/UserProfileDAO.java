package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class UserProfileDAO 
{
    public DTO getuserData(String username)
    {
        DTO dto=null;
        Blob profile = null;
        byte[ ] profileData = null ;
                try
                    {
                        Connection con=DBConnector.getConnection();
                        Statement st=DBConnector.getStatement();
                    
                        String query="select * from registration where username='"+username+"'";
                    
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                            dto=new DTO();

                            dto.setFirstname(rs.getString(1));
                            dto.setLastname(rs.getString(2));
                            dto.setHouseno(rs.getString(3));
                            dto.setColony(rs.getString(4));
                            dto.setLandmark(rs.getString(5));
                            dto.setCity(rs.getString(6));
                            dto.setState(rs.getString(7));
                            dto.setPin(rs.getString(8));
                            dto.setPhone(rs.getString(9));
                            
                            profile=rs.getBlob(13);
                            
                            /*InputStream inputStream = profile.getBinaryStream();
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            byte[] buffer = new byte[4096];
                            int bytesRead = -1;
                            
                            while ((bytesRead = inputStream.read(buffer)) != -1) 
                            {
                                     outputStream.write(buffer, 0, bytesRead);                  
                            }
                            
                            byte[] imageBytes = outputStream.toByteArray();
                            String destination = Base64.getEncoder().encodeToString(imageBytes);

                            inputStream.close();
                            outputStream.close();
                            */
                            
                            profileData= profile.getBytes(1,(int)profile.length());
                            
                            //String destination="C:\\Users\\HP\\Desktop\\practice\\DreamHome\\web\\images\\"+username+".jpg";
                            //FileOutputStream fout=new FileOutputStream(destination);
                            //fout.write(profileData); 
                            
                            dto.setProfileData(profileData);
                        }
                    }
                catch(SQLException e)
                { System.out.println(e);
                }
                
        return dto;            
    }
    
    
    public ArrayList<DTO> getallToletData(String username)
    {
        DTO dto=null;
        ArrayList<DTO> toletList=new ArrayList<DTO>();
        try
        {
            Statement st=DBConnector.getStatement();
            
            String query="Select registry,rent,houseno,colony,landmark,city,state,status from toletregistration where username='"+username+"'";
                    
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            dto=new DTO();
                
            dto.setRegistry(rs.getString(1));
            dto.setRent(rs.getString(2));
            dto.setHouseno(rs.getString(3));
            dto.setColony(rs.getString(4));
            dto.setLandmark(rs.getString(5));
            dto.setCity(rs.getString(6));
            dto.setState(rs.getString(7));
            dto.setStatus(rs.getString(8));
            
            toletList.add(dto); 
            }         
        }
        catch(SQLException e)
        { System.out.println(e);
        }
        
        return toletList;
    }
    
    public ArrayList<DTO> getallSellData(String username)
    {
        DTO dto=null;
        ArrayList<DTO> sellList=new ArrayList<DTO>();
        try
        {
            Statement st=DBConnector.getStatement();
            
            String query="Select registry,price,houseno,colony,landmark,city,state,status from sellregistration where username='"+username+"'";
                    
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            dto=new DTO();
                
            dto.setRegistry(rs.getString(1));
            dto.setPrice(rs.getString(2));
            dto.setHouseno(rs.getString(3));
            dto.setColony(rs.getString(4));
            dto.setLandmark(rs.getString(5));
            dto.setCity(rs.getString(6));
            dto.setState(rs.getString(7));
            dto.setStatus(rs.getString(8));
            
            sellList.add(dto); 
            }         
        }
        catch(SQLException e)
        { System.out.println(e);
        }
        
        return sellList;
    }
}
