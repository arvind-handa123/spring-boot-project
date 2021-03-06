package com.rahul.bank.rahulsavingbankaccountapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.bank.rahulsavingbankaccountapi.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	public Transaction findByAccountDetails(Long accountNumber);

}
