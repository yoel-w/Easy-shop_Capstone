package org.yearup.service;


import org.springframework.stereotype.Service;
import org.yearup.models.Checkout;
import org.yearup.repository.CheckoutRepository;

@Service
public class CheckoutService {
    private CheckoutRepository checkoutRepository;

    public CheckoutService(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

//    public Checkout getCheckout(int userId) {
//        Checkout order = new Checkout();
//
//
//        return checkoutRepository.save(order);
//
//    }

}