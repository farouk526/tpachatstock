package com.example.douirifarouk.repository;

import com.example.douirifarouk.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
