package com.summerSchool.firstProject.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summerSchool.firstProject.data.User;
import com.summerSchool.firstProject.entities.UserEntity;
import com.summerSchool.firstProject.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	private User mapEntityToUser(UserEntity userEntity) {
		User user = new User();
		user.setUsername(userEntity.getUsername());
		user.setPassword(userEntity.getPassword());
		return user;
	}

	public User getUserByUsername(String username) throws Exception {
		Optional<UserEntity> userEntity = userRepository.findByUsername(username);
		if (!userEntity.isPresent()) {
			throw new Exception("Utilizatorul cu username-ul " + username + " nu exista.");
		}
		return mapEntityToUser(userEntity.get());
	}

	public void createUser(User newUser) {

		UserEntity userEntity = new UserEntity();
		userEntity.setUsername(newUser.getUsername());
		userEntity.setPassword(newUser.getPassword());
		userRepository.saveAndFlush(userEntity);
	}
	
	/*public void verifyUser(User existentUser) {
		
		UserEntity userEntity = new UserEntity();
		if (userEntity.getUsername().equals(existentUser.getUsername()) && userEntity.getPassword().equals(existentUser.getPassword())) {
			System.out.println("User is correct");
		}
		else {
			System.out.println("User is incorrect");
		}
		
	}*/
	

	public void deleteUser(String username) {
		userRepository.deleteById(username);

	}

}
