package com.labwork.sitespring.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private int number;

    private List<Order> orders = new ArrayList<>();

    public User() {

    }

    public User(final Long id, String firstname, String lastname, String email, int number, final List<Order> orders) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.number = number;
        this.orders = orders;
    }




    //Getter & Setter

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

}
