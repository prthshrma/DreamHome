/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DBConnector;
import DTO.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AdminDAO {
    public ArrayList<DTO> getallToletData()
    {
        DTO dto=null;
        ArrayList<DTO> toletList=new ArrayList<DTO>();
        try
        {
            Statement st=DBConnector.getStatement();
            
            String query="Select username,owner,registry,status from toletregistration";
                    
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            dto=new DTO();
                
            dto.setUsername(rs.getString(1));
            dto.setOwner(rs.getString(2));
            dto.setRegistry(rs.getString(3));
            dto.setStatus(rs.getString(4));
            
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
            
            String query="Select username,owner,registry,status from sellregistration";
                    
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            dto=new DTO();
                
            dto.setUsername(rs.getString(1));
            dto.setOwner(rs.getString(2));
            dto.setRegistry(rs.getString(3));
            dto.setStatus(rs.getString(4));
            
            sellList.add(dto); 
            }         
        }
        catch(SQLException e)
        { System.out.println(e);
        }
        
        return sellList;
    }
    
}
