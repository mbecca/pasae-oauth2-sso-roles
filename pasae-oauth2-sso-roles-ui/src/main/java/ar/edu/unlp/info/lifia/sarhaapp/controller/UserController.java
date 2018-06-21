package ar.edu.unlp.info.lifia.sarhaapp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlp.info.lifia.sarhaapp.dto.UserDTO;

@RestController
@RequestMapping("/ui/user")
public class UserController {

	@Autowired
	private OAuth2RestTemplate restTemplate;

	@Value("${resource-server}/user")
	private String userURL;

	private OAuth2RestTemplate getRestTemplate() {
		return restTemplate;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value = "list")
	public Collection<UserDTO> list() {
		final ResponseEntity<Collection> forEntity = getRestTemplate().getForEntity(userURL + "/list",
				Collection.class);
		return forEntity.getBody();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value = "listByAdmin")
	public Collection<UserDTO> listAdmin() {
		final ResponseEntity<Collection> forEntity = getRestTemplate().getForEntity(userURL + "/listByAdmin",
				Collection.class);
		return forEntity.getBody();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value = "listByGuest")
	public Collection<UserDTO> listByGuest() {
		final ResponseEntity<Collection> forEntity = getRestTemplate().getForEntity(userURL + "/listByGuest",
				Collection.class);
		return forEntity.getBody();
	}

}
