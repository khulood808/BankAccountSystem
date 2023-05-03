package com.BankAccountSystem.BankAccountSystemByKhulood.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter

@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    Date createDate;
    @UpdateTimestamp
    Date updateDate;
    Boolean isActive;

}
