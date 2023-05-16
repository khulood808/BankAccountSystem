package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountRepositry extends JpaRepository<Account,Integer> {
    @Query("Select a from Account a")
    List<Account> getAllAccount();

    @Query("SELECT a from Account a where a.id =:accountId")
    Account getAccountById(@Param("accountId")Integer id);

    @Query(value = "SELECT a from Account a where a.isActive = true")
    List<Account> getAllActiveAccount();

    @Query(value = "SELECT a from Account a where a.isActive = false")
    List<Account> getAllInActiveAccount();

    @Query(value = "Select a.balance From Account a WHERE a.id = :id")
    Double getBalanceForAccount(@Param("id") Integer id);

    @Query(value = " select id from account where account_number=:accountNumber",nativeQuery = true)
    Integer getAccountByAccountNumber(@Param("accountNumber") Integer accountNumber);

    @Query(value = "Select a From Account a WHERE a.customer.id = :id")
    List<Account> getCustomerAccountInformation(@Param("id") Integer customerId);

}
