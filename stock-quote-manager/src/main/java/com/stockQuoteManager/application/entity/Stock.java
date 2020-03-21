package com.stockQuoteManager.application.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


// lombok automatic function
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "StockQuote_TBL")
public class Stock {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String date;
    private double price;



}
