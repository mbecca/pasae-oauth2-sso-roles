package ar.edu.unlp.info.lifia.sarhaapp.controller;

import java.util.Collection;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlp.info.lifia.sarhaapp.dto.UserDTO;
import ar.edu.unlp.info.lifia.sarhaapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	private UserService getUserService() {
		return userService;
	}

	@RolesAllowed("ROLE_USER")
	@GetMapping(value = "list")
	public Collection<UserDTO> list() {
		return getUserService().getAllUsers();
	}

	@RolesAllowed("ROLE_ADMIN")
	@GetMapping(value = "listByAdmin")
	public Collection<UserDTO> listByAdmin() {
		return getUserService().getAllUsers();
	}

	@RolesAllowed("ROLE_GUEST")
	@GetMapping(value = "listByGuest")
	public Collection<UserDTO> listByGuest() {
		return getUserService().getAllUsers();
	}

}
