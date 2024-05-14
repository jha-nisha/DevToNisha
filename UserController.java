package controller.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.entities.Users;
import user.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	UserService service;
	//create
	@PostMapping
	public ResponseEntity<Users> createUer(@RequestBody Users users){
		
		Users user1 = service.savUser(users);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	//single user get
	@GetMapping("{/userId}")
	public ResponseEntity<Users> getStringUser(@PathVariable String userId){
		
		Users user = service.getUser(userId);
		
		return ResponseEntity.ok(user);
	}
	//all user get
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getAllUsers(){
		
		List<Users> allUser = service.getAllUsers();
		
		return ResponseEntity.ok(allUser);
	}
	

}
