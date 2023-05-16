package com.BankAccountSystem.BankAccountSystemByKhulood.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AccountRequest {
    Double balance;
    Integer accountNumber;
    Integer phoneNumber;
    Boolean isActive;
}
