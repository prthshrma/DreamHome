/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.ProfileUpdateDAO;
import DAO.SellUpdateDAO;
import DAO.ToletUpdateDAO;
import DTO.DTO;

/**
 *
 * @author HP
 */
public class UpdateAuthentication 
{
    public boolean istoletUpdate(DTO toletupdateDTO)
    {
        ToletUpdateDAO dao=new ToletUpdateDAO();
        int i=dao.updateToletData(toletupdateDTO);
        
        if(i>0)
            return true;
        else
            return false;
    }
    
    public boolean issellUpdate(DTO sellupdateDTO)
    {
        SellUpdateDAO dao=new SellUpdateDAO();
        int i=dao.updateSellData(sellupdateDTO);
        
        if(i>0)
            return true;
        else
            return false;
    }
    
    public boolean isprofileUpdate(DTO profileupdateDTO)
    {
        ProfileUpdateDAO dao=new ProfileUpdateDAO();
        int i=dao.updateProfileData(profileupdateDTO);
        
        if(i>0)
            return true;
        else
            return false;
    }
}
