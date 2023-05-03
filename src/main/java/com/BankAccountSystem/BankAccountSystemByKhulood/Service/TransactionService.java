package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.TransactionRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepositry transactionRepositry;
    public List<Transaction> getAllTransaction() {

        return transactionRepositry.getAllTransaction();
    }
    public Transaction getTransactionById(Integer transactionId) {
        Transaction transaction = transactionRepositry.getTransactionById(transactionId);
        return transaction;
    }

    public List<Transaction> getAllActiveTransaction() {

        return transactionRepositry.getAllActiveTransaction();
    }
    public List<Transaction> getAllInActiveTransaction() {

        return transactionRepositry.getAllInActiveTransaction();
    }
}
