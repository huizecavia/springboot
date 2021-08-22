package com.matthijs.springboot.reisbureau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matthijs.springboot.reisbureau.controller.Reizen;

@Repository
public interface Reisrepo extends JpaRepository<Reizen, Integer> {

}
