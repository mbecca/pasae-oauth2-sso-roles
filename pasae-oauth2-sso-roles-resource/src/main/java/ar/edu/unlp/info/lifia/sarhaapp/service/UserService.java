package ar.edu.unlp.info.lifia.sarhaapp.service;

import java.util.Collection;

import ar.edu.unlp.info.lifia.sarhaapp.dto.UserDTO;

public interface UserService {

	Collection<String> getAllUsernames();

	Collection<UserDTO> getAllUsers();

}
