package ar.edu.unlp.pasae.pasaepractica.user;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Named
public class UserDetailsServiceImpl implements UserDetailsService {

	@Inject
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		final User user = this.getUserRepository().findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'", username));
		}
		return user;
	}

	private UserRepository getUserRepository() {
		return userRepository;
	}

}
