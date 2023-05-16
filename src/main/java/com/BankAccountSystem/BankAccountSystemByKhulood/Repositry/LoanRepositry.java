package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LoanRepositry extends JpaRepository<Loan,Integer> {
    @Query("Select l from Loan l")
    List<Loan> getAllLoan();

    @Query("SELECT l from Loan l where l.id =:loanId")
    Loan getLoantById(@Param("loanId")Integer id);

    @Query(value = "SELECT l from Loan l where l.isActive = true")
    List<Loan> getAllActiveLoan();

    @Query(value = "SELECT l from Loan l where l.isActive = false")
    List<Loan> getAllInActiveLoan();

}
