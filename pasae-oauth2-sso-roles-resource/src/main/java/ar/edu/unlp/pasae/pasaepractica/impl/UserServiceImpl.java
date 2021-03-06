package ar.edu.unlp.pasae.pasaepractica.impl;

import java.util.Collection;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import ar.edu.unlp.pasae.pasaepractica.annotations.IsStudent;
import ar.edu.unlp.pasae.pasaepractica.dto.UserDTO;
import ar.edu.unlp.pasae.pasaepractica.entities.User;
import ar.edu.unlp.pasae.pasaepractica.factories.IFactoryDTO;
import ar.edu.unlp.pasae.pasaepractica.repositories.UserRepository;
import ar.edu.unlp.pasae.pasaepractica.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private IFactoryDTO factoryDTO;

	@Override
	public Collection<String> getAllUsernames() {
		return getUserRepository().getAllUsernames();
	}

	@Override
	public Collection<UserDTO> getAllUsers() {
		final List<User> users = getUserRepository().findAll();
		return getFactoryDTO().convertToDTOUser(users);
	}

	private IFactoryDTO getFactoryDTO() {
		return factoryDTO;
	}

	private UserRepository getUserRepository() {
		return userRepository;
	}

	@Override
	@RolesAllowed("ROLE_USER")
	public Collection<UserDTO> list() {
		return getAllUsers();
	}

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Collection<UserDTO> listForAdmin() {
		return getAllUsers();
	}

	@Override
	@IsStudent
	public Collection<UserDTO> listForStudent() {
		return getAllUsers();
	}

}
