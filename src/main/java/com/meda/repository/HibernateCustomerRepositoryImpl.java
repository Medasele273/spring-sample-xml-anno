package com.meda.repository;

import com.meda.model.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository{

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer1 = Customer.builder()
                .withFirstName("Medhanie")
                .withLastName("Weldeab")
                .build();

        customers.add(customer1);

        return customers;
    }
}
