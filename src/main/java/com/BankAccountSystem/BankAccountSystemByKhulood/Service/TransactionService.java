package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.AccountRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.TransactionRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.RequestObject.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepositry transactionRepositry;
    @Autowired
    AccountRepositry accountRepositry;


    public String addTransaction(TransactionRequest transactionRequest) {
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionRequest.getAmount());
        Integer id =accountRepositry.getAccountByAccountNumber(transactionRequest.getAccountNumber());
        Account account = accountRepositry.findById(id).get();
        transaction.setIsActive(account.getIsActive());
        transaction.setAccount(account);
        Double transactionAmount= transactionRequest.getAmount();
        Double accountBalance=account.getBalance();
        Double newBalance=accountBalance-transactionAmount;
        account.setBalance(newBalance);
        accountRepositry.save(account);
        transactionRepositry.save(transaction);
        return "Transaction done successfully";

    }


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
