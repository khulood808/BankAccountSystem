package com.BankAccountSystem.BankAccountSystemByKhulood.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data

public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "customer_name")
    String customerName;
    String customerEmail;
    Integer customerPhoneNumber;

//    public Customer(Integer id, String customerName, String customerEmail, Integer customerPhoneNumber) {
//        this.id = id;
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
//    }
}
