package org.yearup.models;


import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "first name")
    private String firstName;

    @Column(name = "last name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "shipping_amount")
    private String shippingAmount;


    public Checkout() {}


}


