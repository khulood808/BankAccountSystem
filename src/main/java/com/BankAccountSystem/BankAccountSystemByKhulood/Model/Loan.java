package com.BankAccountSystem.BankAccountSystemByKhulood.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@Data

public class Loan extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String loanName;
    Integer loanAmount;
    Date loanDate;
    @ManyToOne
    @JoinColumn(name ="customer_id",referencedColumnName = "id")
    Customer customer;

//    public Loan(Integer id, String loanName, Integer loanAmount, Date loanDate) {
//        this.id = id;
//        this.loanName = loanName;
//        this.loanAmount = loanAmount;
//        this.loanDate = loanDate;
//    }
}
