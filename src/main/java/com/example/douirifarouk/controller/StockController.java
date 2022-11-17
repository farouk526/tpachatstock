package com.example.douirifarouk.controller;

import com.example.douirifarouk.entity.Stock;
import com.example.douirifarouk.services.StockServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RequestMapping("/stock")
@RestController

public class StockController {
    @Autowired
    StockServiceInt stockServiceInt;

    @GetMapping("/retrieveAllStocks")
    public List<Stock> retrieveAllStocks()
    {
        return stockServiceInt.retrieveAllStocks();
    }

    @PostMapping("/addStock")
    public Stock addStock( @RequestBody Stock s )
    {
        return stockServiceInt.addStock(s) ;
    }


    @PutMapping("/updateStock")
    public Stock updateStock(@RequestBody Stock u)
    {
        return stockServiceInt.updateStock(u);
    }

    @GetMapping("/{id}")
    public Stock retrieveStock(@PathVariable Long id){
        return stockServiceInt.retrieveStock(id);
    }
    }









