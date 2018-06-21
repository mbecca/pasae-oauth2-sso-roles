package ar.edu.unlp.info.lifia.sarhaapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unlp.info.lifia.sarhaapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
