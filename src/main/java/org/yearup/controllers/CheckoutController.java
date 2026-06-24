package org.yearup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yearup.models.Checkout;
import org.yearup.service.CheckoutService;
import org.yearup.service.UserService;

@RestController
@RequestMapping("/checkout")
@CrossOrigin

public class CheckoutController {
    private CheckoutService checkoutService;
    private UserService userService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService, UserService userService) {
        this.checkoutService = checkoutService;
        this.userService = userService;
    }

    @PostMapping
    @PreAuthorize("isAuthernticated()")
    public ResponseEntity<Checkout> addCheckout(Checkout checkout)
    {

        return ResponseEntity.status(HttpStatus.CREATED);
    }



}
