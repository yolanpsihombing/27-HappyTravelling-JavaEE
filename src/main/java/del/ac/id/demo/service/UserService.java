package del.ac.id.demo.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import del.ac.id.demo.model.User;
import del.ac.id.demo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	List<User> getAllUsers();
	void saveUser(User user);
	User getUserById(long id);
	void deleteUserById(long id);
}
