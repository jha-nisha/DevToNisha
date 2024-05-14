package user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import user.entities.Users;

@Service
public interface UserService {

	//create
	Users savUser(Users user);
	
	//get all users
	List<Users> getAllUsers();
	
	//get single user of given userId
	Users getUser(String userId);
}
