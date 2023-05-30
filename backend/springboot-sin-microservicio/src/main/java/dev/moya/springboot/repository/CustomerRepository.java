package dev.moya.springboot.repository;

import dev.moya.springboot.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    //se pasa el entities (customer y el tipo del id 'Long'
}
