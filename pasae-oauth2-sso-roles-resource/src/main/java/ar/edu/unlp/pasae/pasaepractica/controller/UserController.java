package ar.edu.unlp.pasae.pasaepractica.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping(value = "list")
	public Collection<UserDTO> list() {
		return getUserService().list();
	}

	@GetMapping(value = "listForAdmin")
	public Collection<UserDTO> listForAdmin() {
		return getUserService().listForAdmin();
	}

	@GetMapping(value = "listForStudent")
	public Collection<UserDTO> listForStudent() {
		return getUserService().listForStudent();
	}

}
