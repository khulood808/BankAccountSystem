package com.BankAccountSystem.BankAccountSystemByKhulood.Controller;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Loan;
import com.BankAccountSystem.BankAccountSystemByKhulood.Service.AccountService;
import com.BankAccountSystem.BankAccountSystemByKhulood.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="loan")
public class LoanController {
    @Autowired
    LoanService loanService;

    @RequestMapping(value = "getAllLoan", method = RequestMethod.GET)
    public List<Loan> getAllLoan() {
        List<Loan> loan = loanService.getAllLoan();

        return loan;
    }
    @RequestMapping(value = "getLoanById", method = RequestMethod.GET)
    public Loan getLoanById(@RequestParam Integer loanId) {
        Loan loan = loanService.getLoanById(loanId);
        return loan;
    }
    @RequestMapping(value = "getAllActiveLoan")
    public List<Loan> getAllActiveLoan() {
        List<Loan> activeLoanList = loanService.getAllActiveLoan();
        return activeLoanList;
    }
    @RequestMapping(value = "getAllInActiveAccount")
    public List<Loan> getAllInActiveLoan() {
        List<Loan> inActiveLoanList = loanService.getAllInActiveLoan();
        return inActiveLoanList;
    }
}
