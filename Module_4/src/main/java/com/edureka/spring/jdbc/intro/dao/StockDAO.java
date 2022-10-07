package com.edureka.spring.jdbc.intro.dao;

import java.util.List;

import com.edureka.spring.jdbc.intro.bean.Stock;

/**
 * @author nitish.gupta_spicemo
 */
public interface StockDAO {
	public void insertStock(List<Stock> stockList);
}
