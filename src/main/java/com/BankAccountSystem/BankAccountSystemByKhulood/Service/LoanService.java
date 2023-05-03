package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Loan;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.AccountRepositry;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.LoanRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepositry loanRepositry;

    public List<Loan> getAllLoan() {

        return loanRepositry.getAllLoan();
    }
    public Loan getLoanById(Integer loanId) {
        Loan loan = loanRepositry.getLoantById(loanId);
        return loan;
    }

    public List<Loan> getAllActiveLoan() {

        return loanRepositry.getAllActiveLoan();
    }
    public List<Loan> getAllInActiveLoan() {

        return loanRepositry.getAllInActiveLoan();
    }
}
