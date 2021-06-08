package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.Part;

public class UserRegistrationDAO 
{
    public int isInsert(DTO user) throws FileNotFoundException, IOException
    {
        int i=0;
        try
        {
            System.out.println("Inside DAO");
            Connection con=DBConnector.getConnection();
        
            String phone=user.getPhone();
            String aadhar=user.getAadhar();
            String firstname=user.getFirstname();
            String lastname=user.getLastname();
            String houseno=user.getHouseno();
            String colony=user.getColony();
            String landmark=user.getLandmark();
            String city=user.getCity();
            String state=user.getState();
            String pin=user.getPin();
            //String profilephoto=user.getProfilephoto();
            //Part photo=user.getPhoto();
            String password=user.getPassword();
            String username=user.getUsername();
                        
            //FileInputStream fin=null;
            //File image=new File(profilephoto);
            
            PreparedStatement pst=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, firstname);
            pst.setString(2, lastname);
            pst.setString(3, houseno);
            pst.setString(4, colony);
            pst.setString(5, landmark);
            pst.setString(6, city);
            pst.setString(7, state);
            pst.setString(8, pin);
            pst.setString(9, phone);
            pst.setString(10, aadhar);
            pst.setString(11, username);
            pst.setString(12, password);
            
            //fin=new FileInputStream(image);
            //pst.setBinaryStream(13,(InputStream) fin,(int) (image.length()));
            
            i=pst.executeUpdate();
            
            //fin.close();
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return i;
    }
}
