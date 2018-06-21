package ar.edu.unlp.pasae.pasaepractica.factories;

import java.util.Collection;
import java.util.List;

import ar.edu.unlp.pasae.pasaepractica.dto.UserDTO;
import ar.edu.unlp.pasae.pasaepractica.entities.User;

/**
 * Clase que representa a la interfaz de la fábrica de DTO's
 *
 * @author mbecca
 *
 */
public interface IFactoryDTO {

	Collection<UserDTO> convertToDTOUser(List<User> all);

}
