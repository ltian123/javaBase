package day34.三层架构.service;

import day34.三层架构.User;
import day34.三层架构.database.*;
public class UserServiceImpl implements UserService{
	USerDao ud = new UserDAOImpl();
	@Override
	public boolean login(User user) {
		
		return ud.checkUser(user);
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
