package com.BankAccountSystem.BankAccountSystemByKhulood.Controller;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Loan;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import com.BankAccountSystem.BankAccountSystemByKhulood.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @RequestMapping(value = "getAllTransaction", method = RequestMethod.GET)
    public List<Transaction> getAllTransaction() {
        List<Transaction> transactions = transactionService.getAllTransaction();

        return transactions;
    }
    @RequestMapping(value = "getTransactionById", method = RequestMethod.GET)
    public Transaction getTransactionById(@RequestParam Integer transactionId) {
        Transaction transaction = transactionService.getTransactionById(transactionId);
        return transaction;
    }
    @RequestMapping(value = "getAllActiveTransaction")
    public List<Transaction> getAllActiveLoan() {
        List<Transaction> activeTransactionList = transactionService.getAllActiveTransaction();
        return activeTransactionList;
    }
    @RequestMapping(value = "getAllInActiveTransaction")
    public List<Transaction> getAllInActiveTransaction() {
        List<Transaction> inActiveTransactionList = transactionService.getAllInActiveTransaction();
        return inActiveTransactionList;
    }
}
