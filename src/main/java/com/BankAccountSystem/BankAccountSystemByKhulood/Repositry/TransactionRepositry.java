package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Loan;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TransactionRepositry extends JpaRepository<Transaction,Integer> {
    @Query("Select t from Transaction t")
    List<Transaction> getAllTransaction();

    @Query("SELECT t from Transaction t where t.id =:transactionId")
    Transaction getTransactionById(@Param("transactionId")Integer id);

    @Query(value = "SELECT t from Transaction t where t.isActive = true")
    List<Transaction> getAllActiveTransaction();

    @Query(value = "SELECT t from Loan t where t.isActive = false")
    List<Transaction> getAllInActiveTransaction();
}
