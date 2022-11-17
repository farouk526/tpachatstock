package com.example.douirifarouk.repository;

import com.example.douirifarouk.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
