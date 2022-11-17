package com.example.douirifarouk.services;

import com.example.douirifarouk.entity.Stock;

import java.util.List;

public interface StockServiceInt {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);

}
