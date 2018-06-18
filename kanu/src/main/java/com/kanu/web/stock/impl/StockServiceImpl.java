package com.kanu.web.stock.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanu.web.stock.StockService;

@Service("stockService")
public class StockServiceImpl implements StockService{
	@Autowired StockDAO dao;
	@Override
	public List<Map<String, Object>> getStockList() {
		// TODO Auto-generated method stub
		return dao.getStockList();
	}
	
}
