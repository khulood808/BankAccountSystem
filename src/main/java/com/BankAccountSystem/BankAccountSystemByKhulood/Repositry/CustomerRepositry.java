package com.BankAccountSystem.BankAccountSystemByKhulood.Repositry;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepositry extends JpaRepository<Customer,Integer> {
    @Query("Select c from Customer c")
    List<Customer> getAllCustomer();

    @Query("SELECT c from Customer c where c.id =:customerId")
    Customer getCustomerById(@Param("customerId")Integer id);

    @Query(value = "SELECT c from Customer c where c.isActive = true")
    List<Customer> getAllActiveCustomer();

    @Query(value = "SELECT c from Customer c where c.isActive = false")
    List<Customer> getAllInActiveCustomer();

}
