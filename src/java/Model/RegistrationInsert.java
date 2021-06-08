package Model;

import DAO.UserRegistrationDAO;
import DTO.DTO;
import java.io.IOException;
public class RegistrationInsert 
{
    public boolean isRegistration(DTO user) throws IOException
    {
        UserRegistrationDAO userdao=new UserRegistrationDAO();
        int i=userdao.isInsert(user);
        if(i>0)
        {
            return true;
        }
        return false;
    }
}
