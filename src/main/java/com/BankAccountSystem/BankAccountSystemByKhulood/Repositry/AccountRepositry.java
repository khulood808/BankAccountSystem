package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepositry extends JpaRepository<Account,Integer> {
    @Query("Select a from Account a")
    List<Account> getAllAccount();

    @Query("SELECT a from Account a where a.id =:accountId")
    Account getAccountById(@Param("accountId")Integer id);

    @Query(value = "SELECT a from Account a where a.isActive = true")
    List<Account> getAllActiveAccount();

    @Query(value = "SELECT a from Account a where a.isActive = false")
    List<Account> getAllInActiveAccount();

}
