package io.javabrains.springsecurityjpamysql.repository;

import io.javabrains.springsecurityjpamysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByusername(String username);
}
