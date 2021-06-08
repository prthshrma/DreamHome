package Model;

import DAO.SellDeleteDAO;
import DAO.ToletDeleteDAO;
import DTO.DTO;
/**
 *
 * @author HP
 */
public class DeleteAuthentication 
{
    public boolean istoletDelete(DTO toletdelDTO)
    {
        ToletDeleteDAO dao=new ToletDeleteDAO();
        int i=dao.deleteToletData(toletdelDTO);
        
        if(i>0)
            return true;
        else
            return false;
    }
    
    public boolean issellDelete(DTO selldelDTO)
    {
        SellDeleteDAO dao=new SellDeleteDAO();
        int i=dao.deleteSellData(selldelDTO);
        
        if(i>0)
            return true;
        else
            return false;
    }
    
    
}
