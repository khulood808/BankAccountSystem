package com.BankAccountSystem.BankAccountSystemByKhulood.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class TransactionRequest {
    private Double amount;
    private Integer accountNumber;
    private String isActive;
}
