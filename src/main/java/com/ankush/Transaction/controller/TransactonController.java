package com.ankush.Transaction.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ankush.Transaction.exceptions.ResourceNotFoundException;
import com.ankush.Transaction.model.Transaction;
import com.ankush.Transaction.service.TransactionService;

@RestController
public class TransactonController {
	
	@Autowired
	TransactionService transactionservice;
   Logger logger=LoggerFactory.getLogger(TransactonController.class);
	@GetMapping("/transactiondetail")
	public List<Transaction> GetAll() {
		try {
			
		
		logger.error("fatel error");
		return transactionservice.getALlTransaction();
		}
		catch(Exception e)
		{
			logger.error("fatel error");
			return ;

		}
	}

	@GetMapping("/transactiondetails/{type}")
	public List<Transaction> getAllType(@Valid @PathVariable("type") String type) throws Exception {
		
		List<Transaction> list=new ArrayList<Transaction>();
		list=transactionservice.getAllTransactionBytransactionType(type);
	
		 if (list.isEmpty()) {
		        throw new  ResourceNotFoundException(type);

	}else
	{
			return list;
	}
	}

	@GetMapping("/transactiontotal/{type}/{id}")
	public Map<String, BigDecimal> byTransactionamont(@PathVariable("type") String type, @PathVariable("id") int id)throws Exception{
      Map<String,BigDecimal>map=transactionservice.totalAmountUseTransactionType(type, id);
      if(map.isEmpty())
      {
	        throw new ResourceNotFoundException(type);

      }else
      {
		return map;
	}
	}
}
