package com.BankAccountSystem.BankAccountSystemByKhulood.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter

public class Account extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Double balance;
    Integer accountNumber;
    Double interest;
    @ManyToOne
    @JoinColumn(name ="customer_id",referencedColumnName = "id")
    Customer customer;

}
