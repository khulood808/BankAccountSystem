package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Customer;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.AccountRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepositry accountRepositry;

    public List<Account> getAllAccount() {

        return accountRepositry.getAllAccount();
    }
    public Account getCustomerById(Integer accountId) {
        Account account = accountRepositry.getAccountById(accountId);
        return account;
    }

    public List<Account> getAllActiveAccount() {

        return accountRepositry.getAllActiveAccount();
    }
    public List<Account> getAllInActiveAccount() {

        return accountRepositry.getAllInActiveAccount();
    }
}
