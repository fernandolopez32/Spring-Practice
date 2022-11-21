package com.example.springpractice.repositories;

import com.example.springpractice.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long> {
}
