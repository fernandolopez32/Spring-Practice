package com.example.springpractice.repositories;

import com.example.springpractice.models.NationalPark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParksRepository extends JpaRepository<NationalPark,Long> {
}
