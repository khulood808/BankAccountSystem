package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Customer;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.AccountRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.CustomerRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.TransactionRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.RequestObject.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepositry accountRepositry;

    @Autowired
    CustomerRepositry customerRepositry;
    @Autowired
    TransactionRepositry transactionRepositry;

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

    public Account findIdByPhoneNumber(Integer accountId) {
        Account account = accountRepositry.getAccountById(accountId);
        return account;
    }

    public void addAccount(AccountRequest account){
        Double interestVariable = 2.5;
        Account accountInfo = new Account();
        accountInfo.setAccountNumber(account.getAccountNumber());
        accountInfo.setBalance(account.getBalance());
        accountInfo.setInterest(account.getBalance()* interestVariable);
        Integer id = customerRepositry.findIdByPhoneNumber(account.getPhoneNumber());
        Customer customerId = customerRepositry.findById(id).get();
        accountInfo.setCustomer(customerId);
        accountInfo.setIsActive(account.getIsActive());
        accountRepositry.save(accountInfo);
    }
}
