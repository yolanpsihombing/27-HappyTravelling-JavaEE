package del.ac.id.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import del.ac.id.demo.model.User;
import del.ac.id.demo.service.UserService;
import del.ac.id.demo.web.dto.UserRegistrationDto;

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("listUsers", userService.getAllUsers());
		return "index";
	}
	
	@GetMapping("/user_baru")
	public String showNewUserForm() {
		return "user_baru";
	}
	
	@PostMapping("/registrationAdmin")
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/";
	}
	
	@GetMapping("/showForm/{id}")
	public String showFormUpdate(@PathVariable(value="id") long id, Model model) {
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "update_user";
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable (value="id") long id) {
		this.userService.deleteUserById(id);
		return "redirect:/";
	}
}
