package com.luccaslombardi.infomovies.repositories;

import com.luccaslombardi.infomovies.entities.Score;
import com.luccaslombardi.infomovies.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
