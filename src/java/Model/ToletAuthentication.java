package Model;

import DAO.ToletRegistrationDAO;
import DTO.DTO;
/**
 *
 * @author HP
 */
public class ToletAuthentication 
{
    public boolean isTolet(DTO property)
    {
        
        ToletRegistrationDAO toletdao=new ToletRegistrationDAO();
        int i=toletdao.registerProperty(property);
        if(i>0)
            return true;
        else
            return false;
    }
}
