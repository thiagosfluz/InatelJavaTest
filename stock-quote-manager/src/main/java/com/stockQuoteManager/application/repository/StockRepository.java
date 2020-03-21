package com.stockQuoteManager.application.repository;

import com.stockQuoteManager.application.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    Stock findByName(String name);
}
