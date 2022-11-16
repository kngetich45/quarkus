package org.customer.service.repository;

public class CustomerException extends RuntimeException {
    public CustomerException(){
        super();
    }
    public CustomerException(String customer_not_found) {
        super(customer_not_found);
    }
}
