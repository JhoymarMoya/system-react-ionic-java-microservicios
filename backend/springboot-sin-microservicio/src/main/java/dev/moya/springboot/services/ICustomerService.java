package dev.moya.springboot.services;

import dev.moya.springboot.entities.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
