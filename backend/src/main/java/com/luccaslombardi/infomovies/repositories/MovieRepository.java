package com.luccaslombardi.infomovies.repositories;

import com.luccaslombardi.infomovies.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
