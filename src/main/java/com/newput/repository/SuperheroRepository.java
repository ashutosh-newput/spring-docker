package com.newput.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newput.entity.Superhero;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
}
