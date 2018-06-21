package ar.edu.unlp.pasae.pasaepractica.controller;

import java.util.Collection;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlp.pasae.pasaepractica.annotations.IsStudent;
import ar.edu.unlp.pasae.pasaepractica.dto.UserDTO;
import ar.edu.unlp.pasae.pasaepractica.service.UserService;

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

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "listForAdmin")
	public Collection<UserDTO> listForAdmin() {
		return getUserService().getAllUsers();
	}

	@IsStudent
	@GetMapping(value = "listForStudent")
	public Collection<UserDTO> listForStudent() {
		return getUserService().getAllUsers();
	}

}
