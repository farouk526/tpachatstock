package com.example.douirifarouk.services;

import com.example.douirifarouk.entity.Stock;
import com.example.douirifarouk.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StockServiceImp implements StockServiceInt{
    @Autowired
    StockRepository stockRepository;
    public List<Stock> retrieveAllStocks()
    {

        return null;
    }

    @Override
    public Stock addStock(Stock s) {

        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepository.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {

        return stockRepository.findById(id).orElse(null);
    }
}
