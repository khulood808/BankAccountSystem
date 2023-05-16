package com.BankAccountSystem.BankAccountSystemByKhulood.Service;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Customer;
import com.BankAccountSystem.BankAccountSystemByKhulood.Repositry.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepositry customerRepositry;

    public List<Customer> getAllCustomer() {

        return customerRepositry.getAllCustomer();
    }
    public Customer getCustomerById(Integer customerId) {
        Customer customer = customerRepositry.getCustomerById(customerId);
        return customer;
    }

    public List<Customer> getAllActiveCustomers() {

        return customerRepositry.getAllActiveCustomer();
    }
    public List<Customer> getAllInActiveCustomer() {

        return customerRepositry.getAllInActiveCustomer();
    }
    public void addCustomer(Customer customer){
        Customer customerInfo = new Customer();
        customerInfo.setCustomerName(customer.getCustomerName());
        customerInfo.setCustomerEmail(customer.getCustomerEmail());
        customerInfo.setCustomerPhoneNumber(customer.getCustomerPhoneNumber());
        customerInfo.setIsActive(customer.getIsActive());
        customerRepositry.save(customerInfo);
    }
}
