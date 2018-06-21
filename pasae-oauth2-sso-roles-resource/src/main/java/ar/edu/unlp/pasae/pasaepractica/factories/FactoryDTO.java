package ar.edu.unlp.pasae.pasaepractica.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import ar.edu.unlp.pasae.pasaepractica.dto.UserDTO;
import ar.edu.unlp.pasae.pasaepractica.entities.User;

/**
 * Clase que representa a la implementación de la fábrica de DTO's
 *
 * @author mbecca
 *
 */
@Component
public final class FactoryDTO implements IFactoryDTO {

	private static <A, R> Collection<R> createCollections(final Collection<A> col, final Function<A, R> function,
			final Collection<R> result) {
		col.stream().map(s -> function.apply(s)).forEach(result::add);
		return result;
	}

	@Override
	public Collection<UserDTO> convertToDTOUser(List<User> all) {
		return createCollections(all, this::convertToUserDTO, new ArrayList<>());
	}

	public UserDTO convertToUserDTO(User user) {
		return new UserDTO(user.getId(), user.getUsername());
	}

}
