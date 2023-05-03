package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.CreditCard;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.CreditCardRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepositry creditCardRepositry;
    public List<CreditCard> getAllCreditCard() {

        return creditCardRepositry.getAllCreditCard();
    }
    public CreditCard getCreditCardById(Integer creditCardId) {
        CreditCard creditCard = creditCardRepositry.getCreditCardById(creditCardId);
        return creditCard;
    }

    public List<CreditCard> getAllActiveCreditCard() {

        return creditCardRepositry.getAllActiveCreditCard();
    }
    public List<CreditCard> getAllInActiveCreditCard() {

        return creditCardRepositry.getAllInActiveCreditCard();
    }
}
