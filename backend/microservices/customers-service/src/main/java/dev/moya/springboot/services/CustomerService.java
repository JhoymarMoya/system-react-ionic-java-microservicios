package dev.moya.springboot.services;

import dev.moya.springboot.entities.Customer;
import dev.moya.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
        //trae lo de este repositori que esta acediendo a  customer
    }

    @Override
    public Customer getById(Long id) {
        return (Customer) repository.findById(id).get();
        //sin el get al final esta devolviendo un optional y con el get trae el customer
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

}
