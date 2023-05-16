package com.BankAccountSystem.BankAccountSystemByKhulood.Controller;

import com.BankAccountSystem.BankAccountSystemByKhulood.Model.Customer;
import com.BankAccountSystem.BankAccountSystemByKhulood.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value="customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "getAllCustomer", method = RequestMethod.GET)
    public List<Customer> getAllCustomer() {
        List<Customer> customers = customerService.getAllCustomer();

        return customers;
    }
    @RequestMapping(value = "getCustomersById", method = RequestMethod.GET)
    public Customer getCustomerById(@RequestParam Integer customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        return customer;
    }
    @RequestMapping(value = "getAllActiveCustomer")
    public List<Customer> getAllActiveCustomer() {
        List<Customer> activeCustomersList = customerService.getAllActiveCustomers();
        return activeCustomersList;
    }
    @RequestMapping(value = "getAllInActiveCustomer")
    public List<Customer> getAllInActiveCustomer() {
        List<Customer> inActiveCustomersList = customerService.getAllInActiveCustomer();
        return inActiveCustomersList;
    }

    @RequestMapping(value = "addCustomer", method = RequestMethod.POST)
    public String addCustomer(@RequestBody Customer customer) {
        try {
            customerService.addCustomer(customer);
            return "Customer added Successfully";
        } catch (Exception e) {
            return "Customer added Failed";
        }
    }



}
