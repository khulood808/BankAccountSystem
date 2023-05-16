package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
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

