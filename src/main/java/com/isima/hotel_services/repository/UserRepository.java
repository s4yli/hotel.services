package com.isima.hotel_services.repository;

import com.isima.hotel_services.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}