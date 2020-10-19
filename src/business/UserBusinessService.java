package business;

import java.sql.SQLException;

import beans.User;
import data.UserDataInterface;
import data.UserDataService;





public class UserBusinessService implements UserServiceInterface<User>{

	
	
	@Override
	public boolean register(User user) {
		
		UserDataService UserDAO = new UserDataService();
		
		boolean result = UserDAO.create(user);
		
		return result;
		
	}

	@Override
	public boolean login(User user) 
	{
		UserDataService dao = new UserDataService();
		return dao.find(user);
	}
}
