package ar.edu.unlp.pasae.pasaepractica.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlp.pasae.pasaepractica.dto.UserDTO;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private OAuth2RestTemplate restTemplate;

  @Value("${resource-server}/user")
  private String userURL;

  private OAuth2RestTemplate getRestTemplate() {
    return restTemplate;
  }

  @SuppressWarnings({
      "rawtypes", "unchecked"
  })
  @GetMapping(value = "list")
  public Collection<UserDTO> list() {
    final ResponseEntity<Collection> forEntity = getRestTemplate().getForEntity(userURL + "/list",
        Collection.class);
    return forEntity.getBody();
  }

  @SuppressWarnings({
      "rawtypes", "unchecked"
  })
  @GetMapping(value = "listForAdmin")
  public Collection<UserDTO> listForAdmin() {
    final ResponseEntity<Collection> forEntity = getRestTemplate().getForEntity(userURL + "/listForAdmin",
        Collection.class);
    return forEntity.getBody();
  }

  @SuppressWarnings({
      "rawtypes", "unchecked"
  })
  @GetMapping(value = "listForStudent")
  public Collection<UserDTO> listForStudent() {
    final ResponseEntity<Collection> forEntity = getRestTemplate().getForEntity(userURL + "/listForStudent",
        Collection.class);
    return forEntity.getBody();
  }

}
