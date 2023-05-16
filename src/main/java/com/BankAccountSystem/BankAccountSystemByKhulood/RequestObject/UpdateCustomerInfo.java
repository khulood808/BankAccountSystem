package com.BankAccountSystem.BankAccountSystemByKhulood.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class UpdateCustomerInfo {
    Integer id;
    String name;
    String email;
    Integer phone;
    Boolean isActive;
}
