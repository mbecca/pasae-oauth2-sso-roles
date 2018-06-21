package ar.edu.unlp.pasae.pasaepractica.service;

import java.util.Collection;

import ar.edu.unlp.pasae.pasaepractica.dto.UserDTO;

public interface UserService {

	Collection<String> getAllUsernames();

	Collection<UserDTO> getAllUsers();

	Collection<UserDTO> list();

	Collection<UserDTO> listForAdmin();

	Collection<UserDTO> listForStudent();

}
