package com.codeclan.example.Course.Booking.System.controllers;

import com.codeclan.example.Course.Booking.System.repositories.customersRepositries.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
}
