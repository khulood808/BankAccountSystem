package com.BankAccountSystem.BankAccountSystemByKhulood.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data

public class CreditCard extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String creditCardHolder;
    String getCreditCardType;
    @ManyToOne
    @JoinColumn(name ="customer_id",referencedColumnName = "id")
    Customer customer;


//    public CreditCard(Integer id, String creditCardHolder, String getCreditCardType) {
//        this.id = id;
//        this.creditCardHolder = creditCardHolder;
//        this.getCreditCardType = getCreditCardType;
//    }
}
