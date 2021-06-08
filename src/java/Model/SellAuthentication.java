package Model;

import DAO.SellRegistrationDAO;
import DTO.DTO;

/**
 *
 * @author HP
 */
public class SellAuthentication 
{
    public boolean isSell(DTO property)
    {
        SellRegistrationDAO selldao=new SellRegistrationDAO();
        int i=selldao.registersellProperty(property);
        if(i>0)
            return true;
        else
            return false;
    }
}
