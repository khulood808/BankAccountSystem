package com.BankAccountSystem.BankAccountSystemByKhulood.Controller;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.CreditCard;
import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Transaction;
import com.BankAccountSystem.BankAccountSystemByKhulood.Service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="creditCard")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;
    @RequestMapping(value = "getAllCreditCard", method = RequestMethod.GET)
    public List<CreditCard> getAllCreditCard() {
        List<CreditCard> creditCards = creditCardService.getAllCreditCard();

        return creditCards;
    }
    @RequestMapping(value = "getCreditCardById", method = RequestMethod.GET)
    public CreditCard getCreditCardById(@RequestParam Integer creditCardId) {
        CreditCard creditCard = creditCardService.getCreditCardById(creditCardId);
        return creditCard;
    }
    @RequestMapping(value = "getAllActiveCreditCard")
    public List<CreditCard> getAllActiveCreditCard() {
        List<CreditCard> activeCreditCardList = creditCardService.getAllActiveCreditCard();
        return activeCreditCardList;
    }
    @RequestMapping(value = "getAllInActiveCreditCard")
    public List<CreditCard> getAllInActiveCreditCard() {
        List<CreditCard> inActiveCreditCardList = creditCardService.getAllInActiveCreditCard();
        return inActiveCreditCardList;
    }
}
