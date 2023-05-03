package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.CreditCard;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CreditCardRepositry extends JpaRepository<CreditCard,Integer> {
    @Query("Select cc from CreditCard cc")
    List<CreditCard> getAllCreditCard();

    @Query("SELECT cc from CreditCard cc where cc.id =:creditCardId")
    CreditCard getCreditCardById(@Param("creditCardId")Integer id);

    @Query(value = "SELECT cc from CreditCard cc where cc.isActive = true")
    List<CreditCard> getAllActiveCreditCard();

    @Query(value = "SELECT cc from CreditCard cc where cc.isActive = false")
    List<CreditCard> getAllInActiveCreditCard();
}

