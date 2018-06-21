package ar.edu.unlp.info.lifia.sarhaapp.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unlp.info.lifia.sarhaapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select username from User")
	public Collection<String> getAllUsernames();

}
