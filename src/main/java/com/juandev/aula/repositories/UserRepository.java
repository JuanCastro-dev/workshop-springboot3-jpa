package com.juandev.aula.repositories;

import com.juandev.aula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
