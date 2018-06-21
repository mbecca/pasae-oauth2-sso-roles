package ar.edu.unlp.info.lifia.sarhaapp.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unlp.info.lifia.sarhaapp.dto.UserDTO;
import ar.edu.unlp.info.lifia.sarhaapp.entities.User;
import ar.edu.unlp.info.lifia.sarhaapp.factories.IFactoryDTO;
import ar.edu.unlp.info.lifia.sarhaapp.repositories.UserRepository;
import ar.edu.unlp.info.lifia.sarhaapp.service.UserService;

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

}
