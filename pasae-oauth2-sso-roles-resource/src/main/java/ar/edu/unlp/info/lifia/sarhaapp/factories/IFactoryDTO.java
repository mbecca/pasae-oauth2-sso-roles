package ar.edu.unlp.info.lifia.sarhaapp.factories;

import java.util.Collection;
import java.util.List;

import ar.edu.unlp.info.lifia.sarhaapp.dto.UserDTO;
import ar.edu.unlp.info.lifia.sarhaapp.entities.User;

/**
 * Clase que representa a la interfaz de la fábrica de DTO's
 *
 * @author mbecca
 *
 */
public interface IFactoryDTO {

	Collection<UserDTO> convertToDTOUser(List<User> all);

}
