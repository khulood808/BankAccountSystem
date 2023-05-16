package com.BankAccountSystem.BankAccountSystemByKhulood.Controller;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Customer;
import com.BankAccountSystem.BankAccountSystemByKhulood.RequestObject.AccountRequest;
import com.BankAccountSystem.BankAccountSystemByKhulood.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "getAllAccount", method = RequestMethod.GET)
    public List<Account> getAllAccount() {
        List<Account> account = accountService.getAllAccount();

        return account;
    }
    @RequestMapping(value = "getAccountById", method = RequestMethod.GET)
    public Account getAccountById(@RequestParam Integer accountId) {
        Account account = accountService.getCustomerById(accountId);
        return account;
    }
    @RequestMapping(value = "getAllActiveCustomer")
    public List<Account> getAllActiveAccount() {
        List<Account> activeAccountList = accountService.getAllActiveAccount();
        return activeAccountList;
    }
    @RequestMapping(value = "getAllInActiveAccount")
    public List<Account> getAllInActiveAccount() {
        List<Account> inActiveAccountList = accountService.getAllInActiveAccount();
        return inActiveAccountList;
    }
    @RequestMapping(value = "addAccount", method = RequestMethod.POST)
    public String addAccount(@RequestBody AccountRequest account) {
        try {
            accountService.addAccount(account);
            return "Account added Successfully";
        } catch (Exception e) {
            return "Account added Failed";
        }


    }
}
