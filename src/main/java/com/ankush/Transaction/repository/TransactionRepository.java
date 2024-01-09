package com.ankush.Transaction.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ankush.Transaction.model.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	@Query("select u from Transaction u where u.transaction_type=:type")
	public List<Transaction> findAllTransactionByUsingType(@Param("type") String type);

	@Query(value = "select sum(details_transaction_amount) as sum from Transaction where transaction_type=:type and  this_account_id=:id", nativeQuery = true)
	public Map<String, BigDecimal> findTotalTransactionAmount(@Param("type") String type, @Param("id") int id);
}
