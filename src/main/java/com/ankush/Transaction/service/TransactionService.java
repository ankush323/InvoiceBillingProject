package com.ankush.Transaction.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.ankush.Transaction.model.Transaction;
import com.ankush.Transaction.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository transactionrepo;

	public List<Transaction> getALlTransaction() {
		return transactionrepo.findAll();
	}

	public List<Transaction> getAllTransactionBytransactionType(String type){
		return transactionrepo.findAllTransactionByUsingType(type);
	}

	public Map<String, BigDecimal> totalAmountUseTransactionType(String type, int id){

		return transactionrepo.findTotalTransactionAmount(type, id);
	}

}

