package com.juandev.aula.repositories;

import com.juandev.aula.entities.OrderItem;
import com.juandev.aula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
