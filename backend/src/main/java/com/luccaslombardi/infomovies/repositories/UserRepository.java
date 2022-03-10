package com.luccaslombardi.infomovies.repositories;

import com.luccaslombardi.infomovies.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
