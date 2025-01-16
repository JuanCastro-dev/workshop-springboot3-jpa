package com.juandev.aula.repositories;

import com.juandev.aula.entities.Category;
import com.juandev.aula.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
