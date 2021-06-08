package Model;

import DAO.UserLoginDAO;
import DTO.DTO;

public class LoginAuthenticator 
{
    public boolean checkLogin(DTO user)
    {
        if(user.getUsername().equals("admin") && user.getPassword().equals("admin"))
        {            
            return true;
        }
        else
        {
            
        System.out.println(" not admin");
        String password=user.getPassword();
        
        UserLoginDAO login=new UserLoginDAO();
        String tablepassword=login.getPassword(user);
        if(password.equals(tablepassword))
        {
            return true;
        }
        return false;
        }
    }
}
