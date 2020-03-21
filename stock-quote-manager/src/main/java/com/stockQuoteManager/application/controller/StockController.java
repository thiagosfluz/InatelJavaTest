package com.stockQuoteManager.application.controller;

import com.stockQuoteManager.application.entity.Stock;
import com.stockQuoteManager.application.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {


    @Autowired
    private StockService service;

    @PostMapping("/addStock")
    public Stock addStock(@RequestBody Stock stock){
        return service.saveStock(stock);
    }

    @PostMapping("/addStocks")
    public List<Stock> addStocks (@RequestBody  List<Stock> stocks){

        return service.saveStock(stocks);
    }

    @GetMapping("/stocks")
    public List<Stock> findAllStocks(){
        return service.getStocks();

    }

    @GetMapping("/stockById/{id}")
    public Stock findStocksById(@PathVariable int id){
        return service.getStockById(id);

    }

    @GetMapping("/stock/{name}")
    public Stock findStockByName(@PathVariable String name){
        return service.getStocksByName(name);
    }


    @PutMapping ("/update")
    public Stock updateStock (@RequestBody  Stock stock){

        return service.updateStock(stock);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStock(@PathVariable int id){
        return service.deleteStock(id);
    }



}

