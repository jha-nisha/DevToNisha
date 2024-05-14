package user.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.entities.Users;
import user.exception.ResourceNotFoundException;
import user.repositories.userRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired(required=true)
	private userRepo repository;

	@Override
	public Users savUser(Users user) {
		//generate uniqueId everytime
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return repository.save(user);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll() ;
	}

	@Override
	public Users getUser(String userId) {
		// TODO Auto-generated method stub
		return repository.findById(userId).orElseThrow(()->
		new ResourceNotFoundException("user with given id is not found on server" + userId));
	}

}
