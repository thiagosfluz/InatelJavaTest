package com.stockQuoteManager.application.service;

import com.stockQuoteManager.application.entity.Stock;
import com.stockQuoteManager.application.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;


    public Stock saveStock (Stock stock){

        return repository.save(stock);
    }

    public List<Stock> saveStock (List<Stock> stocks){

        return repository.saveAll(stocks);
    }

    public List<Stock> getStocks (){
        return repository.findAll();

    }

    public Stock getStockById (int id){
        return repository.findById(id).orElse(null);

    }

    public Stock getStocksByName (String name){
        return repository.findByName(name);

    }

    public String deleteStock(int id){

        repository.deleteById(id);

        return "Stock removed  || "+ id;
    }

    public Stock updateStock (Stock stock){
        Stock existingStock = repository.findById(stock.getId()).orElse(null);
        existingStock.setName(stock.getName());
        existingStock.setDate(stock.getDate());
        existingStock.setPrice(stock.getPrice());
        return repository.save(existingStock);


    }




}

